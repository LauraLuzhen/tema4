package boletin3.ej1;

public class Suma {

	/**
	 * Función que calcula la suma de dos números enteros
	 * @param arg1 Número entero 1 
	 * @param arg2 Número entero 2
	 * @return La suma de ambos números enteros
	 */
	public int suma (int arg1, int arg2) {
		int res;
		
		if (arg2 == 0.0) {
			res = arg1;
		} else {
			res = suma(arg1 + 1,arg2 - 1);
		}
		
		return res;
	}
	
	/**
	 * Función que calcula la suma de dos números decimales
	 * @param arg1 Número decimal 1
	 * @param arg2 Número decimal 2
	 * @return La suma de ambos números decimales
	 */
	public double suma (double arg1, double arg2) {
		double res;
		
		if (arg2 == 0) {
			res = arg1;
		} else {
			res = suma(arg1 + 0.1, arg2 - 0.1);
		}
		
		return res;
	}
}
