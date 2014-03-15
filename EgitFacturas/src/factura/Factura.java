package factura;

import java.util.Arrays;

/** 
 * <b>Clase que muestra los datos de una factura</b>  
 * 	 -<u>datos cliente y total</u>
 * 	 -<u>desglose de todas la lineas</u> de la factura 
 * 	  con producto, precio y cantidad
 * 
 * @author Juanra
 * @version 1.0 - 2014
 * @see LineaFactura
 * 
 * */

public class Factura {
	
	public String id_cliente;		// Identificador (codigo) del cliente
	public String nombre_cliente;	// Nombre del cliente
	
	public LineaFactura lineas[];	// lista de productos comprados
		
	/**
	 * Método constructor
	 * 
	 * @param idCliente -Identificador (codigo) del cliente
	 * @param nombreCliente  -  Nombre del cliente
	 * @param lineas - lista de productos comprados
	 */
	public Factura(String idCliente, String nombreCliente, LineaFactura[] lineas) {
		super();
		id_cliente = idCliente;
		nombre_cliente = nombreCliente;
		this.lineas = lineas;
	}

	
	/**
	 * Devuelve el <b>precio total de la Factura</b>, calculado a partir del precio de cada linea
	 * 
	 * @return precio - coste total de la factura
	 * @see LineaFactura#getTotal()
	 */
	public float getTotal(){
		float precio = 0;
		for (int i = 0; i < this.lineas.length; i++ ){
			precio += this.lineas[i].getTotal();
		}
		return precio;
	}
	
	
	 /** 
	 * {@inheritDoc}
	 **/
	
	@Override
	public String toString() {
		return "Factura [" 
		+ "id_cliente=" + id_cliente 		 
		+ ", nombre_cliente=" + nombre_cliente 
		+ ", getTotal()=" + getTotal()
		+ ", lineas=" + Arrays.toString(lineas)
		+ "]";
	}

	/**
	 * Método principal donde se crearan y mostraran las facturas
	 * 
	 * @see LineaFactura
	 **/
	public static void main(String[] args){
		
		System.out.println("Es proyecto java sigue el control de versiones" +
				"creado con GIT");
		
		// Crear una factura
		LineaFactura[] lineas = new LineaFactura[]{
				new LineaFactura("P100", "Leche",	0.85f, 	6, 	0 ),
				new LineaFactura("P200", "Pan",		0.60f, 	1, 	0 ),
				new LineaFactura("P150", "Tomate",	0.85f, 	2, 	0 ),
				new LineaFactura("P600", "Cafe",		1.2f, 	1, 	0 )
			};														
		Factura factura1 = new Factura( "C100",  "Antonio Garcia", lineas);
		
		// Escribir la factura
		System.out.println( factura1 );
		
	}	
	
}
