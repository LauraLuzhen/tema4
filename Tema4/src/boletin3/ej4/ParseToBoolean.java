package boletin3.ej4;

public class ParseToBoolean {

	/**
	 * Método que si recibe un 1 da true 
	 * @param numero El número entero
	 * @return Si es uno es true
	 */
    public static boolean parseToBoolean(int numero) {
        boolean resultado;
        if (numero == 1) {
        	resultado = true;
        } else {
        	resultado = false;
        }
        return resultado;
    }

    /**
     * Método que convierte el texto en un valor booleano
     * @param texto El texto que recibe
     * @return El texto en booleano
     */
    public static boolean parseToBoolean(String texto) {
        return "true".equalsIgnoreCase(texto);
    }
}
