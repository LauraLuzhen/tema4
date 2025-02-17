package boletin3.ej3;

public class SumaEnteros {

	/**
	 * Función que calcula la suma de 1 hasta el número introducido
	 * @param num Hasta que queremos que sume
	 * @return La suma de todos los números
	 */
	public int sumaEnteros (int num) {
		int res = 0;
		
		for (int i = 1; i <= num; i++) {
			res += i;
		}
		
		return res;
	}
	
	/**
	 * Función que recibe dos números y suma todos los números entre el num1 y num 2
	 * @param num1 Número entero 1
	 * @param num2 Número entero 2
	 * @return La suma de todos los números entre ambos 
	 */
	public int sumaEnteros (int num1, int num2) {
		int res = 0;
		
		for(int i = num1; i <= num2; i++) {
			res += i;
		}
		
		return res;
	}
}
