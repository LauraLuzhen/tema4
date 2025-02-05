package boletin1.ej1;

/**
 * Clase que contiene las coordenadas x e y de un punto (x, y)
 */
public class Punto {
	/**
	 * Variable que guarda la coordenada x de un punto
	 */
	private int x;
	/**
	 * Variable que guarda la coordenada y de un punto
	 */
	private int y;
	
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Devuelve la coordenada x 
	 * @return La coordenada x del punto
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * Modifica la x
	 * @param x Número con la coordenada x de un punto
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * Devuelve la coordenada y
	 * @return La coordenada y del punto
	 */
	public int getY() {
		return y;
	}

	/**
	 * Modifica la y
	 * @param y Número con la coordenada y de un punto
	 */
	public void setY(int y) {
		this.y = y;
	}
}
