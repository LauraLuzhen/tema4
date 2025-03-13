package boletin2.ej2;

public class LibroMain {

	public static void main(String[] args) {
		// Creamos los libros
		Libro libro1 = new Libro("Titulo1", "Autor1", 10, 4, "POÉTICO");
		Libro libro2 = new Libro("Titulo2", "Autor2", 5, 0, "NARRATIVO");
		
		System.out.println(libro1);
		System.out.println(libro2);
		
		// Método préstamo
		System.out.println("Realización del préstamo del libro 1: " + libro1.prestamo());
		System.out.println(libro1);
		
		// Método devolución
		System.out.println("Realización de la devolución del libro 2: " + libro2.devolucion());
		System.out.println(libro2);
		
		// Método equals
		System.out.println("Ambos libros son iguales: " + libro1.equals(libro2));
	}
}
