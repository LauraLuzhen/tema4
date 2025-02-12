package boletin2.ej3;

public class PrincipalAlumno {

	public static void main(String[] args) {
		
		Alumno a1 = new Alumno ("Laura Rodríguez", 8.3);
		Alumno a2 = new Alumno ("Laura Rodríguez", 6.2);
		Alumno a3 = new Alumno ("Laura Hola", 8.3);
		
		//toString
		System.out.println(a1);
		
		//equals
		System.out.println(a1.equals(a2));
		System.out.println(a1.equals(a3));
	}
}
