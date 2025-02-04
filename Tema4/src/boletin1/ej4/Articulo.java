package boletin1.ej4;

/**
 * Clase que guarda los datos de un artículo
 */
public class Articulo {

	/**
	 * Variable que guarda el nombre 
	 */
	String nombre;
	/**
	 * Variable que guarda el precio 
	 */
	int precio;
	/**
	 * Variable que guarda la cantidad que queda
	 */
	int cuantosQuedan;
	/**
	 * Constante que guarda el porcentaje del IVA
	 */
	final int IVA = 21;
	
	/**
	 * Constructor con todos los parámetros
	 * @param nombre Nombre del artículo
	 * @param precio Precio del artículo
	 * @param cuantosQuedan Cantidad que queda en el almacén del artículo
	 */
	public Articulo(String nombre, int precio, int cuantosQuedan) {
		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
		if (precio > 0) {
			this.precio = precio;
		}
		if (cuantosQuedan >= 0) {
			this.cuantosQuedan = cuantosQuedan;
		}
	}
	
	
}
