package boletin1.ej2;

public class PrincipalPersona {

	public static void main(String[] args) {
		
		Persona p1 = new Persona();
		Persona p2 = new Persona();
		
		p1.nombre = "Laura";
		p1.apellidos = "Rodríguez Morán";
		p1.dni = "123456789Q";
		p1.edad = 19;
		
		p2.nombre = "Alba";
		p2.apellidos = "Hola que tal";
		p2.dni = "987654321H";
		p2.edad = 16;
		
		System.out.print(p1.nombre + " " + p1.apellidos + " con DNI " + p1.dni);
		System.out.println(p1.edad < 18 ? " es menor de edad." : " es mayor de edad");
		
		System.out.print(p2.nombre + " " + p2.apellidos + " con DNI " + p2.dni);
		System.out.println(p2.edad < 18 ? " es menor de edad." : " es mayor de edad");
	}
}
