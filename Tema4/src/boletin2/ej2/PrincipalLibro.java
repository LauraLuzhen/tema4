package boletin2.ej2;

public class PrincipalLibro {

	public static void main(String[] args) {
		
		Libro l1 = new Libro ("Título1", "Autor1");
		Libro l2 = new Libro ("Título2", "Autor2", 10, 2);
		Libro l3 = new Libro ("Título3", "Autor3", 15, 0, "LÍRICO");
		Libro l4 = new Libro ("Título3", "Autor3", 7, 1, "NARRATIVO");
		Libro l5 = new Libro ("Título1", "Autor3", 15, 0, "LÍRICO");
		
		//prestamo
		System.out.println("Préstamo del libro 2: " + l2.prestamo());
		
		//devolucion
		System.out.println("Devolución del libro 3: " + l3.devolucion());
		
		//toString
		System.out.println(l1);
		
		//equals
		System.out.println(l3.equals(l4));
		System.out.println(l3.equals(l5));
	}
}
