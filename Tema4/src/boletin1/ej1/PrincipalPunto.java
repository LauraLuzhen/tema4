package boletin1.ej1;

public class PrincipalPunto {
	
	public static void main(String[] args) {
	
		Punto coordenada1 = new Punto();
		Punto coordenada2 = new Punto();
		Punto coordenada3 = new Punto();
		
		coordenada1.x = 5;
		coordenada2.x= 10;
		coordenada2.y = 10;
		coordenada3.x = -3;
		coordenada3.y = 7;
		
		System.out.println("Coordenadas 1: (" + coordenada1.x + "," + coordenada1.y + ")");
		System.out.println("Coordenadas 2: (" + coordenada2.x + "," + coordenada2.y + ")");
		System.out.println("Coordenadas 3: (" + coordenada3.x + "," + coordenada3.y + ")");
	}
}
