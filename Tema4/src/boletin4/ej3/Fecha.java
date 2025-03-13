package boletin4.ej3;

import java.util.Objects;

public class Fecha {

	private int dia = 1;
	private int mes = 1;
	private int año = 2000;

	public Fecha(int dia, int mes, int año) {
		if (fechaCorrecta(dia, mes, año)) {
			this.dia = dia;
			this.mes = mes;
			this.año = año;
		}
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public boolean esBisiesto(int año) {
		boolean esBisiesto = false;
		if (año % 4 == 0 && año % 100 != 0) {
			esBisiesto = true;
		}
		return esBisiesto;
	}

	public boolean fechaCorrecta(int dia, int mes, int año) {
		boolean valido = false;
		if (año > 0) {
			switch (mes) {
			case 1, 3, 5, 7, 8, 10, 12 -> {
				if (dia <= 31) {
					valido = true;
				}

			}
			case 4, 6, 9, 11 -> {
				if (dia <= 30) {
					valido = true;
				}
			}
			case 2 -> {
				if (esBisiesto(año)) {
					if (dia <= 29) {
						valido = true;
					}
				} else if (dia <= 28) {
					valido = true;
				}
			}
			}
		}
		return valido;

	}

	public void diaSiguiente() {
		switch (mes) {
		case 1, 3, 5, 7, 8, 10, 12 -> {
			if (dia + 1 > 31) {
				this.dia = 1;
				if (mes == 12) {
					this.mes = 1;
					this.año += 1;
				} else {
					this.mes += 1;
				}
			} else {
				this.dia += 1;
			}
		}
		case 4, 6, 9, 11 -> {
			if (this.dia + 1 > 30) {
				this.dia = 1;
				this.mes += 1;
			} else {
				this.dia += 1;
			}
		}
		default -> {
		}
		}
	}

	public String toString() {
		return "Día " + dia + ", mes " + mes + ", año " + año;

	}

	public int hashCode() {
		return Objects.hash(dia, mes, año);
	}

	public boolean equals(Object obj) {
		Fecha fecha = (Fecha) obj;
		boolean res = false;
		if (this.dia == fecha.dia && this.mes == fecha.mes && this.año == fecha.año) {
			res = true;
		}
		return res;

	}
}
