package boletin1.ej3;

public class RectanguloMain {

	public static void main(String[] args) {
		// Creamos los objetos
		Rectangulo r1 = new Rectangulo(0, 0, 5, 5);
		Rectangulo r2 = new Rectangulo(7, 9, 2, 3);

		// Método setAll
		r1.setAll(1, 1, 6, 6);
		System.out.println(r1);

		// Método de modificadores dobles
		r2.setX1Y1(0, 1);
		System.out.println(r2);
		r2.setX2Y2(9, 7);
		System.out.println(r2);

		// Métodos del perímetro y área
		System.out.println("Perímetro: " + r1.getPerimetro());
		System.out.println("Área: " + r2.getArea());
	}
}
