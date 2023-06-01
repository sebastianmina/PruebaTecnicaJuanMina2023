package prueba;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.lang.String;


public class numerosDelString {

    private static ArrayList<Integer> enteros;
    public static int numeros(String cadena){

        int sumaTotal = 0;
        enteros=new ArrayList<Integer>();
        Pattern patronBusqueda = Pattern.compile("\\d+");
        Matcher matcher = patronBusqueda.matcher(cadena);

        while (matcher.find()) {
            String numero = matcher.group();
            int integer = Integer.parseInt(numero);
            sumaTotal = sumaTotal + integer;
        
        }
        
        return sumaTotal;

    }


    public static void main (String [ ] args) {

        System.out.println("Ingrese la cadena: ");
        Scanner obj = new Scanner(System.in);
        String cadena = obj.nextLine();
        System.out.println("La cadena es: "+cadena);

        int suma = numeros(cadena);
        System.out.println("La suma de todos los enteros es:"+ suma);
    }

}
