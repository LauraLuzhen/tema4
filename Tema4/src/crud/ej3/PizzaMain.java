package crud.ej3;

import java.util.Scanner;

public class PizzaMain {

	static Scanner reader = new Scanner(System.in);
	
	public static void main(String[] args) {
		char opc;
		int codigo;
		
		Pizza pizza;
		
		do {
			menu();
			opc = reader.nextLine().charAt(0);
			opc = Character.toLowerCase(opc);
			
			switch (opc) {
			case 'a' -> {
				PizzaCrud.listarPizzas();
			}
			case 'b' -> {
				pizza = crearPizza();
				if (PizzaCrud.añadirPizza(pizza)) {
					System.out.println("Realizado");
				} else {
					System.out.println("No realizado");
				}
			}
			case 'c' -> {
				codigo = pedirCodigo();
				pizza = new Pizza(codigo);
				
			}
			case 'd' -> System.out.println("Saliendo del programa...");
			default -> System.out.println("Introduce una opción válida");
			}
		} while (opc != 'd');
		
		System.out.println("FIN DEL PROGRAMA");
		
		reader.close();
	}
	
	private static void menu() {
		System.out.println("INTRODUCE UNA OPCIÓN");
		System.out.println("a. Listado de pizzas");
		System.out.println("b. Nuevo pedido");
		System.out.println("c. Pizza servida");
		System.out.println("d. Salir");
	}
	
	private static Pizza crearPizza() {
		Pizza pizza;
		int codigo;
		String tamaño;
		String tipo;
		String estado;
		
		codigo = pedirCodigo();
		System.out.println("Introduce el tamaño: ");
		tamaño = reader.nextLine();
		System.out.println("Introduce el tipo: ");
		tipo = reader.nextLine();
		System.out.println("Introduce el estado: ");
		estado = reader.nextLine();
		
		pizza = new Pizza(codigo, tamaño, tipo, estado);
		return pizza;
	}
	
	private static int pedirCodigo() {
		int codigo;
		System.out.println("Introduce el código: ");
		codigo = reader.nextInt();
		reader.nextLine();
		return codigo;
	}
}
