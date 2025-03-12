package boletin1.ej3;

public class Rectangulo {
	/**
	 * Atributo coordenada x del punto 1
	 */
	private int x1;
	/**
	 * Atributo coordenada y del punto 1
	 */
	private int y1;
	/**
	 * Atributo coordenada x del punto 2
	 */
	private int x2;
	/**
	 * Atributo coordenada y del punto 2
	 */
	private int y2;

	/**
	 * Constructor que recibe todos los atributos como parámetros de entrada
	 * 
	 * @param x1 Coordenada x del punto 1
	 * @param y1 Coordenada y del punto 1
	 * @param x2 Coordenada x del punto 2
	 * @param y2 Coordenada y del punto 2
	 */
	public Rectangulo(int x1, int y1, int x2, int y2) {
		if (x1 < x2 && y1 < y2) {
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
		}
	}

	/**
	 * Método get de x1
	 * 
	 * @return El valor de x1
	 */
	public int getX1() {
		return x1;
	}

	/**
	 * Método set de x1
	 * 
	 * @param x1 El valor nuevo de x1
	 */
	public void setX1(int x1) {
		if (x1 < x2) {
			this.x1 = x1;
		}
	}

	/**
	 * Método get de y1
	 * 
	 * @return El valor de y1
	 */
	public int getY1() {
		return y1;
	}

	/**
	 * Método set de y1
	 * 
	 * @param y1 El valor nuevo de y1
	 */
	public void setY1(int y1) {
		if (y1 < y2) {
			this.y1 = y1;
		}
	}

	/**
	 * Método get de x2
	 * 
	 * @return El valor de x2
	 */
	public int getX2() {
		return x2;
	}

	/**
	 * Método set de x2
	 * 
	 * @param x2 El nuevo valor de x2
	 */
	public void setX2(int x2) {
		if (x1 < x2) {
			this.x2 = x2;
		}
	}

	/**
	 * Método get de y2
	 * 
	 * @return El valor de y2
	 */
	public int getY2() {
		return y2;
	}

	/**
	 * Método set de y2
	 * 
	 * @param y2 El nuevo valor de y2
	 */
	public void setY2(int y2) {
		if (y1 < y2) {
			this.y2 = y2;
		}
	}

	/**
	 * Método que modifica las coordenadas x e y del punto 1
	 * 
	 * @param x1 Coordenada x del punto 1
	 * @param y1 Coordenada y del punto 1
	 */
	public void setX1Y1(int x1, int y1) {
		if (x1 < x2 && y1 < y2) {
			this.x1 = x1;
			this.y1 = y1;
		}
	}

	/**
	 * Método que modifica las coordenadas x e y del punto 2
	 * 
	 * @param x2 Coordenada x del punto 2
	 * @param y2 Coordenada y del punto 2
	 */
	public void setX2Y2(int x2, int y2) {
		if (x1 < x2 && y1 < y2) {
			this.x2 = x2;
			this.y2 = y2;
		}
	}

	/**
	 * Método que modifica todas las coordenadas x e y de ambos puntos
	 * 
	 * @param x1 Coordenada x del punto 1
	 * @param y1 Coordenada y del punto 1
	 * @param x2 Coordenada x del punto 2
	 * @param y2 Coordenada y del punto 2
	 */
	public void setAll(int x1, int y1, int x2, int y2) {
		if (x1 < x2 && y1 < y2) {
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
		}
	}

	/**
	 * Método que calcula el perímetro del rectángulo
	 * 
	 * @return El perímetro calculado
	 */
	public int getPerimetro() {
		int alto = y2 - y1;
		int ancho = x2 - x1;
		return (2 * alto) + (2 * ancho);
	}

	/**
	 * Método que calcula el área del rectángulo
	 * 
	 * @return El área calculada
	 */
	public int getArea() {
		int alto = y2 - y1;
		int ancho = x2 - x1;
		return alto * ancho;
	}

	/**
	 * Método toString de la clase Rectángulo
	 */
	@Override
	public String toString() {
		return "Coordenada punto 1: (" + x1 + ", " + y1 + ") y Coordenada punto 2: (" + x2 + ", " + y2 + ")";
	}
}
