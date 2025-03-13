package boletin3.ej3;

public class SumaEnteros {
	/**
	 * Método que suma los números desde 1 hasta numero
	 * 
	 * @param numero Hasta
	 * @return La suma
	 */
	public static int sumaEnteros(int numero) {
		int suma = 0;
		for (int i = 1; i <= numero; i++) {
			suma += i;
		}
		return suma;
	}

	/**
	 * Método que suma los números entre num1 y num2
	 * 
	 * @param num1 El primer número
	 * @param num2 El segundo número
	 * @return La suma entre sus números
	 */
	public static int sumaEnteros(int num1, int num2) {
		int suma = 0;

		// Asegurar que num1 sea menor que num2
		if (num1 > num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}

		for (int i = num1; i <= num2; i++) {
			suma += i;
		}
		return suma;
	}
}
