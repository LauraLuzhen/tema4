package boletin3.ej1;

public class PrincipalSuma {

	public static void main(String[] args) {
		
		Suma suma = new Suma();
		
		// Función 1
		System.out.println("Suma int: " + suma.suma(8, 4));
		
		// Función 2
		System.out.println("Suma double: " + suma.suma(8.3, 3.7));
	}
}
