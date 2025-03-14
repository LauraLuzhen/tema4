package crud.ej2;

import java.util.HashSet;
import java.util.Set;

public class ArticuloCrud {

	private static Set<Articulo> articulos = new HashSet<Articulo>();

	public static void listarArticulos() {
		for (Articulo articulo : articulos) {
			System.out.println(articulo);
			System.out.println("--------------------------------------");
		}
	}

	public static boolean añadirArticulo(Articulo a) {
		return articulos.add(a);
	}

	public static boolean eliminarArticulo(Articulo a) {
		return articulos.remove(a);
	}

	public static boolean modificarPrecio(Articulo a, double precio) {
		boolean realizado = false;
		Articulo articulo = buscarArticulo(a);
		if (articulo != null) {
			articulo.setPrecio(precio);
			realizado = true;
		}
		return realizado;
	}

	private static Articulo buscarArticulo(Articulo a) {
		Articulo art = null;
		for (Articulo articulo : articulos) {
			if (articulo.equals(a)) {
				art = articulo;
			}
		}
		return art;
	}

	public static boolean entradaMercancia(Articulo a, int cantidad) {
		boolean realizado = false;
		Articulo articulo = buscarArticulo(a);
		if (articulo != null) {
			realizado = true;
			articulo.setCuantosQuedan(articulo.getCuantosQuedan() + cantidad);
		}
		return realizado;
	}

	public static boolean salidaMercancia(Articulo a, int cantidad) {
		boolean realizado = false;
		Articulo articulo = buscarArticulo(a);
		if (articulo != null) {
			if (cantidad <= articulo.getCuantosQuedan()) {
				realizado = true;
				articulo.setCuantosQuedan(articulo.getCuantosQuedan() - cantidad);
			}
		}
		return realizado;
	}
}
