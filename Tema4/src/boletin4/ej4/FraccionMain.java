package boletin4.ej4;

public class FraccionMain {

	public static void main(String[] args) {
		Fraccion f1 = new Fraccion(4, 7);
		Fraccion f2 = new Fraccion(2, 5);

		System.out.println("Suma: " + f1.suma(f2));
		System.out.println("Resta: " + f1.resta(f2));
		System.out.println("Multiplicación: " + f1.multiplica(f2));
		System.out.println("División: " + f1.divide(f2));
	}
}
