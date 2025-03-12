package boletin1.ej4;

public class ArticuloMain {

	public static void main(String[] args) {
		// Creamos dos artículos
		Articulo a1 = new Articulo("Nombre1", 18.2, 13);
		Articulo a2 = new Articulo("Nombre2", 12.1, 9);

		// Imprimimos la información de cada artículo
		System.out.println(a1);
		System.out.println(a2);

		// Obtenemos el pvp y el descuento
		System.out.println("Artículo 1 con IVA: " + a1.getPVP());
		System.out.println("Artículo 2 con descuento del 50%: " + a2.getDescuento(50));

		// Modificamos con los métodos vender y almacenar las cantidades que quedan
		a1.vender(7);
		a2.almacenar(2);
		System.out.println(a1);
		System.out.println(a2);
	}
}
