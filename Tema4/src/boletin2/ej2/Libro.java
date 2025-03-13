package boletin2.ej2;

/**
 * Clase Libro donde guardamos la información de un libro
 */
public class Libro {
	/**
	 * Atributo titulo del libro
	 */
	private String titulo;
	/**
	 * Atributo autor del libro
	 */
	private String autor;
	/**
	 * Atributo ejemplares del libro
	 */
	private int ejemplares;
	/**
	 * Atributo presatados del libro
	 */
	private int prestados;
	/**
	 * Atributo genero del libro
	 */
	private Genero genero = Genero.NARRATIVO;

	/**
	 * Enum Genero que guarda los diferentes géneros de un libro
	 */
	enum Genero {
		NARRATIVO, LÍRICO, DRAMÁTICO, DIDÁCTICO, POÉTICO
	}

	/**
	 * Constructor de Libro
	 * 
	 * @param titulo El titulo del libro
	 * @param autor  El autor del libro
	 */
	public Libro(String titulo, String autor) {
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}
		if (autor != null && !autor.isBlank()) {
			this.autor = autor;
		}
	}

	/**
	 * Constructor de Libro
	 * 
	 * @param titulo     El titulo del libro
	 * @param autor      El autor del libro
	 * @param ejemplares El número de ejemplares del libro
	 * @param prestados  El número de prestados del libro
	 */
	public Libro(String titulo, String autor, int ejemplares, int prestados) {
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}
		if (autor != null && !autor.isBlank()) {
			this.autor = autor;
		}
		if (ejemplares > 0) {
			this.ejemplares = ejemplares;
			if (prestados <= ejemplares) {
				this.prestados = prestados;
			}
		}
	}

	/**
	 * Constructor de Libro que recibe todos los atributos
	 * 
	 * @param titulo     El titulo del Libro
	 * @param autor      El autor del libro
	 * @param ejemplares El número de ejemplares del libro
	 * @param prestados  El número de prestados del libro
	 * @param genero     El género del libro
	 */
	public Libro(String titulo, String autor, int ejemplares, int prestados, String genero) {
		if (titulo != null && !titulo.isBlank()) {
			this.titulo = titulo;
		}
		if (autor != null && !autor.isBlank()) {
			this.autor = autor;
		}
		if (ejemplares > 0) {
			this.ejemplares = ejemplares;
			if (prestados <= ejemplares) {
				this.prestados = prestados;
			}
		}
		setGenero(genero);
	}

	/**
	 * Méetodo get de ejemplares
	 * 
	 * @return La cantidad de ejemplares del libro
	 */
	public int getEjemplares() {
		return ejemplares;
	}

	/**
	 * Método set de ejemplares
	 * 
	 * @param ejemplares La nueva cantidad de ejemplares del libro
	 */
	public void setEjemplares(int ejemplares) {
		if (ejemplares > 0) {
			this.ejemplares = ejemplares;
		}
	}

	/**
	 * Método get de prestados
	 * 
	 * @return La cantidad de prestados del libro
	 */
	public int getPrestados() {
		return prestados;
	}

	/**
	 * Método set de prestados
	 * 
	 * @param prestados La nueva cantidad de prestados del libro
	 */
	public void setPrestados(int prestados) {
		if (prestados <= ejemplares) {
			this.prestados = prestados;
		}
	}

	/**
	 * Método get del género
	 * 
	 * @return El género del libro
	 */
	public Genero getGenero() {
		return genero;
	}

	/**
	 * Método set del género
	 * 
	 * @param genero El nuevo género del Lirbo
	 */
	public void setGenero(String genero) {
		genero = genero.toUpperCase();
		switch (genero) {
		case "NARRATIVO", "LÍRICO", "DRAMÁTICO", "DIDÁCTICO", "POÉTICO" -> {
			this.genero = Genero.valueOf(genero);
		}
		}
	}

	/**
	 * Método get del titulo
	 * 
	 * @return El titulo del libro
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * Método get del autor
	 * 
	 * @return El autor del libro
	 */
	public String getAutor() {
		return autor;
	}

	/**
	 * Método prestamo que aumenta uno el número de prestados si se puede realizar
	 * 
	 * @return Si se ha podido prestar el libro
	 */
	public boolean prestamo() {
		boolean realizado = false;
		if (prestados < ejemplares) {
			this.prestados++;
			realizado = true;
		}
		return realizado;
	}

	/**
	 * Método devolucion que disminuye la cantidad de prestados si se puede realizar
	 * 
	 * @return Si se ha podido realizar la devolución
	 */
	public boolean devolucion() {
		boolean realizado = false;
		if (prestados > 0 && ejemplares > 0) {
			this.prestados--;
			realizado = true;
		}
		return realizado;
	}

	/**
	 * Método toString de la clase Libro
	 */
	@Override
	public String toString() {
		return "Libro " + titulo + " de " + autor + ", ejemplares " + ejemplares + " y prestados " + prestados
				+ ", género " + genero;
	}

	/**
	 * Método equals de la clase Libro
	 */
	@Override
	public boolean equals(Object obj) {
		Libro libro = (Libro) obj;
		boolean res = false;
		if (this.titulo.equals(libro.titulo) && this.autor.equals(libro.autor)) {
			res = true;
		}
		return res;
	}
}