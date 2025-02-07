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
	
	/**
	 * Método que indica si es mayor de edad o no la persona
	 * @return Si es mayor de edad true, en caso contrario false
	 */
	public boolean esMayorEdad () {
		boolean esMayor = false;
		if (this.edad >= 18) {
			esMayor = true;
		}
		return esMayor;
	}
	
	/**
	 * Método que indica si la persona está jubilada o no (tiene más de 65 años)
	 * @return Si tiene 65 años o más (está jubilado) true
	 */
	public boolean esJubilado () {
		boolean esJubilado = false;
		if (this.edad >= 65) {
			esJubilado = true;
		}
		return esJubilado;
	}
	
	/**
	 * Método que calcula la diferncia de edad con la persona introducida
	 * @param p Edad de la persona introducida
	 * @return La diferencia entre la persona p y la actual
	 */
	public int diferenciaEdad (Persona p) {
		int diferencia = Math.abs(this.edad - p.edad);
		
		return diferencia;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + "]";
	}
}
