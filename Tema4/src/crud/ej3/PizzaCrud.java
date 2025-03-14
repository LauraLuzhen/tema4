package crud.ej3;

import java.util.HashSet;
import java.util.Set;

public class PizzaCrud {

	private static Set<Pizza> pizzas = new HashSet<Pizza>();
	
	

	public static void listarPizzas() {
		for (Pizza pizza: pizzas) {
			System.out.println(pizza);
			System.out.println("----------------------------");
		}
	}
	
	public static boolean añadirPizza(Pizza p) {
		return pizzas.add(p);
	}
	
	public static boolean modificarEstado(Pizza p, String estado) {
		
	}
	
	private 
}
