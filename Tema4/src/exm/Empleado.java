package exm;

public class Empleado {

	private String dni;
	private String nombre;
	private double sueldoBase;
	private int horasExtras;
	private static double importeHorasExtras = 25;
	
	public Empleado(String dni) {
		if (dni != null && !dni.isBlank()) {
			this.dni = dni;
		}
	}
	
	public Empleado(String dni, String nombre, double sueldoBase, int horasExtras) {
		
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}
	
	public double getSueldoBase() {
		return sueldoBase;
	}
	
	public void setSueldoBase(double sueldoBase) {
		if (sueldoBase > 0) {
			this.sueldoBase = sueldoBase;
		}
	}
	
	public int getHorasExtras() {
		return horasExtras;
	}
	
	public void setHorasExtras(int horasExtras) {
		if (horasExtras >= 0) {
			this.horasExtras = horasExtras;
		}
	}
	
	public double getImporteHorasExtras() {
		return importeHorasExtras;
	}
	
	public String getDni() {
		return dni;
	}
	
	public double calcularComplemento() {
		return horasExtras * importeHorasExtras;
	}
	
	public double sueldoBruto() {
		return sueldoBase + calcularComplemento();
	}
	
	@Override
	public String toString() {
		return dni + " " + nombre + "\nHoras extras: " + horasExtras + "\nSueldo bruto: " + sueldoBase;
	}
	
	@Override
	public boolean equals(Object o) {
		boolean res = false;
		Empleado empleado = (Empleado) o;
		if (this.dni.equals(empleado.dni)) {
			res = true;
		}
		return res;
	}
}
