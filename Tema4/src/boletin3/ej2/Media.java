package boletin3.ej2;

public class Media {

	/**
	 * Función que calcula la media entre dos números enteros
	 * @param arg1 Número entero 1
	 * @param arg2 Número entero 2
	 * @return La media en double de ambos números
	 */
	public double media (int arg1, int arg2) {
		double res;
		
		if (arg2 == 0) {
			res = (double)arg1 / 2;
		} else {
			res = media(arg1 + 1, arg2 - 1);
		}
		
		return res;
	}
	
	/**
	 * Función que calcula la media entre 3 números enteros
	 * @param arg1 Número entero 1
	 * @param arg2 Número entero 2
	 * @param arg3 Número entero 3
	 * @return Media en double de los 3 números
	 */
	public double media (int arg1, int arg2, int arg3) {
		double res;
		
		if (arg2 <= 0 && arg3 <= 0) {
			res = (double)arg1 / 3;
		} else {
			res = media(arg1 + 1, arg2 - 1, arg3 - 1);
		}
		
		return res;
	}
}
