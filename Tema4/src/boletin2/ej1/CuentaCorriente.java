package boletin2.ej1;

import java.util.Objects;

public class CuentaCorriente {

	private String dni;
	private String nombre;
	private double saldo;
	
	enum Nacionalidad {ESPAÑOLA, EXTRANJERA} 
	
	public CuentaCorriente (String dni, double saldoInicial) {
		if (!dni.isBlank() && dni.length() == 9) {
			this.dni = dni;
		}
		if (saldoInicial > 0) {
			this.saldo = saldoInicial;
		}
	}
	
	public CuentaCorriente (String dni, String nombre, double saldoInicial) {
		if (!dni.isBlank() && dni.length() == 9) {
			this.dni = dni;
		}
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		if (saldoInicial > 0) {
			this.saldo = saldoInicial;
		}
	}
	
	public CuentaCorriente (String dni, String nombre, double saldoInicial, String nacionalidad) {
		if (!dni.isBlank() && dni.length() == 9) {
			this.dni = dni;
		}
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		if (saldoInicial > 0) {
			this.saldo = saldoInicial;
		}
		switch (nacionalidad) {
		case "ESPAÑOLA" -> {
			Nacionalidad.valueOf(nacionalidad);
		}
		case "EXTRANJERA" -> {
			Nacionalidad.valueOf(nacionalidad);
		}
		default -> {
			
		}
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		if (saldo > 0) {
			this.saldo = saldo;
		}
	}

	public String getDni() {
		return dni;
	}
	
	public boolean sacarDinero (double cantidad) {
		boolean dineroSacado = false;
		return dineroSacado;
	}

	@Override
	public String toString() {
		return "CuentaCorriente [dni=" + dni + ", nombre=" + nombre + ", saldo=" + saldo + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CuentaCorriente other = (CuentaCorriente) obj;
		return Objects.equals(dni, other.dni) && Objects.equals(nombre, other.nombre);
	}
	
	
}
