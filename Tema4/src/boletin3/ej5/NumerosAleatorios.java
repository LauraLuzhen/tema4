package boletin3.ej5;

import java.util.Random;

public class NumerosAleatorios {
	private static Random random = new Random();

	/**
	 * Método que genera una cantidad de números aleatorios entre 0 y 1
	 * 
	 * @param cantidad La cantidad de números que se van a generar
	 */
	public static void numerosAleatorios(int cantidad) {
		for (int i = 0; i < cantidad; i++) {
			System.out.println(random.nextDouble());
		}
	}

	/**
	 * Método que genera una cantidad de números aleatorios entre 0 y max
	 * 
	 * @param cantidad La cantidad de números que se van a generar
	 * @param maximo   El número máximo que se puede generar
	 */
	public static void numerosAleatorios(int cantidad, int max) {
		for (int i = 0; i < cantidad; i++) {
			System.out.println(random.nextInt(max + 1));
		}
	}

	/**
	 * Método que genera una cantidad de números aleatorios entre min y max
	 * 
	 * @param cantidad La cantidad de números que se van a generar
	 * @param minimo   El número mínimo que se puede generar
	 * @param maximo   El número máximo que se puede generar
	 */
	public static void numerosAleatorios(int cantidad, int min, int max) {
		if (min > max) {
			System.out.println("Error: El valor mínimo no puede ser mayor que el máximo.");
		}
		for (int i = 0; i < cantidad; i++) {
			System.out.println(random.nextInt((max - min) + 1) + min);
		}
	}
}
