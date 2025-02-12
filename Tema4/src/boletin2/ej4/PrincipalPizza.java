package boletin2.ej4;

public class PrincipalPizza {

	public static void main(String[] args) {
		
		Pizza p1 = new Pizza (123, "FAMILIAR", "MARGARITA");
		Pizza p2 = new Pizza (123, "MEDIANA", "CUATRO_QUESOS");
		Pizza p3 = new Pizza (122, "FAMILIAR", "MARGARITA");
		
		//toString
		System.out.println(p1);
		
		//equals
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
	}
}
