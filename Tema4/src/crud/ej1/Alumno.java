package crud.ej1;

public class Alumno {

	/**
	 * Varitable que almacena el nombre del alumno
	 */
	private String nombre;
	
	/**
	 * Variable que almacena la nota del alumno
	 */
	private double nota;
	
	/**
	 * Variable que almacena la media de las notas 
	 */
	private double media;
	
	/**
	 * Constructor que recibe el nombre y media del alumno
	 * @param nombre Del alumno
	 * @param media De las notas del alumno
	 */
	public Alumno (String nombre, double media) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		if (media >= 0 && media <= 10) {
			this.media = media;
		}
	}

	/**
	 * Obtiene el nombre
	 * @return El nombre del alumno
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Modifica el nombre
	 * @param nombre Del alumno
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}

	/**
	 * Obtiene una nota
	 * @return Una nota del alumno
	 */
	public double getNota() {
		return nota;
	}

	/**
	 * Modifica una nota
	 * @param nota Del alumno
	 */
	public void setNota(double nota) {
		if (nota >= 0 && nota <= 10) {
			this.nota = nota;
		}
	}

	/**
	 * Obtiene la media
	 * @return La media entre las notas del alumno
	 */
	public double getMedia() {
		return media;
	}

	/**
	 * Modifica la media
	 * @param media De las notas del alumno
	 */
	public void setMedia(double media) {
		if (media >= 0 && media <= 10) {
			this.media = media;
		}
	}

	@Override
	public String toString() {
		return nombre + " " + media;
	}

	@Override
	public boolean equals(Object obj) {
		Alumno other = (Alumno) obj;
		boolean res = false;
		
		if (this.nombre.equals(other.nombre)) {
			res = true;
		}
		
		return res;
	}
}
