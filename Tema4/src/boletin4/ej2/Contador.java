package boletin4.ej2;

import java.util.Objects;

public class Contador {
	private int cont;
	
	public Contador(int cont) {
		if (cont > 0) {
			this.cont = cont;
		}
	}

	public int getCont() {
		return cont;
	}
	public void setCont(int cont) {
		if (cont > 0) {
			this.cont = cont;
		}
	}
	
	public void incrementar() {
		this.cont += 1;
	}

	public void decrementar() {
		if (cont >= 1) {
			this.cont -= 1;
		}

	}

	public String toString() {
		return "Contador: " + cont;

	}
	
	public int hashCode() {
		return Objects.hash(cont);
	}

	public boolean equals(Object obj) {
		Contador contador = (Contador) obj;
		boolean res = false;
		if (this.cont == contador.getCont()) {
			res = true;
		}
		return res;
	}
}
