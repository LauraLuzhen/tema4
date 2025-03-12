package boletin1.ej4;

public class Articulo {
	/**
	 * Atributo nombre del artículo
	 */
	private String nombre;
	/**
	 * Atributo precio del artículo sin el IVA
	 */
	private double precio;
	/**
	 * Constante que guarda el porcentaje del IVA
	 */
	public static final double IVA = 0.21;
	/**
	 * Atributo que guardar cuantos artículos quedan
	 */
	private int cuantosQuedan;

	/**
	 * Constructor de Articulo que recibe como parámetro todos los atributos de la
	 * clase
	 * 
	 * @param nombre        El nombre del artículo
	 * @param precio        El precio del artículo
	 * @param cuantosQuedan La cantidad que queda del artículo
	 */
	public Articulo(String nombre, double precio, int cuantosQuedan) {
		if (nombre != null && !nombre.isBlank()) {
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
	 * Método get del precio
	 * 
	 * @return El valor del precio del artículo
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Método set del precio
	 * 
	 * @param precio El valor nuevo del precio
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/**
	 * Método get de cuantos quedan
	 * 
	 * @return La cantidad de cuantos quedan de un artículo
	 */
	public int getCuantosQuedan() {
		return cuantosQuedan;
	}

	/**
	 * Método set de cuantos quedan
	 * 
	 * @param cuantosQuedan El valor de cuantos quedan del artículo
	 */
	public void setCuantosQuedan(int cuantosQuedan) {
		this.cuantosQuedan = cuantosQuedan;
	}

	/**
	 * Método get del nombre
	 * 
	 * @return El valor del nombre del artículo
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método que devuelve el precio con el IVA
	 * 
	 * @return El precio del artículo con el IVA incluido
	 */
	public double getPVP() {
		return (precio * IVA) + precio;
	}

	/**
	 * Método que descuenta un porcentaje al precio
	 * 
	 * @param descuento El porcentaje de descuento que se va a realizar
	 * @return El descuento del artículo
	 */
	public double getDescuento(int descuento) {
		return getPVP() - (getPVP() * descuento / 100);
	}

	/**
	 * Método vender que devuelve si se ha podido vender una cantidad de un artículo
	 * o no
	 * 
	 * @param cantidad La cantidad que se quiere vender
	 * @return Si se ha podido vender o no
	 */
	public boolean vender(int cantidad) {
		boolean vendido = false;
		if (cuantosQuedan - cantidad >= 0) {
			this.cuantosQuedan -= cantidad;
			vendido = true;
		}
		return vendido;
	}

	/**
	 * Método almacenar que aumenta la cantidad que queda de un artículo
	 * 
	 * @param cantidad La cantidad que queremos añadir al artículo
	 */
	public void almacenar(int cantidad) {
		this.cuantosQuedan += cantidad;
	}

	/**
	 * Método toString de la clase Articulo
	 */
	@Override
	public String toString() {
		return "Nombre: " + nombre + ", precio: " + precio + ", PVP: " + getPVP() + ", Cantidad que queda: "
				+ cuantosQuedan;
	}
}
