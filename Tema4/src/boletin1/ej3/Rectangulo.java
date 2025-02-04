package boletin1.ej3;

/**
 * Clase que guarda dos coordenadas que forman un rectángulo
 */
public class Rectangulo {

	/*
	 * Variables que guarda las coordenadas x e y de dos puntos
	 */
	int x1, y1, x2, y2;

	/**
	 * Constructor con todos los parámetros
	 * @param x1 Coordenada x de la esquina inferior izquierda
	 * @param y1 Coordenada y de la esquina inferior izquierda
	 * @param x2 Coordenada x de la esquina superior derecha
	 * @param y2 Coordenada y de la esquina superior derecha
	 */
	public Rectangulo(int x1, int y1, int x2, int y2) {
		if (x1 < x2 ) {
			this.x1 = x1;
		}
		if (y1 < y2) {
			this.y1 = y1;
		}
		if (x2 > x1) {
			this.x2 = x2;
		}
		if (y2 > y1) {
			this.y2 = y2;
		}
	}
	
	
}
