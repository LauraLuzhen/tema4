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

	/**
	 * Constructor con todos los parámetros
	 * 
	 * @param x La coordenada x de un punto
	 * @param y La coordenada y de un punto
	 */
	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Devuelve la coordenada x
	 * 
	 * @return La coordenada x del punto
	 */
	public int getX() {
		return x;
	}

	/**
	 * Modifica la x
	 * 
	 * @param x Número con la coordenada x de un punto
	 */
	public void setX(int x) {
		this.x = x;
	}

	/**
	 * Devuelve la coordenada y
	 * 
	 * @return La coordenada y del punto
	 */
	public int getY() {
		return y;
	}

	/**
	 * Modifica la y
	 * 
	 * @param y Número con la coordenada y de un punto
	 */
	public void setY(int y) {
		this.y = y;
	}

	/**
	 * Método que modifica las coordenadas x e y
	 * 
	 * @param x La coordenada x del punto
	 * @param y La coordenada y del punto
	 */
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * Método que desplaza las coordenadas x e y una cantidad de veces
	 * 
	 * @param dx Cantidad de desplazamiento de x
	 * @param dy Cantidad de desplazamiento de y
	 */
	public void desplaza(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}

	/**
	 * Método que calcula la distancia entre las coordenadas de dos puntos
	 * 
	 * @param p Objeto de tipo Punto
	 * @return La distancia entre p y el punto
	 */
	public double distancia(Punto p) {
		return Math.abs(Math.sqrt(Math.pow(p.x - this.x, 2)) + Math.sqrt(Math.pow(p.y - this.y, 2)));
	}

	/**
	 * Método toString del punto donde se muestra la coordenada x e y
	 */
	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}
