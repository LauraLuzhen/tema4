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
	 * @param x La coordenada x de un punto
	 * @param y La coordenada y de un punto
	 */
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
	
	/**
	 * Método que modifica ambas coordenadas del punto
	 * @param x Coordenada x del punto
	 * @param y Coordenada y del punto
	 */
	public void setXY (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Método que modifica ambas coordenadas recibiendo la diferencia que hay
	 * @param dx Diferencia de x con respecto a la anterior
	 * @param dy Diferencia de y con respecto a la anterior
	 */
	public void desplaza (int dx, int dy) {
		this.x = dx + x;
		this.y = dy + y;
	}
	
	/**
	 * Método que calucla la distancia entre dos puntos
	 * @param p Coordenadas del punto que queremos saber la distancia del anterior punto
	 * @return La distancia entre el anterior punto y el punto introducido por parámetro
	 */
	public double distancia (Punto p) {
		double cx = p.x - this.x; 
		double cy = p.y - this.y;
		double d = Math.sqrt(Math.pow(cx, 2) - Math.pow(cy, 2));
		return d;
	}

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
}
