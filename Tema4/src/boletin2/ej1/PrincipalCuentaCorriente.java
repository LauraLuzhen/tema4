package boletin2.ej1;

import java.util.Scanner;

public class PrincipalCuentaCorriente {

	public static void main(String[] args) {
		
		double cantidad;
		
		CuentaCorriente cc1 = new CuentaCorriente ("123456789", 123.2);
		CuentaCorriente cc2 = new CuentaCorriente ("123456788", "Titular1", 154.2);
		CuentaCorriente cc3 = new CuentaCorriente ("123456787", "Titular2", 127.2, "ESPAÑOLA");
		CuentaCorriente cc4 = new CuentaCorriente ("123456123", "Titular2", 127.2, "ESPAÑOLA");
		CuentaCorriente cc5 = new CuentaCorriente ("123456787", "Titular2", 127.2, "ESPAÑOLA");
		
		Scanner reader = new Scanner (System.in);
		
		//Sacar dinero
		System.out.println("Cantidad para sacar dinero: ");
		cantidad = reader.nextDouble();
		System.out.println(cc1.sacarDinero(cantidad));
		reader.nextLine();
		
		//Ingresar dinero
		System.out.println("Cantidad para ingresar dinero: ");
		cantidad = reader.nextDouble();
		System.out.println(cc2.ingresarDinero(cantidad));
		reader.nextLine();
		
		//toString
		System.out.println(cc3);
		
		//equals
		System.out.println(cc3.equals(cc4));
		System.out.println(cc3.equals(cc5));
		
		reader.close();
	}
}
