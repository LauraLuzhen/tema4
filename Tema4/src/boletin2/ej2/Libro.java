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
	 * O
	 * @return
	 */
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		if (autor != null && !autor.isBlank()) {
			this.autor = autor;
		}
	}

	public int getNumEjemplares() {
		return numEjemplares;
	}

	public void setNumEjemplares(int numEjemplares) {
		if (numEjemplares > 0) {
			this.numEjemplares = numEjemplares;
		}
	}

	public int getNumPrestado() {
		return numPrestado;
	}

	public void setNumPrestado(int numPrestado) {
		if (numPrestado >= 0) {
			this.numPrestado = numPrestado;
		}
	}

	public Genero getGenero() {
		return genero;
	}
	
	public boolean prestamo (int cantidad) {
		
	}
}
