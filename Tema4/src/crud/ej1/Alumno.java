package crud.ej1;
// boletin 2 ej 3

/**
 * Clase Alumno donde vamos a guardar la información de un alumno
 */
public class Alumno {
	/**
	 * Atributo nombre del alumno
	 */
	private String nombre;
	/**
	 * Atributo nota media del alumno
	 */
	private double notaMedia;

	/**
	 * Constructor de Alumno que recibe todos los atributos
	 * 
	 * @param nombre    El nombre del alumno
	 * @param notaMedia La media del alumno
	 */
	public Alumno(String nombre, double notaMedia) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		if (notaMedia >= 0 && notaMedia <= 10) {
			this.notaMedia = notaMedia;
		}
	}

	/**
	 * Método get de la media
	 * 
	 * @return El valor de la media del alumno
	 */
	public double getNotaMedia() {
		return notaMedia;
	}

	/**
	 * Método set de la media
	 * 
	 * @param notaMedia El nuevo valor para la media del alumno
	 */
	public void setNotaMedia(double notaMedia) {
		if (notaMedia >= 0 && notaMedia <= 10) {
			this.notaMedia = notaMedia;
		}
	}

	/**
	 * Método get del nombre
	 * 
	 * @return El valor del nombre del alumno
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método toString de la clase Alumno
	 */
	@Override
	public String toString() {
		return nombre + " " + notaMedia;
	}

	/**
	 * Método equals de la clase Alumno
	 */
	@Override
	public boolean equals(Object obj) {
		Alumno alumno = (Alumno) obj;
		boolean res = false;
		if (this.nombre.equals(alumno.nombre)) {
			res = true;
		}
		return res;
	}
}