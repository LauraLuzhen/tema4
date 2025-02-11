package boletin2.ej1;

public class CuentaCorriente {

	/**
	 * Variable que guarda el DNI de la cuenta
	 */
	private String dni;
	
	/**
	 * Variable que guarda el nombre del titular de la cuenta
	 */
	private String nombre;
	
	/**
	 * Variable que guarda el saldo que tiene la cuenta
	 */
	private double saldo;
	
	/**
	 * Variable que guarda la nacionalidad del titular de la cuenta
	 */
	private Nacionalidad nacionalidad = Nacionalidad.EXTRANJERA;
	
	/**
	 * Enum donde la nacionalidad puede ser española o extranjera
	 */
	enum Nacionalidad {
		ESPAÑOLA, EXTRANJERA
		} 
	
	/**
	 * Construntor de CuentaCorriente
	 * @param dni Del titular de la cuenta
	 * @param saldoInicial De la cuenta
	 */
	public CuentaCorriente (String dni, double saldoInicial) {
		if (dni != null && !dni.isBlank()) {
			this.dni = dni;
		}
		if (saldoInicial > 0) {
			this.saldo = saldoInicial;
		}
	}
	
	/**
	 * Constructor de CuentaCorriente
	 * @param dni Del titular de la cuenta
	 * @param nombre Delt titular de la cuenta
	 * @param saldoInicial De la cuenta
	 */
	public CuentaCorriente (String dni, String nombre, double saldoInicial) {
		if (dni != null && !dni.isBlank()) {
			this.dni = dni;
		}
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		if (saldoInicial > 0) {
			this.saldo = saldoInicial;
		}
	}
	
	/**
	 * Constructor de CuentaCorriente que recibe todos los parámetros
	 * @param dni Del titular de la cuenta
	 * @param nombre Del titular de la cuenta
	 * @param saldoInicial De la cuenta
	 * @param nacionalidad Del titular de la cuenta
	 */
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
			this.nacionalidad = Nacionalidad.ESPAÑOLA;
		}
		}
	}

	/**
	 * Obtenemos el contenido del nombre
	 * @return El nombre del titular de la cuenta
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Modificamos el nombre
	 * @param nombre Del titular de la cuenta
	 */
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}

	/**
	 * Obtenemos el saldo
	 * @return El saldo de la cuenta
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Modificamos el saldo
	 * @param saldo De la cuenta
	 */
	public void setSaldo(double saldo) {
		if (saldo > 0) {
			this.saldo = saldo;
		}
	}

	/**
	 * Obtenemos el dni
	 * @return El dni del titular de la cuenta
	 */
	public String getDni() {
		return dni;
	}
	
	/**
	 * Método que saca una cantidad de dinero de la cuenta
	 * @param cantidad Que quiero sacar de la cuenta
	 * @return True si se ha podido sacar la cantidad de dinero deseada
	 */
	public boolean sacarDinero (double cantidad) {
		boolean dineroSacado = false;
		
		if (cantidad < saldo) {
			this.saldo -= cantidad;
			dineroSacado = true;
		}
		
		return dineroSacado;
	}

	/**
	 * Método que ingresa una cantidad de dinero a la cuenta
	 * @param cantidad Que quiero ingresar a la cuenta
	 * @return True si se ha podido ingresar el dinero
	 */
	public boolean ingresarDinero (double cantidad) {
		boolean dineroIngresado = false;
		
		if (cantidad > 0) {
			this.saldo += cantidad;
			dineroIngresado = true;
		}
		
		return dineroIngresado;
	}
	
	@Override
	public String toString() {
		return "CuentaCorriente [dni=" + dni + ", nombre=" + nombre + ", saldo=" + saldo + ", nacionalidad="
				+ nacionalidad + "]";
	}

	@Override
	public boolean equals(Object obj) {
		CuentaCorriente other = (CuentaCorriente) obj;
		boolean res = false;
		
		if (this.dni.equals(other.dni) && this.nombre.equals(other.nombre)) {
			res = true;
		}
		
		return res;
	}
}
