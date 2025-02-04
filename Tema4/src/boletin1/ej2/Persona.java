package boletin1.ej2;

/**
 * Clase que guarda los datos de una persona
 */
public class Persona {
	/*
	 * Variable que guarda el dni
	 */
	String dni;
	/**
	 * Variable que guarda el nombre
	 */
	String nombre;
	/**
	 * Variable que guarda los apellidos
	 */
	String apellidos;
	/**
	 * Variable que guarda la edad
	 */
	int edad;
	
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
	
	
}
