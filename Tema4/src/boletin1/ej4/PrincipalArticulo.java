package boletin1.ej4;

import java.util.Scanner;

public class PrincipalArticulo {

	public static void main(String[] args) {

		// Variable que guarda el PVP
		double pvp;
		// Variable de los parámetros
		String nombre;
		int precio, cuantosQuedan;
		
		// Creamos el Scanner 
		Scanner reader = new Scanner (System.in);
		
		System.out.println("Introduce el nombre del artículo: ");
		nombre = reader.nextLine();
		System.out.println("Introduce el precio: ");
		precio = reader.nextInt();
		System.out.println("Introduce la cantidad que queda: ");
		cuantosQuedan = reader.nextInt();

		// Creamos un objeto Articulo()
		Articulo ar1 = new Articulo(nombre, precio, cuantosQuedan);

		// Calculamos el PVP que es el precio con el IVA incluido
		pvp = ((ar1.precio * ar1.IVA) / 100.0) + ar1.precio;

		// Imprimimos los resultados
		System.out.println(ar1.nombre + " - Precio:" + ar1.precio + "€ - IVA:" + ar1.IVA + "% - PVP:" + pvp
				+ "€ - Cantidad:" + ar1.cuantosQuedan);
		
		// Cerramos el Scanner
		reader.close();
	}
}
