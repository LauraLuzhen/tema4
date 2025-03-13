package boletin4.ej1;

import java.util.Objects;

public class Hora {
	private int hora;
	private int minuto;
	private int segundo;

	public Hora(int hora, int minuto, int segundo) {
		if (hora <= 23 && hora >= 0) {
			this.hora = hora;
		}
		if (minuto <= 59 && hora >= 0) {
			this.minuto = minuto;
		}
		if (segundo <= 59 && hora >= 0) {
			this.segundo = segundo;
		}
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		if (hora <= 23 && hora >= 0) {
			this.hora = hora;
		}
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		if (minuto <= 59 && hora >= 0) {
			this.minuto = minuto;
		}
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		if (segundo <= 59 && hora >= 0) {
			this.segundo = segundo;
		}
	}

	public void incrementoSeg() {
		
	}

	public String toString() {
		return hora + ":" + minuto + ":" + segundo;
	}

	public int hashCode() {
		return Objects.hash(hora, minuto, segundo);
	}

	public boolean equals(Object obj) {
		Hora hora = (Hora) obj;
		boolean res = false;
		if (this.hora == hora.hora && this.minuto == hora.minuto && this.segundo == hora.segundo) {
			res = true;
		}
		return res;

	}
}
