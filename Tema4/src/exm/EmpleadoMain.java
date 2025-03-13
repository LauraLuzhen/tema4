package exm;

import java.util.Scanner;

public class EmpleadoMain {

	public static void main(String[] args) {
		int opc;
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Bienvenido empleado!!");
		
		do {
			menu();
			opc = reader.nextInt();
			reader.nextLine();
			
			
		} while (opc != 0);
	}
	
	public static void menu() {
		System.err.println("Elige una opción: ");
		System.out.println("1. Añadir empleado");
		System.out.println("2. Listar empleados");
		System.out.println("3. Modificar horas extras");
		System.out.println("4. Modificar importe horas extras");
		System.out.println("5. Eliminar empleado");
		System.out.println("0. Salir");
	}
}
