package boletin4.ej1;

public class HoraMain {

	public static void main(String[] args) {
		Hora hora1 = new Hora(12, 12, 33);
		Hora hora2 = new Hora(16, 19, 54);

		System.out.println(hora1);
		System.out.println(hora2);

		System.out.println(hora1.equals(hora2));
	}
}