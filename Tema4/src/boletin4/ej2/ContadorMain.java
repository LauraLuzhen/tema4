package boletin4.ej2;

public class ContadorMain {

	public static void main(String[] args) {
		Contador cont1 = new Contador(10);
		Contador cont2 = new Contador(5);

		cont1.incrementar();
		System.out.println(cont1);
		cont2.decrementar();
		System.out.println(cont2);

		System.out.println(cont1.equals(cont2));
	}
}
