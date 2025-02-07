package boletin1.ej2;

import java.util.Scanner;

public class PrincipalPersona {

	public static void main(String[] args) {
		
		String dni, nombre, apellidos;
		int edad;
		
		Persona p1;
		Persona p2;
		
		Scanner reader = new Scanner (System.in);
		
		System.out.println("INTRODUCE LOS DATOS DE LA PRIMERA PERSONA");
		System.out.println("Introduce el dni: ");
		dni = reader.next();
		reader.nextLine();
		System.out.println("Introduce el nombre: ");
		nombre = reader.nextLine();
		System.out.println("Introduce los apellidos: ");
		apellidos = reader.nextLine();
		System.out.println("Introduce la edad: ");
		edad = reader.nextInt();
		reader.nextLine();
			
		p1 = new Persona(dni, nombre, apellidos, edad);
		
		System.out.println("INTRODUCE LOS DATOS DE LA SEGUNDA PERSONA");
		System.out.println("Introduce el dni: ");
		dni = reader.next();
		reader.nextLine();
		System.out.println("Introduce el nombre: ");
		nombre = reader.nextLine();
		System.out.println("Introduce los apellidos: ");
		apellidos = reader.nextLine();
		System.out.println("Introduce la edad: ");
		edad = reader.nextInt();
		reader.nextLine();
	
		p2 = new Persona(dni, nombre, apellidos, edad);
		
		// Imprimimos los resultados
		System.out.print(p1.getNombre() + " " + p1.getApellidos() + " con DNI " + p1.getDni());
		System.out.println(p1.getEdad() < 18 ? " es menor de edad." : " es mayor de edad");
		
		System.out.print(p2.getNombre() + " " + p2.getApellidos() + " con DNI " + p2.getDni());
		System.out.println(p2.getEdad() < 18 ? " es menor de edad." : " es mayor de edad");
		
		// Método esMayorEdad
		System.out.println("¿La persona 1 es mayor de edad? " + p1.esMayorEdad());
		
		// Método esJubilado
		System.out.println("¿La persona 2 está jubilada? " + p2.esJubilado());
		
		// Método diferenciaEdad
		System.out.println("La diferencia de edad entre p1 y p2 es " + p1.diferenciaEdad(p2));
		
		// Método toString
		System.out.println(p1);
		
		// Cerramos el Scanner
		reader.close();
	}
}
