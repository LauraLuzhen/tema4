package crud.ej1;

import java.util.Scanner;

public class AlumnoMain {

	public static void main(String[] args) {
		
		int opc;
		
		Scanner reader = new Scanner (System.in);
		
		do {
			menu();
			opc = reader.nextInt();
			reader.nextLine();
			switch(opc) {
			case 1 -> {
				
			}
			case 2 -> {
				
			}
			case 3 -> {
				
			}
			case 4 -> {
				
			}
			default -> System.out.println("Saliendo del programa...");
			}
		} while (opc != 5);
		
		System.out.println("FIN DEL PROGRAMA");
		
		reader.close();
	}
	
	public static void menu() {
		System.out.println("INTRODUCE UNA OPCIÓN: ");
		System.out.println("1. Listado");
		System.out.println("2. Nuevo Alumno");
		System.out.println("3. Modificar");
		System.out.println("4. Borrar");
		System.out.println("5. Salir");
	}
}
