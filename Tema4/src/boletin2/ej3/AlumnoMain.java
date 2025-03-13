package boletin2.ej3;

public class AlumnoMain {

	public static void main(String[] args) {
		// Creamos los alumnos
		Alumno al1 = new Alumno("Laura", 6.4);
		Alumno al2 = new Alumno("Marta", 8.3);
		
		System.out.println(al1);
		System.out.println(al2);
		
		// Modificamos la media
		al1.setNotaMedia(3.4);
		System.out.println(al1);
		
		// Método equals
		System.out.println("Ambos alumnos son el mismo: " + al1.equals(al2));
	}
}
