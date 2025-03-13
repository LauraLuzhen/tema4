package crud.ej1;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Clase CRUD de la clase Alumno
 */
public class AlumnoCrud {
	/**
	 * Creamos el conjunto donde contendrá toda la información de los alumnos
	 */
	private static Set<Alumno> alumnos = new LinkedHashSet<Alumno>();
	
	/**
	 * Función que realiza una lista de todos los alumnos
	 */
	public static void listadoAlumnos() {
		for (Alumno a: alumnos) {
			System.out.println(a);
			System.out.println("-------------------------------");
		}
	}
	
	/**
	 * Función que añade un Alumno al conjunto
	 * @param a Objeto de tipo alumno
	 * @return Si se ha añadido correctamente
	 */
	public static boolean añadirAlumno(Alumno a) {
		return alumnos.add(a);
	}
}
