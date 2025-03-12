package boletin2.ej1;

public class CuentaCorriente {
	/**
	 * Atributo dni de la cuenta corriente
	 */
	private String dni;
	/**
	 * Atributo nombre de la cuenta corriente
	 */
	private String nombre;
	/**
	 * Atributo saldo de la cuenta corriente
	 */
	private double saldo;
	/**
	 * Atributo nacionalidad de la cuenta corriente
	 */
	private Nacionalidad nacionalidad = Nacionalidad.ESPAÑOLA;

	/**
	 * Enum de Nacionalidad
	 */
	enum Nacionalidad {
		ESPAÑOLA, EXTRANJERA
	}

	/**
	 * Constructor de CuentaCorriente
	 * 
	 * @param dni   El dni de la cuenta corriente
	 * @param saldo El saldo de la cuenta corriente
	 */
	public CuentaCorriente(String dni, double saldo) {
		if (dni != null && !dni.isBlank()) {
			this.dni = dni;
		}
		if (saldo >= 0) {
			this.saldo = saldo;
		}
	}

	/**
	 * Constructor de CuentaCorriente
	 * 
	 * @param dni    El dni de la cuenta corriente
	 * @param nombre El nombre de la cuenta corriente
	 * @param saldo  El saldo de la cuenta corriente
	 */
	public CuentaCorriente(String dni, String nombre, double saldo) {
		if (dni != null && !dni.isBlank()) {
			this.dni = dni;
		}
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		if (saldo >= 0) {
			this.saldo = saldo;
		}
	}

	/**
	 * Constructor de Cuenta Corriente
	 * 
	 * @param dni          El dni de la cuenta corriente
	 * @param nombre       El nombre de la cuenta corriente
	 * @param saldo        El saldo de la cuenta corriente
	 * @param nacionalidad La nacionalidad de la cuenta corriente
	 */
	public CuentaCorriente(String dni, String nombre, double saldo, String nacionalidad) {
		if (dni != null && !dni.isBlank()) {
			this.dni = dni;
		}
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		if (saldo >= 0) {
			this.saldo = saldo;
		}
		setNacionalidad(nacionalidad);
	}

	/**
	 * Método get del nombre
	 * 
	 * @return El valor del nombre de la cuenta corriente
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Método set del nombre
	 * 
	 * @param nombre El valor nuevo del nombre de la cuenta corriente
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}

	/**
	 * Método get del saldo
	 * 
	 * @return El valor del saldo de la cuenta corriente
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Método set del saldo
	 * 
	 * @param saldo El nuevo valor del saldo de la cuenta corriente
	 */
	public void setSaldo(double saldo) {
		if (saldo >= 0) {
			this.saldo = saldo;
		}
	}

	/**
	 * Método get de nacionalidad
	 * 
	 * @return El valor de la nacionalidad de la cuenta corriente
	 */
	public Nacionalidad getNacionalidad() {
		return nacionalidad;
	}

	/**
	 * Método set de nacionalidad
	 * 
	 * @param nacionalidad El nuevo valor de la nacionalidad
	 */
	public void setNacionalidad(String nacionalidad) {
		nacionalidad = nacionalidad.toUpperCase();
		switch (nacionalidad) {
		case "ESPAÑOLA", "EXTRANJERA" -> {
			this.nacionalidad = Nacionalidad.valueOf(nacionalidad);
		}
		}
	}

	/**
	 * Método get del dni
	 * 
	 * @return El valor del dni de la cuenta corriente
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Método sacarDinero que saca una cantidad de dinero si tiene el saldo
	 * suficiente
	 * 
	 * @param cantidad La cantidad que se va a sacar de la cuenta
	 * @return Si se ha realizado la operación
	 */
	public boolean sacarDinero(int cantidad) {
		boolean sacar = false;
		if (saldo - Math.abs(cantidad) >= 0) {
			this.saldo -= cantidad;
			sacar = true;
		}
		return sacar;
	}

	/**
	 * Método ingresarDinero que ingresa una cantidad de dinero al saldo si es
	 * positivo
	 * 
	 * @param cantidad La cantidad que se va a ingresar a la cuenta
	 * @return Si se ha ingresado la cantidad
	 */
	public boolean ingresarDinero(int cantidad) {
		boolean ingreso = false;
		if (cantidad > 0) {
			this.saldo += cantidad;
		}
		return ingreso;
	}

	/**
	 * Método toString de la clase CuentaCorriente
	 */
	@Override
	public String toString() {
		return "Cuenta corriente: dni " + dni + ", nombre " + nombre + ", saldo " + saldo + ", nacionalidad "
				+ nacionalidad;
	}

	/**
	 * Método equals de la clase CuentaCorriente, dos cuentas son iguales si
	 * coinciden con el dni y nombre
	 */
	@Override
	public boolean equals(Object obj) {
		CuentaCorriente cuenta = (CuentaCorriente) obj;
		boolean res = false;
		if (this.dni.equals(cuenta.dni) && this.nombre.equals(cuenta.nombre)) {
			res = true;
		}
		return res;
	}
}