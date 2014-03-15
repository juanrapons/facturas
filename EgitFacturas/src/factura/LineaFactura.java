package factura;

/**
 * Clase que <bold>gestiona las lineas de la factura</bold>
 * Crea la linea, muestra el contenido y <u>cálcula su total</u>
 * 
 * @author Juanra
 * @version 1.0 - 2014
 * @see Factura
 */

public class LineaFactura {
		
	public String id_producto; 		// identificador (codigo) del producto
	public String nombre_producto; 	// nombre del producto
	
	public float precio; 			//precio por una unidad del producto
	public float cantidad; 			//cantidad de unidades compradas
	public float descuento; 		//descuento de la unidad (no se esta utilizando)
	
	
	/**
	 * Método constructor.
	 * Crea los elementos de la linea
	 * 
	 * @param idProducto - identificador (codigo) del producto
	 * @param nombreProducto -nombre del producto
	 * @param precio -precio por una unidad del producto
	 * @param cantidad -cantidad de unidades compradas
	 * @param descuento -descuento de la unidad
	 */
	public LineaFactura(String idProducto, String nombreProducto, float precio,
			float cantidad, float descuento) {
		super();
		id_producto = idProducto;
		nombre_producto = nombreProducto;
		this.precio = precio;
		this.cantidad = cantidad;
		this.descuento = descuento;
	}
	
	/**
	  * {@inheritDoc}
	  * 
	  */
	@Override
	public String toString() {
		return "\n\tLineaFactura ["  				 				 
				+ "id_producto=" + id_producto
				+ ", nombre_producto=" + nombre_producto				
				+ ", precio=" + precio
				+ ", cantidad=" + cantidad
				+ ", descuento=" + descuento
				+ "]";
	}
	
	
	/**
	 * Devuelve el precio total de una linea. El precio de la unidad por la cantidad de productos 
	 * pedidos de esa uniad
	 * 
	 *  @return total -  total de linea (precio * cantidad)
	 */
	public float getTotal(){
		float total = this.precio * this.cantidad;
		return total;
	}

}
