package boletin2.ej4;

public class Pizza {
	/**
	 * Enum tamaño que guarda los posibles tamaños
	 */
	enum Tamaño {
		MEDIANA, FAMILIAR
	}

	/**
	 * Enum Tipo que guarda los posibles tipos de una pizza
	 */
	enum Tipo {
		MARGARITA, CUATRO_QUESOS, FUNGHI
	}

	/**
	 * Enum de estado del pedido de la pizza
	 */
	enum Estado {
		PEDIDA, SERVIDA
	}

	/**
	 * Atributo codigo de la pizza
	 */
	private int codigo;
	/**
	 * Atributo tamaño de la pizza
	 */
	private Tamaño tamaño = Tamaño.MEDIANA;
	/**
	 * Atributo tipo de la pizza
	 */
	private Tipo tipo = Tipo.CUATRO_QUESOS;
	/**
	 * Atributo estado de la pizza
	 */
	private Estado estado = Estado.PEDIDA;

	/**
	 * Constructor de Pizza que recibe todos los atributos de la clase
	 * 
	 * @param codigo El código de la pizza
	 * @param tamaño El tamaño de la pizza
	 * @param tipo   El tipo de pizza
	 * @param estado El estado del pedido de la pizza
	 */
	public Pizza(int codigo, String tamaño, String tipo, String estado) {
		if (codigo >= 0) {
			this.codigo = codigo;
		}
		setTamaño(tamaño);
		setTipo(tipo);
		setEstado(estado);
	}

	/**
	 * Método get de tamaño
	 * 
	 * @return El valor del tamaño de la pizza
	 */
	public Tamaño getTamaño() {
		return tamaño;
	}

	/**
	 * Método set de tamaño
	 * 
	 * @param tamaño El nuevo tamaño de la pizza
	 */
	public void setTamaño(String tamaño) {
		tamaño = tamaño.toUpperCase();
		switch (tamaño) {
		case "MEDIANA", "FAMILIAR" -> {
			this.tamaño = Tamaño.valueOf(tamaño);
		}
		}
	}

	/**
	 * Método get del tipo
	 * 
	 * @return El tipo de pizza
	 */
	public Tipo getTipo() {
		return tipo;
	}

	/**
	 * Método set del tipo
	 * 
	 * @param tipo El nuevo tipo de la pizza
	 */
	public void setTipo(String tipo) {
		tipo = tipo.toUpperCase();
		switch (tipo) {
		case "MARGARITA", "CUATRO_QUESOS", "FUNGHI" -> {
			this.tipo = Tipo.valueOf(tipo);
		}
		}
	}

	/**
	 * Método get de estado
	 * 
	 * @return El estado de la pizza
	 */
	public Estado getEstado() {
		return estado;
	}

	/**
	 * Método set de estado
	 * 
	 * @param estado El nuevo estado de la pizza
	 */
	public void setEstado(String estado) {
		estado = estado.toUpperCase();
		switch (estado) {
		case "PEDIDA", "SERVIDA" -> {
			this.estado = Estado.valueOf(estado);
		}
		}
	}

	/**
	 * Método get del código
	 * 
	 * @return El código de la pizza
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * Método toString de la clase Pizza
	 */
	@Override
	public String toString() {
		return codigo + ": " + tamaño + " - " + tipo + " - " + estado;
	}

	/**
	 * Método equals de la clase Pizza
	 */
	@Override
	public boolean equals(Object obj) {
		Pizza pizza = (Pizza) obj;
		boolean res = false;
		if (this.codigo == pizza.codigo) {
			res = true;
		}
		return res;
	}
}