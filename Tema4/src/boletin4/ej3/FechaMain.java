package boletin4.ej3;

public class FechaMain {

	public static void main(String[] args) {
		Fecha f1 = new Fecha(1, 2, 2025);
		Fecha f2 = new Fecha(2, 1, 2023);
		System.out.println(f1);
		System.out.println(f2);

		f1.diaSiguiente();
		System.out.println(f1);
	}
}
