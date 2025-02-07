package boletin1.ej3;

import java.util.Scanner;

public class PrincipalRectangulo {

	public static void main(String[] args) {
		
		// Variable que guarda el perímetro y el área de dos rectángulos
		int per1, per2, area1, area2;
		// Variable que guarda las coordenadas de los puntos
		int x1, x2, y1, y2;
		
		// Creamos el Scanner
		Scanner reader = new Scanner (System.in);
		
		System.out.println("Introduce los valores del primer rectángulo");
		System.out.println("Coordenada x1: ");
		x1 = reader.nextInt();
		System.out.println("Coordenada y1: ");
		y1 = reader.nextInt();
		System.out.println("Coordenada x2: ");
		x2 = reader.nextInt();
		System.out.println("Coordenada y2: ");
		y2 = reader.nextInt();
		
		Rectangulo r1 = new Rectangulo(x1, y1, x2, y2);
		
		System.out.println("Introduce los valores del segundo rectángulo");
		System.out.println("Coordenada x1: ");
		x1 = reader.nextInt();
		System.out.println("Coordenada y1: ");
		y1 = reader.nextInt();
		System.out.println("Coordenada x2: ");
		x2 = reader.nextInt();
		System.out.println("Coordenada y2: ");
		y2 = reader.nextInt();
		
		Rectangulo r2 = new Rectangulo(x1, y1, x2, y2);
		
		// Calculamos el perímetro (suma de todos sus lados)
		per1 = Math.abs(2 * (r1.getX1() - r1.getX2())) + Math.abs(2 * (r1.getY1() - r1.getY2()));
		per2 = Math.abs(2 * (r2.getX1() - r2.getX2())) + Math.abs(2 * (r2.getY1() - r2.getY2()));
		
		// Calculamos el área (altura x ancho)
		area1 = Math.abs((r1.getX1() - r1.getX2()) * (r1.getY1() - r1.getY2()));
		area2 = Math.abs((r2.getX1() - r2.getX2()) * (r2.getY1() - r2.getY2()));
		
		// Imprimimos el resultado
		System.out.println("Rectángulo 1: perímetro " + per1 + " y área " + area1);
		System.out.println("Rectángulo 2: perímetro " + per2 + " y área " + area2);
		
		// Método getPerimetro
		System.out.println("Perímetro del primer rectángulo: " + r1.getPerimetro());
		
		// Método getArea
		System.out.println("Área del segundo rectángulo: " + r2.getArea());
		
		// Método toString
		System.out.println(r1);
		
		// Cerramos el Scanner
		reader.close();
	}
}
