package boletin1.ej2;

import java.util.Scanner;

public class PersonaMain {

	public static void main(String[] args) {
		// Declaración de atributos donde vamos a guardar la información que nos da el
		// usuario
		String dni;
		String nombre;
		String apellidos;
		int edad;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Creamos los objetos
		Persona p1;
		Persona p2;

		// Le pedimos los datos de ambas personas al usuario
		System.out.println("Introduce el dni: ");
		dni = reader.nextLine();
		System.out.println("Introduce el nombre: ");
		nombre = reader.nextLine();
		System.out.println("Introduce los apellidos: ");
		apellidos = reader.nextLine();
		System.out.println("Introduce la edad: ");
		edad = reader.nextInt();
		reader.nextLine();

		// Guardamos la información en la persona;
		p1 = new Persona(dni, nombre, apellidos, edad);
		System.out.println(p1);

		// Modificamos y obtenemos valores
		System.out.println("El nombre de la persona es " + p1.getNombre() + " " + p1.getApellidos());
		System.out.println("Introduce el nuevo nombre de la persona ");
		nombre = reader.nextLine();
		p1.setNombre(nombre);
		System.out.println(p1);

		// Método es mayor de edad
		System.out.println("La persona es mayor de edad: " + p1.esMayorEdad());

		// Método es jubilado
		System.out.println("La persona está jubilada: " + p1.esJubilado());

		// Comparación de edad entre dos personas
		p2 = new Persona("123", "Laura", "Rodríguez", 19);
		System.out.println("Diferencia de edad: " + p1.diferenciaEdad(p2));

		// Cerramos el Scanner
		reader.close();
	}
}
