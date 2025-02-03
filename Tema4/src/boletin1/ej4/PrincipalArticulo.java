package boletin1.ej4;

public class PrincipalArticulo {

	public static void main(String[] args) {
		
		double pvp;
		
		Articulo ar1 = new Articulo();
		
		ar1.nombre = "Pijama";
		ar1.precio = 10;
		ar1.cuantosQuedan = 3;
		
		pvp = ((ar1.precio * ar1.IVA) / 100.0) + ar1.precio;
		
		System.out.println(ar1.nombre + " - Precio:" + ar1.precio + "€ - IVA:" + ar1.IVA + "% - PVP:" + pvp + "€ - Cantidad:" + ar1.cuantosQuedan);
	}
}
