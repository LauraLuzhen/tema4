package boletin2.ej4;

public class Pizza {

	/**
	 * Variable que guarda el código único de la pizza
	 */
	private int codigo;
	
	/**
	 * Variable que guarda el tamaño por defecto de la pizza
	 */
	private Tamaño tamaño = Tamaño.MEDIANA;
	
	/**
	 * Variable que guarda el tipo de pizza por defecto
	 */
	private Tipo tipo = Tipo.CUATRO_QUESOS;
	
	/**
	 * Variable que guarda el estado de la pizza
	 */
	private Estado estado = Estado.PEDIDA;
	
	/**
	 * Enum del tamaño de la pizza
	 */
	enum Tamaño {
		MEDIANA, FAMILIAR
	}
	
	/**
	 * Enum del tipo de pizza que puede ser
	 */
	enum Tipo {
		MARGARITA, CUATRO_QUESOS, FUNGHI
	}
	
	/**
	 * Enum del estado de la pizza
	 */
	enum Estado {
		PEDIDA, SERVIDA
	}
	
	/**
	 * Constructor de Pizza con su código, tamaño y tipo de pizza
	 * @param codigo De la pizza
	 * @param tamaño De la pizza
	 * @param tipo De la pizza
	 */
	public Pizza (int codigo, String tamaño, String tipo) {
		if (codigo > 0) {
			this.codigo = codigo;
		}
		switch (tamaño) {
		case "FAMILIAR" -> {
			this.tamaño = Tamaño.FAMILIAR;
		}
		}
		if (tipo != null && !tipo.isBlank()) {
		switch (tipo) {
		case "FUNGHI", "MARGARITA" -> {
			this.tipo = Tipo.valueOf(tipo);
		}
		}
		}
	}

	/**
	 * Obtenemos el tamaño de la pizza
	 * @return
	 */
	public Tamaño getTamaño() {
		return tamaño;
	}

	/**
	 * Modificamos el tamaño
	 * @param tamaño De la pizza
	 */
	public void setTamaño(String tamaño) {
		switch (tamaño) {
		case "FAMILIAR" -> {
			this.tamaño = Tamaño.FAMILIAR;
		}
		}
	}

	/**
	 * Obtenemos el tipo 
	 * @return El tipo de la pizza
	 */
	public Tipo getTipo() {
		return tipo;
	}

	/**
	 * Modificamos el tipo
	 * @param tipo De la pizza
	 */
	public void setTipo(String tipo) {
		if (tipo != null && !tipo.isBlank()) {
			switch (tipo) {
			case "FUNGHI", "MARGARITA" -> {
				this.tipo = Tipo.valueOf(tipo);
		}
		}
		}
	}

	/**
	 * Obtenemos el estado
	 * @return Estado de la pizza
	 */
	public Estado getEstado() {
		return estado;
	}

	/**
	 * Modificamos el estado
	 * @param estado De la pizza
	 */
	public void setEstado(String estado) {
		switch (estado) {
		case "SERVIDA" -> {
			this.estado = Estado.SERVIDA;
		}
		}
	}

	/**
	 * Obtenemos el código
	 * @return El código de la pizza
	 */
	public int getCodigo() {
		return codigo;
	}

	@Override
	public String toString() {
		return codigo + ": " + tamaño + " - " + tipo + " - " + estado;
	}

	@Override
	public boolean equals(Object obj) {
		Pizza other = (Pizza) obj;
		boolean res = false;
		
		if (this.codigo == other.codigo) {
			res = true;
		}
		
		return res;
	}
	
	
}
