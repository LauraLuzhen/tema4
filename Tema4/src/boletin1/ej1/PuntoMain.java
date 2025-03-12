package boletin1.ej1;

public class PuntoMain {

	public static void main(String[] args) {

		// Creamos los tres objetos Punto con los valores dichos
		Punto p1 = new Punto(5, 0);
		Punto p2 = new Punto(-3, 7);
		Punto p3 = new Punto(10, 10);

		// Imprimimos el contenido
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

		// Modificación
		p1.setX(p1.getX() + 2);
		p1.setY(p1.getY() - 2);

		System.out.println(p1);

		// Método setXY
		p2.setXY(3, -7);
		System.out.println(p2);

		// Método desplaza
		p3.desplaza(-5, 5);
		System.out.println(p3);

		// Método distancia
		System.out.println("La distancia entre p1 y p2: " + p2.distancia(p1));
	}
}
