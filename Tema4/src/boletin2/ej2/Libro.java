package boletin2.ej2;

public class Libro {

	/**
	 * Variable que guarda el título del libro
	 */
	private String titulo;
	/**
	 * Variable que guarda el nombre del autor
	 */
	private String autor;
	/**
	 * Variable que guarda el número de ejemplares de un libro
	 */
	private int numEjemplares;
	/**
	 * Variable que guarda el total de número presato
	 */
	private int numPrestado;
	/**
	 * Variable que guarda el género por defecto de un libro
	 */
	private Genero genero = Genero.DIDÁCTICO;
	
	/**
	 * Enum Genero que puede tomar los valores: narrativo, lírico, dramático, didáctico, poético
	 */
	enum Genero {
		NARRATIVO, LÍRICO, DRAMÁTICO, DIDÁCTICO, POÉTICO
	}
	
	/**
	 * Constructor Libro que recibe titulo y autor
	 * @param titulo Del libro
	 * @param autor Del libro
	 */
	public Libro (String titulo, String autor) {
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}
		if (autor != null && !autor.isBlank()) {
			this.autor = autor;
		}
	}
	
	/**
	 * Constructor Libro que recibe titulo, autor, numEjemplares, numPrestado
	 * @param titulo Del libro
	 * @param autor Del libro
	 * @param numEjemplares Del libro
	 * @param numPrestado Del libro
	 */
	public Libro (String titulo, String autor, int numEjemplares, int numPrestado) {
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}
		if (autor != null && !autor.isBlank()) {
			this.autor = autor;
		}
		if (numEjemplares > 0) {
			this.numEjemplares = numEjemplares;
		}
		if (numPrestado >= 0) {
			this.numPrestado = numPrestado;
		}
	}
	
	/**
	 * Constructor Libro que recibe todos los parámetros
	 * @param titulo Del libro
	 * @param autor Del libro
	 * @param numEjemplares Del libro
	 * @param numPrestado Del libro
	 * @param genero Del libro
	 */
	public Libro (String titulo, String autor, int numEjemplares, int numPrestado, String genero) {
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}
		if (autor != null && !autor.isBlank()) {
			this.autor = autor;
		}
		if (numEjemplares > 0) {
			this.numEjemplares = numEjemplares;
		}
		if (numPrestado >= 0) {
			this.numPrestado = numPrestado;
		}
		switch(genero) {
		case "LÍRICO" -> {
			this.genero = Genero.LÍRICO;
		}
		case "DRAMÁTICO" -> {
			this.genero = Genero.DRAMÁTICO;
		}
		case "DIDÁCTICO" -> {
			this.genero = Genero.DRAMÁTICO;
		}
		case "POÉTICO" -> {
			this.genero = Genero.POÉTICO;
		}
		}
	}

	/**
	 * Obtiene el título
	 * @return El título del libro
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Modifica el título
	 * @param titulo Del libro
	 */
	public void setTitulo(String titulo) {
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}
	}

	/**
	 * Obtenemos el autor
	 * @return El nombre del autor del libro
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * Modifica el autor
	 * @param autor Del libro
	 */
	public void setAutor(String autor) {
		if (autor != null && !autor.isBlank()) {
			this.autor = autor;
		}
	}

	/**
	 * Obtenemos el número de ejemplares
	 * @return El número de ejemplares que tiene el libro
	 */
	public int getNumEjemplares() {
		return numEjemplares;
	}

	/**
	 * Modificamos la cantidad de números de ejemplares
	 * @param numEjemplares Del libro
	 */
	public void setNumEjemplares(int numEjemplares) {
		if (numEjemplares > 0) {
			this.numEjemplares = numEjemplares;
		}
	}

	/**
	 * Obtenemos el número prestado
	 * @return Número de libros prestados
	 */
	public int getNumPrestado() {
		return numPrestado;
	}

	/**
	 * Modifica la cantidad de libros prestados
	 * @param numPrestado Cantidad de libros prestados
	 */
	public void setNumPrestado(int numPrestado) {
		if (numPrestado >= 0) {
			this.numPrestado = numPrestado;
		}
	}

	/**
	 * Obtenemos el género
	 * @return El género del libro
	 */
	public Genero getGenero() {
		return genero;
	}
	
	/**
	 * Método que realiza el préstamo de un libro si quedan ejemplares disponibles
	 * @return True si se ha realizado la operación
	 */
	public boolean prestamo () {
		boolean realizado = false;
		
		if (numPrestado < numEjemplares) {
			this.numPrestado++;
			realizado = true;
		}
		
		return realizado;
	}
	
	/**
	 * Método que realiza la devolución de un libro si hay libros prestados
	 * @return True si se ha realizado la operación
	 */
	public boolean devolucion () {
		boolean realizado = false;
		
		if (numPrestado > 0) {
			this.numPrestado--;
			realizado = true;
		}
		
		return realizado;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", numEjemplares=" + numEjemplares + ", numPrestado="
				+ numPrestado + ", genero=" + genero + "]";
	}


	@Override
	public boolean equals(Object obj) {
		Libro other = (Libro) obj;
		boolean res = false;
		
		if (this.autor.equals(other.autor) && this.titulo.equals(other.titulo)) {
			res = true;
		}
		
		return res;
	}
	
	
}
