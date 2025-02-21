package crud.ej1;

import java.util.Scanner;

public class PrincipalAlumno {

	static Scanner reader = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		int opc;
		String nombre;
		
		Alumno alumno;
		
		do {
			menu();
			System.out.println("Elige una opción: ");
			opc = reader.nextInt();
			reader.nextLine();
			
			switch (opc) {
			case 1 -> GestionAlumno.listarAlumnos();
			case 2 -> {
				alumno = nuevoAlumno();
				if (GestionAlumno.añadirAlumno(alumno)) {
					System.out.println("Alumno añadido correctamente");
				} else {
					System.out.println("Ya existe el alumno que se quiere añadir");
				}
			}
			case 3 -> {
				nombre = pedirNombre();
				if (GestionAlumno.modificarAlumno(nombre)) {
					System.out.println("Modificado correctamente");
				} else {
					System.out.println("El alumno no existe");
				}
			}
			case 4 -> {
				nombre = pedirNombre();
				if () {
					System.out.println("Eliminado correctamente");
				} else {
					System.out.println("El alumno no existe");
				}
			}
			case 5 -> System.out.println("Saliendo del sistema...");
			default -> System.out.println("Opción no válida");
			}
		} while (opc != 5);
		
		reader.close();
	}
	
	static void menu() {
		System.out.println("1. Listado");
		System.out.println("2. Nuevo Alumno");
		System.out.println("3. Modificar");
		System.out.println("4. Borrar");
		System.out.println("5. Salir");
	}
	
	static Alumno nuevoAlumno() {
		String nombre;
		double media;
		
		Alumno nuevoAlumno;
		
		nombre = pedirNombre();
		
		System.out.println("Introduzca la media del alumno: ");
		media = reader.nextDouble();
		reader.nextLine();
		
		nuevoAlumno = new Alumno(nombre, media);
		
		return nuevoAlumno;
	}
	
	private static String pedirNombre() {
		String nombre;
		System.out.println("Introduzca el nombre del alumno: ");
		nombre = reader.nextLine();
		return nombre;
	}
}
