package crud.ej1;

import java.util.Scanner;

public class AlumnoMain {

	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		int opc;
		double media;
		String nombre;

		Alumno alumno;

		do {
			menu();
			opc = reader.nextInt();
			reader.nextLine();

			switch (opc) {
			case 1 -> {
				// listado
				AlumnoCrud.listadoAlumnos();
			}
			case 2 -> {
				// añadir
				alumno = crearAlumno();
				if (AlumnoCrud.añadirAlumno(alumno)) {
					System.out.println("Realizado");
				} else {
					System.out.println("No realizado");
				}
			}
			case 3 -> {
				// modificar media
				nombre = pedirNombre();
				media = pedirMedia();
				alumno = new Alumno(nombre);
				if (AlumnoCrud.modificarMedia(alumno, media)) {
					System.out.println("Realizado");
				} else {
					System.out.println("No realizado");
				}
			}
			case 4 -> {
				// eliminar
				nombre = pedirNombre();
				alumno = new Alumno(nombre);
				if (AlumnoCrud.eliminarAlumno(alumno)) {
					System.out.println("Realizado");
				} else {
					System.out.println("No realizado");
				}

			}
			default -> System.out.println("Saliendo del programa...");
			}
		} while (opc != 5);

		System.out.println("FIN DEL PROGRAMA");

		reader.close();
	}

	public static void menu() {
		System.out.println("INTRODUCE UNA OPCIÓN: ");
		System.out.println("1. Listado");
		System.out.println("2. Nuevo Alumno");
		System.out.println("3. Modificar");
		System.out.println("4. Borrar");
		System.out.println("5. Salir");
	}

	public static Alumno crearAlumno() {
		String nombre;
		double media;
		Alumno alumno;

		nombre = pedirNombre();
		media = pedirMedia();

		alumno = new Alumno(nombre, media);

		return alumno;
	}

	private static double pedirMedia() {
		double media;
		System.out.println("Introduce la media: ");
		media = reader.nextDouble();
		return media;
	}

	private static String pedirNombre() {
		String nombre;
		System.out.println("Introduce el nombre: ");
		nombre = reader.nextLine();
		return nombre;
	}
}
