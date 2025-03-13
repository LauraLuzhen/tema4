package boletin4.ej4;

public class Fraccion {
	private int numerador;
	private int denominador;

	public Fraccion(int numerador, int denominador) {
		this.numerador = numerador;
		this.denominador = denominador;
		simplifica();
	}

	public int getNumerador() {
		return numerador;
	}

	public void setNumerador(int numerador) {
		this.numerador = numerador;
		simplifica();
	}

	public int getDenominador() {
		return denominador;
	}

	public void setDenominador(int denominador) {
		if (denominador != 0) {
			this.denominador = denominador;
		}
		simplifica();
	}

	public Fraccion suma(Fraccion f) {
		int num = this.numerador * f.denominador + f.numerador * this.denominador;
		int deno = this.denominador * f.denominador;
		return new Fraccion(num, deno);
	}

	public Fraccion resta(Fraccion f) {
		int num = this.numerador * f.denominador - f.numerador * this.denominador;
		int deno = this.denominador * f.denominador;
		return new Fraccion(num, deno);
	}

	public Fraccion multiplica(Fraccion f) {
		int num = this.numerador * f.numerador;
		int deno = this.denominador * f.denominador;
		return new Fraccion(num, deno);
	}

	public Fraccion divide(Fraccion f) {
		if (f.numerador == 0) {
			throw new ArithmeticException("No se puede dividir entre 0.");
		}
		int num = this.numerador * f.denominador;
		int deno = this.denominador * f.numerador;
		return new Fraccion(num, deno);
	}

	private void simplifica() {
		int mcd = maximoComunDivisor(Math.abs(numerador), Math.abs(denominador));
		numerador /= mcd;
		denominador /= mcd;
		if (denominador < 0) {
			numerador = -numerador;
			denominador = -denominador;
		}
	}

	private int maximoComunDivisor(int a, int b) {
		if (b == 0) {
			return a;
		}
		return maximoComunDivisor(b, a % b);
	}

	public String toString() {
		return numerador + "/" + denominador;
	}
}
