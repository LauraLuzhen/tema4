package boletin1.ej2;

import java.util.Scanner;

public class PrincipalPersona {

	public static void main(String[] args) {
		
		String dni, nombre, apellidos;
		int edad;
		
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
			
		Persona p1 = new Persona(dni, nombre, apellidos, edad);
		
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
	
		Persona p2 = new Persona(dni, nombre, apellidos, edad);
		
		// Imprimimos los resultados
		System.out.print(p1.nombre + " " + p1.apellidos + " con DNI " + p1.dni);
		System.out.println(p1.edad < 18 ? " es menor de edad." : " es mayor de edad");
		
		System.out.print(p2.nombre + " " + p2.apellidos + " con DNI " + p2.dni);
		System.out.println(p2.edad < 18 ? " es menor de edad." : " es mayor de edad");
		
		// Cerramos el Scanner
		reader.close();
	}
}
