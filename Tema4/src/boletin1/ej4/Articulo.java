package boletin1.ej4;

/**
 * Clase que guarda los datos de un artículo
 */
public class Articulo {

	/**
	 * Variable que guarda el nombre 
	 */
	private String nombre;
	/**
	 * Variable que guarda el precio 
	 */
	private int precio;
	/**
	 * Variable que guarda la cantidad que queda
	 */
	private int cuantosQuedan;
	/**
	 * Constante que guarda el porcentaje del IVA
	 */
	public static final int IVA = 21;
	
	
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
	
	/**
	 * Devuelve el nombre 
	 * @return El nombre del artículo
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Modifica el nombre
	 * @param nombre El nombre del artículo no puede ser null ni cadena vacía
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}

	/**
	 * Devuelve el precio
	 * @return El precio del artículo
	 */
	public int getPrecio() {
		return precio;
	}

	/**
	 * Modifica el precio 
	 * @param precio El precio del artículo debe ser mayor que 0
	 */
	public void setPrecio(int precio) {
		if (precio > 0) {
			this.precio = precio;
		}
	}

	/**
	 * Devuelve la cantidad que queda
	 * @return La cantidad que queda del artículo para vender
	 */
	public int getCuantosQuedan() {
		return cuantosQuedan;
	}

	/**
	 * Modifica la cantidad que queda
	 * @param cuantosQuedan La cantidad que queda del arítulo para vender debe ser mayor o igual a 0
	 */
	public void setCuantosQuedan(int cuantosQuedan) {
		if (cuantosQuedan >= 0) {
			this.cuantosQuedan = cuantosQuedan;
		}
	}

	public static int getIva() {
		return IVA;
	}

	/**
	 * Método que calcula el precio con el iva
	 * @param precio Dinero que cuesta el artículo
	 * @return El precio totoal del artículo con el iva
	 */
	public double getPVP (int precio) {
		
		double pvp = ((this.precio * Articulo.IVA) / 100.0) + this.precio;
		
		return pvp;
	}
	
	/**
	 * Método que devuelve el precio con el iva y con un descuento 
	 * @param descuento Porcentaje que se reduce
	 * @param pvp Precio con el iva
	 * @return El precio con el iva y con el descuento
	 */
	public double getPVPDescuento (int descuento, int pvp) {
		
		double precioDescuento = pvp * descuento / 100;
		
		return precioDescuento;
	}
	
	/**
	 * Método que indica si se ha podido vender a la cantidad pedida y si se puede lo hace
	 * @param cantidad Que quieren vender
	 * @return Si se ha podido vender todo lo solicitado o no
	 */
	public boolean vender (int cantidad) {
		
		boolean vendido = false;
		
		if (this.cuantosQuedan - cantidad >= 0) {
			this.cuantosQuedan -= cantidad;
		}
		
		return vendido;
	}
	
	/**
	 * Método que añade una cantidad a la cantidad de artículo actuales
	 * @param cantidad Que se va a añadir
	 */
	public void almacenar (int cantidad) {
		this.cuantosQuedan += cantidad;
	}

	@Override
	public String toString() {
		return "Articulo [nombre=" + nombre + ", precio=" + precio + ", cuantosQuedan=" + cuantosQuedan + "]";
	}
}
