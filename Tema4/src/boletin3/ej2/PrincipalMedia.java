package boletin3.ej2;

public class PrincipalMedia {

	public static void main(String[] args) {
		
		Media media = new Media();;
		
		// Función 1
		System.out.println("Media de 2 num: " + media.media(8, 4));
		
		// Función 2
		System.out.println("Media de 3 num: " + media.media(8, 4, 9));
	}
}
