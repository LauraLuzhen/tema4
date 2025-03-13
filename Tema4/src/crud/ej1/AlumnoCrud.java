package crud.ej1;

import java.util.LinkedHashSet;
import java.util.Set;

public class AlumnoCrud {

	private static Set<Alumno> alumnos = new LinkedHashSet<Alumno>();

	public static void listadoAlumnos() {
		for (Alumno a: alumnos) {
			System.out.println(a);
			System.out.println("-------------------------------");
		}
	}
	
	public static boolean añadirAlumno(Alumno a) {
		return alumnos.add(a);
	}
	
	public static boolean modificarMedia(Alumno a, double media) {
		boolean realizado = false;
		Alumno alumno = buscarAlumno(a);
		if (alumno != null) {
			realizado = true;
			alumno.setNotaMedia(media);
		}
		return realizado;
	}
	
	private static Alumno buscarAlumno(Alumno a) {
		Alumno alumno = null;
		for (Alumno al: alumnos) {
			if (al.equals(a)) {
				alumno = a;
			}
		}
		return alumno;
	}
	
	public static boolean eliminarAlumno(Alumno a) {
		return alumnos.remove(a);
	}
}
