package boletin2.ej1;

import java.util.Scanner;

public class CuentaCorrienteMain {

	public static void main(String[] args) {
		// Declaración de atributos
		// Cantidad de dinero
		int cantidad;

		// Creamos el Scanner
		Scanner reader = new Scanner(System.in);

		// Creamos dos cuentas
		CuentaCorriente cuenta1 = new CuentaCorriente("123", "Nombre1", 112, "ESPAÑOLA");
		CuentaCorriente cuenta2 = new CuentaCorriente("234", "Nombre2", 42, "EXTRANJERA");

		// toString
		System.out.println(cuenta1);
		System.out.println(cuenta2);

		// Método ingresar dinero
		System.out.println("Dinero para ingresar en la cuenta 1: ");
		cantidad = reader.nextInt();
		cuenta1.ingresarDinero(cantidad);
		System.out.println(cuenta1);

		// Método sacar dinero
		System.out.println("Dinero para sacar de la cuenta 2: ");
		cantidad = reader.nextInt();
		cuenta2.sacarDinero(cantidad);
		System.out.println(cuenta2);

		// equals
		System.out.println("Ambas cuentas son iguales: " + cuenta1.equals(cuenta2));

		// Cerramos el Scanner
		reader.close();
	}
}
