/*Ejercicio 1
Consultar el supermercado que tenga más cantidad de productos con el tipo “CARNICOS” 
que han vendido hasta la fecha 31 de diciembre del 2013 retornando el nombre del supermercado, 
la cantidad, la descripción del tipo de supermercado y la fecha de venta.
*/

SELECT NOMBRE_SUPERMERCADO, count(*) AS cantidad , FECHA_VENTE,  DESCRIPCION_TIPO
	FROM supermercado JOIN vendedor ON supermercado.ID_SUPERMERCADO = vendedor.ID_SUPERMERCADO
    JOIN factura ON vendedor.ID_VENDEDOR = factura.ID_VENDEDOR
    JOIN producto ON factura.ID_PRODUCTO = producto.ID_PRODUCTO
    JOIN tipo_producto ON producto.ID_TIPO_PRODUCTO = tipo_producto.ID_TIPO_PRODUCTO
    WHERE DESCRIPCION_TIPO = "CARNICOS" AND FECHA_VENTE <= "2013-12-31"
    group by NOMBRE_SUPERMERCADO, FECHA_VENTE, DESCRIPCION_TIPO
    order by cantidad DESC
    LIMIT 1;