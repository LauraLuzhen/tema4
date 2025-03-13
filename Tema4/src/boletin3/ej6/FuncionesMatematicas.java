package boletin3.ej6;

public class FuncionesMatematicas {

	/**
	 * Método que calcula el sumatorio de 1 hasta el número
	 * 
	 * @param numero El núemro que llega el sumatorio
	 * @return El sumatorio final
	 */
	public static int sumatorio(int numero) {
		int res;
		if (numero <= 0) {
			res = 0;
		} else {
			res = numero + sumatorio(numero - 1);
		}
		return res;
	}

	/**
	 * Método que calcula la potencia de a elevado a n
	 * 
	 * @param a El número base
	 * @param n El exponente
	 * @return El resultado
	 */
	public static double potencia(double a, int n) {
		double res;
		if (n == 0) {
			res = 1;
		} else if (n < 0) {
			res = 1 / potencia(a, -n);
		} else {
			res = a * potencia(a, n - 1);
		}
		return res;
	}

	/**
	 * Método que calcula la serie de Fibonacci
	 * 
	 * @param numero Hasta que número
	 * @return La serie de Fibonacci
	 */
	public static int serieFibonacci(int numero) {
		int res;
		if (numero == 0 || numero == 1) {
			res = 1;
		} else {
			res = serieFibonacci(numero - 1) + serieFibonacci(numero - 2);
		}
		return res;
	}
}
