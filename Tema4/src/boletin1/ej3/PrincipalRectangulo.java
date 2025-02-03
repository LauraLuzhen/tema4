package boletin1.ej3;

public class PrincipalRectangulo {

	public static void main(String[] args) {
		
		int per1, per2, area1, area2;
		
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();
		
		r1.x2 = 5;
		r1.y2 = 5;
		
		r2.x1 = 7;
		r2.y1 = 9;
		r2.x2 = 2;
		r2.y2 = 3;
		
		per1 = Math.abs(2 * (r1.x1 - r1.x2)) + Math.abs(2 * (r1.y1 - r1.y2));
		per2 = Math.abs(2 * (r2.x1 - r2.x2)) + Math.abs(2 * (r2.y1 - r2.y2));
		
		area1 = Math.abs((r1.x1 - r1.x2) * (r1.y1 - r1.y2));
		area2 = Math.abs((r2.x1 - r2.x2) * (r2.y1 - r2.y2));
		
		System.out.println("Rectángulo 1: perímetro " + per1 + " y área " + area1);
		System.out.println("Rectángulo 2: perímetro " + per2 + " y área " + area2);
	}
}
