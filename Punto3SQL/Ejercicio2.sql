/* Ejercicio 2
Seleccionar los clientes que compran en el SUPERMERCADO “Exito” cuya compra supera los 
$150.000 mil pesos e imprimir todos los datos del cliente más el nombre del supermercado 
y el valor de venta, y ordenarlos descendentemente.
*/

SELECT cliente.ID_CLIENTE, NOMBRE_CLIENTE, APELLIDO_CLIENTE, CEDULA_CLIENTE
		TELEFONO_CLIENTE, DIRECCION, NOMBRE_SUPERMERCADO, VALOR_VENTA, COUNT(*) AS orden FROM
cliente JOIN factura ON cliente.ID_CLIENTE = factura.ID_CLIENTE
JOIN vendedor ON factura.ID_VENDEDOR = vendedor.ID_VENDEDOR
JOIN supermercado ON vendedor.ID_SUPERMERCADO = supermercado.ID_SUPERMERCADO
WHERE supermercado.NOMBRE_SUPERMERCADO = "Exito" AND factura.VALOR_VENTA > 150000
GROUP BY cliente.ID_CLIENTE, NOMBRE_CLIENTE, APELLIDO_CLIENTE, CEDULA_CLIENTE, TELEFONO_CLIENTE, DIRECCION, NOMBRE_SUPERMERCADO,
			VALOR_VENTA
ORDER BY orden DESC;
		