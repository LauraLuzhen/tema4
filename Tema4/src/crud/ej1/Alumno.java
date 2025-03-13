package crud.ej1;

import java.util.Objects;

// boletin 2 ej 3

public class Alumno {
	private String nombre;
	private double notaMedia;

	public Alumno(String nombre) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
	}
	
	public Alumno(String nombre, double notaMedia) {
		if (nombre != null && !nombre.isBlank()) {
			this.nombre = nombre;
		}
		if (notaMedia >= 0 && notaMedia <= 10) {
			this.notaMedia = notaMedia;
		}
	}

	public double getNotaMedia() {
		return notaMedia;
	}
	public void setNotaMedia(double notaMedia) {
		if (notaMedia >= 0 && notaMedia <= 10) {
			this.notaMedia = notaMedia;
		}
	}
	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return nombre + " " + notaMedia;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		Alumno alumno = (Alumno) obj;
		boolean res = false;
		if (this.nombre.equals(alumno.nombre)) {
			res = true;
		}
		return res;
	}
}