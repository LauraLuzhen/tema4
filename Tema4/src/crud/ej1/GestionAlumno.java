package crud.ej1;

import java.util.HashSet;
import java.util.Set;

public class GestionAlumno {

	private static Set<Alumno> alumnos = new HashSet<Alumno>();

	public static void listarAlumnos() {
		for (Alumno a : alumnos) {
			System.out.println(a);
			System.out.println("------------------------------");
		}
	}

	public static boolean añadirAlumno(Alumno a) {
		return alumnos.add(a);
	}

	public static Alumno buscarAlumno(String nombre) {
		Alumno a = null;

		for (Alumno aBuscar : alumnos) {
			if (aBuscar.getNombre() == nombre) {
				a = aBuscar;
			}
		}

		return a;
	}

	public static boolean modificarAlumno(Alumno a, double media) {
		boolean res = false;

		double media = alumnos;

		return res;
	}

	public static boolean eliminarAlumno(Alumno alumno) {
		return alumnos.remove(alumno);
	}
}