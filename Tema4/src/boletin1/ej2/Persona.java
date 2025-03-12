package boletin1.ej2;

/**
 * Clase Persona donde se van a definir la información de una persona
 */
public class Persona {
	/**
	 * Atributo dni que guarda el dni de la Persona
	 */
	private String dni;
	/**
	 * Atributo nombre que guarda el nombre de la Persona
	 */
	private String nombre;
	/**
	 * Atributo apellidos que guarda el apellidos de la Persona
	 */
	private String apellidos;
	/**
	 * Atributo edad que guarda el edad de la Persona
	 */
	private int edad;

	/**
	 * Constructor de Persona que recibe todos los atributos como parámetros de
	 * entrada
	 * 
	 * @param dni       El dni de la persona
	 * @param nombre    El nombre de la persona
	 * @param apellidos Los apellidos de la persona
	 * @param edad      La edad de la persona
	 */
	public Persona(String dni, String nombre, String apellidos, int edad) {
		if (dni != null && !dni.isBlank()) {
			this.dni = dni;
		}
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		if (apellidos != null && !apellidos.isBlank()) {
			this.apellidos = apellidos;
		}
		if (edad >= 0) {
			this.edad = edad;
		}
	}

	/**
	 * Método get del nombre donde obetenemos el contenido
	 * 
	 * @return El nombre de la persona
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método set del nombre donde modifica el nombre
	 * 
	 * @param nombre Nombre de la persona
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}

	/**
	 * Método get de apellidos donde obetenemos el contenido
	 * 
	 * @return Los apellidos de la persona
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * Método set de apellidos donde modificamos el contenido
	 * 
	 * @param apellidos Apellidos de la persona
	 */
	public void setApellidos(String apellidos) {
		if (apellidos != null && !apellidos.isBlank()) {
			this.apellidos = apellidos;
		}
	}

	/**
	 * Método get de edad donde obtenemos la edad
	 * 
	 * @return Edad de la persona
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * Método set de edad donde modificamos la edad
	 * 
	 * @param edad Edad de la persona
	 */
	public void setEdad(int edad) {
		if (edad >= 0) {
			this.edad = edad;
		}
	}

	/**
	 * Método get del dni donde obtenemos el dni
	 * 
	 * @return Dni de la persona
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Método que devuelve si es o no mayor de edad la persona
	 * 
	 * @return Si es mayor de edad
	 */
	public boolean esMayorEdad() {
		boolean esMayor = false;
		if (edad >= 18) {
			esMayor = true;
		}
		return esMayor;
	}

	/**
	 * Método que devuelve si está jubilado o no
	 * 
	 * @return Si la persona está jubilada
	 */
	public boolean esJubilado() {
		boolean esJubilado = false;
		if (edad >= 65) {
			esJubilado = true;
		}
		return esJubilado;
	}

	/**
	 * Método que calcula la diferencia de edad entre dos personas
	 * 
	 * @param p Una persona que recibe por parámetro
	 * @return La diferencia de edad entre p y la persona
	 */
	public int diferenciaEdad(Persona p) {
		return Math.abs(p.edad - this.edad);
	}

	/**
	 * Método toString de Persona
	 */
	@Override
	public String toString() {
		return "DNI: " + dni + " Nombre: " + nombre + " Apellidos: " + apellidos + " Edad: " + edad;
	}
}
