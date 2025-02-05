package boletin1.ej2;

/**
 * Clase que guarda los datos de una persona
 */
public class Persona {
	/*
	 * Variable que guarda el dni
	 */
	private String dni;
	/**
	 * Variable que guarda el nombre
	 */
	private String nombre;
	/**
	 * Variable que guarda los apellidos
	 */
	private String apellidos;
	/**
	 * Variable que guarda la edad
	 */
	private int edad;
	
	/**
	 * Constructor con todos los parámetros
	 * @param dni El dni de la persona
	 * @param nombre El nombre de la persona
	 * @param apellidos Los apellidos de la persona
	 * @param edad La edad de la persona
	 */
	public Persona(String dni, String nombre, String apellidos, int edad) {
		if (dni != null && !dni.isEmpty() && dni.length() == 9) {
			this.dni = dni;
		}
		if (nombre != null && !nombre.isEmpty()) {
			this.nombre = nombre;
		}
		if (apellidos != null && !apellidos.isEmpty()) {
			this.apellidos = apellidos;
		}
		if (edad > 0) {
			this.edad = edad;
		}
	}
	
	/**
	 * Devuelve el nombre
	 * @return El nombre de la persona
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Modifica el nombre
	 * @param nombre El nombre de la persona no puede ser null ni cadena vacía
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}

	/**
	 * Devuelve los apellidos
	 * @return Los apellidos de la persona
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * Modifica los apellidos
	 * @param apellidos Los apellidos de la persona no pueden ser null ni cadena vacía
	 */
	public void setApellidos(String apellidos) {
		if (apellidos != null && !apellidos.isBlank()) {
			this.apellidos = apellidos;
		}
	}

	/**
	 * Devuelve la edad
	 * @return La edad de la persona
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * Modifica la edad
	 * @param edad La edad de la persona tiene que ser mayor que 0
	 */
	public void setEdad(int edad) {
		if (edad > 0) {
			this.edad = edad;
		}
	}

	/**
	 * Devuelve el dni
	 * @return El dni de la persona
	 */
	public String getDni() {
		return dni;
	}
}
