package prueba;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.String;

/**
 * Esta clase tiene como función retornar la fuma de los números enteros
 * encontrados en una cadena de texto.
 */
public class numerosDelString {


    private static ArrayList<Integer> enteros;

    /**
     * Función números: Recibe una cadena de texto y extrae los enteros encontrados 
     * y los suma para retornarlos.
     * @param cadena
     * @return
     */
    public static int numeros(String cadena){

        int sumaTotal = 0;
        enteros=new ArrayList<Integer>();

        //Acá se define el patrón de búsqueda
        //'\\d+' representa uno o más dígitos
        Pattern patronBusqueda = Pattern.compile("\\d+");
        Matcher matcher = patronBusqueda.matcher(cadena);

        //Mientras se encuentra un entero, lo agrega una variable y lo suma
        while (matcher.find()) {
            String numero = matcher.group();
            int integer = Integer.parseInt(numero);
            sumaTotal = sumaTotal + integer;
        
        }
        
        return sumaTotal;

    }

    /**
     * Función que recibe la cadena de texto y la envía
     * a la función numeros para ser procesada y retornar
     * su resultado
     * @param args
     */
    public static void main (String [ ] args) {

        System.out.println("Ingrese la cadena: ");
        Scanner obj = new Scanner(System.in);
        String cadena = obj.nextLine();
        System.out.println("La cadena es: "+cadena);

        int suma = numeros(cadena);
        System.out.println("La suma de todos los enteros es:"+ suma);
    }

}
