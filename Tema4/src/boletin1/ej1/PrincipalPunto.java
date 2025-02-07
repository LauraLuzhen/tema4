package boletin1.ej1;

public class PrincipalPunto {
	
	public static void main(String[] args) {
		
		// Creamos tres coordenadas 
		Punto coordenada1 = new Punto(5, 0);
		Punto coordenada2 = new Punto(10, 10);
		Punto coordenada3 = new Punto(-3, 7);
		
		// Imprimimos las coordenadas de cada una
		System.out.println("Coordenadas 1: (" + coordenada1.getX() + "," + coordenada1.getY() + ")");
		System.out.println("Coordenadas 2: (" + coordenada2.getX() + "," + coordenada2.getY() + ")");
		System.out.println("Coordenadas 3: (" + coordenada3.getX() + "," + coordenada3.getY() + ")");
	
		// Método toString
		System.out.println(coordenada1);
		
		// Método setXY
		coordenada2.setXY(20, 20);
		System.out.println(coordenada2);
		
		// Método desplaza
		coordenada2.desplaza(-10, -10);
		System.out.println(coordenada2);
		
		// Método distancia
		System.out.println("La distancia entre c1 y c3: " + coordenada1.distancia(coordenada3));
	}
}
