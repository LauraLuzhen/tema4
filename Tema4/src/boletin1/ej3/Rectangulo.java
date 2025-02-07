package boletin1.ej3;

/**
 * Clase que guarda dos coordenadas que forman un rectángulo
 */
public class Rectangulo {

	/*
	 * Variables que guarda las coordenadas x e y de dos puntos
	 */
	private int x1, y1, x2, y2;
	
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
	
	/**
	 * Devuelve x1
	 * @return La coordenada x del primer punto
	 */
	public int getX1() {
		return x1;
	}

	/**
	 * Modifica x1
	 * @param x1 La coordenada x del primer punto debe ser menor a x2 (la coordenada x del segundo punto)
	 */
	public void setX1(int x1) {
		if (x1 < x2) {
			this.x1 = x1;
		}
	}

	/**
	 * Devuelve y1
	 * @returnn La coordenada y del primer punto
	 */
	public int getY1() {
		return y1;
	}

	/**
	 * Modifica y1
	 * @param y1 La coordenada y del primer punto debe ser menor a y2 (la coordenada y del segundo punto)
	 */
	public void setY1(int y1) {
		if (y1 < y2) {
			this.y1 = y1;
		}
	}

	/**
	 * Devuelve x2
	 * @return La coordenada x del segundo punto 
	 */
	public int getX2() {
		return x2;
	}

	/**
	 * Modifica x2
	 * @param x2 La coordenada x del segundo punto debe ser mayor que x1 (la coordenada x del primer punto)
	 */
	public void setX2(int x2) {
		if (x2 > x1) {
			this.x2 = x2;
		}
	}

	/**
	 * Devuelve y2
	 * @return La coordenaday del segundo punto
	 */
	public int getY2() {
		return y2;
	}

	/**
	 * Modifica y2
	 * @param y2 La coordenada y del segundo punto debe ser mayor que y1 (la coordenada y del primer punto)
	 */
	public void setY2(int y2) {
		if (y2 > y1) {
			this.y2 = y2;
		}
	}
	
	/**
	 * Método que modifica las coordenadas del primer punto x1 y y1
	 * @param x1 Coordenada x del primer punto
	 * @param y1 Coordenada y del primer punto
	 */
	public void setX1Y1 (int x1, int y1) {
		this.x1 = x1;
		this.y1 = y1;
	}
	
	/**
	 * Método que modifica las coordenadas del segundo punto x2 y y2
	 * @param x2 Coordenada x del segundo punto
	 * @param y2 Coordenada y del segundo punto
	 */
	public void setX2Y2 (int x2, int y2) {
		this.x2 = x2;
		this.y2 = y2;
	}
	
	/**
	 * Método que modifica todas las coordendas de ambos puntos
	 * @param x1 Coordenada x del primer punto
	 * @param y1 Coordenada y del primer punto
	 * @param x2 Coordenada x del segundo punto
	 * @param y2 Coordenada y del segundo punto
	 */
	public void setAll (int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	/**
	 * Método que calcula el perímetro del rectángulo
	 * @return El resultado del cálculo del perímetro
	 */
	public int getPerimetro () {
		
		int per = Math.abs(2 * (this.x1 - this.x2)) + Math.abs(2 * (this.y1 - this.y2));
		
		return per;
	}
	
	/**
	 * Método que calcula el área del rectángulo
	 * @return El resultado del área del rectángulo 
	 */
	public int getArea () {
		int area = Math.abs((this.x1 - this.x2) * (this.y1 - this.y2));
		
		return area;
	}

	@Override
	public String toString() {
		return "Rectangulo [x1=" + x1 + ", y1=" + y1 + ", x2=" + x2 + ", y2=" + y2 + "]";
	}
	
	
}
