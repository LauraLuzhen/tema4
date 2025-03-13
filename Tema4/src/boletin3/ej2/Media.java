package boletin3.ej2;

/**
 * Clase media donde se calcularán las medias
 */
public class Media {
	/**
	 * Método que calcula la media entre dos números enteros
	 * 
	 * @param num1 Un número entero
	 * @param num2 Otro número entero
	 * @return La media entre ambos
	 */
	public static double media(int num1, int num2) {
		return (num1 + num2) / 2.0;
	}

	/**
	 * Método que calcula la media ente tres números enteros
	 * 
	 * @param num1 Un número entero
	 * @param num2 El segundo número entero
	 * @param num3 El tercer número entero
	 * @return La media entre los tres
	 */
	public static double media(int num1, int num2, int num3) {
		return (num1 + num2 + num3) / 3.0;
	}
}
