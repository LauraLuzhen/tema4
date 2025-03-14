package crud.ej3;

import java.util.Objects;

public class Pizza {
	enum Tamaño {
		MEDIANA, FAMILIAR
	}

	enum Tipo {
		MARGARITA, CUATRO_QUESOS, FUNGHI
	}

	enum Estado {
		PEDIDA, SERVIDA
	}

	private int codigo;
	private Tamaño tamaño = Tamaño.MEDIANA;
	private Tipo tipo = Tipo.CUATRO_QUESOS;
	private Estado estado = Estado.PEDIDA;
	
	public Pizza(int codigo) {
		if (codigo >= 0) {
			this.codigo = codigo;
		}
	}

	public Pizza(int codigo, String tamaño, String tipo, String estado) {
		if (codigo >= 0) {
			this.codigo = codigo;
		}
		setTamaño(tamaño);
		setTipo(tipo);
		setEstado(estado);
	}

	public Tamaño getTamaño() {
		return tamaño;
	}
	public void setTamaño(String tamaño) {
		tamaño = tamaño.toUpperCase();
		switch (tamaño) {
		case "MEDIANA", "FAMILIAR" -> {
			this.tamaño = Tamaño.valueOf(tamaño);
		}
		}
	}
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		tipo = tipo.toUpperCase();
		switch (tipo) {
		case "MARGARITA", "CUATRO_QUESOS", "FUNGHI" -> {
			this.tipo = Tipo.valueOf(tipo);
		}
		}
	}
	public Estado getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		estado = estado.toUpperCase();
		switch (estado) {
		case "PEDIDA", "SERVIDA" -> {
			this.estado = Estado.valueOf(estado);
		}
		}
	}
	public int getCodigo() {
		return codigo;
	}

	@Override
	public String toString() {
		return codigo + ": " + tamaño + " - " + tipo + " - " + estado;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(codigo);
	}

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
