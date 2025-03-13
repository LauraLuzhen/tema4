package exm;

import java.util.Scanner;

public class EmpleadoMain {

	static Scanner reader = new Scanner(System.in);

	public static void main(String[] args) {
		int opc;
		int horasExtras;
		String dni;
		double importe;
		Empleado empleado;

		System.out.println("Bienvenido empleado!!");

		do {
			menu();
			opc = reader.nextInt();
			reader.nextLine();

			switch (opc) {
			case 1 -> {
				// añadir
				empleado = crearEmpleado();
				if (EmpleadoCrud.añadirEmpleado(empleado)) {
					System.out.println("Realizado");
				} else {
					System.out.println("No realizado");
				}
			}
			case 2 -> {
				EmpleadoCrud.listarEmpleados();
			}
			case 3 -> {
				dni = pedirDni();
				horasExtras = pedirHorasExtras();
				empleado = new Empleado(dni);
				if (EmpleadoCrud.modificarHorasExtras(empleado, horasExtras)) {
					System.out.println("Realizado");
				} else {
					System.out.println("No realizado");
				}
			}
			case 4 -> {
				System.out.println("Introduce el importe: ");
				importe = reader.nextDouble();
				if (EmpleadoCrud.modificarImporte(importe)) {
					System.out.println("Realizado");
				} else {
					System.out.println("No realizado");
				}
			}
			case 5 -> {
				dni = pedirDni();
				empleado = new Empleado(dni);
				if (EmpleadoCrud.eliminarEmpleado(empleado)) {
					System.out.println("Realizado");
				} else {
					System.out.println("No realizado");
				}
			}
			case 0 -> {
				System.out.println("Saliendo del programa...");
			}
			default -> {
				System.out.println("Elige una opción válida");
			}
			}
		} while (opc != 0);

		reader.close();
	}

	public static void menu() {
		System.out.println("Elige una opción: ");
		System.out.println("1. Añadir empleado");
		System.out.println("2. Listar empleados");
		System.out.println("3. Modificar horas extras");
		System.out.println("4. Modificar importe horas extras");
		System.out.println("5. Eliminar empleado");
		System.out.println("0. Salir");
	}

	public static Empleado crearEmpleado() {
		Empleado empleado;
		String dni;
		String nombre;
		double sueldoBase;
		int horasExtras;

		dni = pedirDni();
		System.out.println("Introduce el nombre: ");
		nombre = reader.nextLine();
		System.out.println("Introduce el sueldo base: ");
		sueldoBase = reader.nextDouble();
		horasExtras = pedirHorasExtras();

		empleado = new Empleado(dni, nombre, sueldoBase, horasExtras);
		return empleado;
	}

	private static int pedirHorasExtras() {
		int horasExtras;
		System.out.println("Introduce las horas extras: ");
		horasExtras = reader.nextInt();
		return horasExtras;
	}

	private static String pedirDni() {
		String dni;
		System.out.println("Introduce el dni: ");
		dni = reader.nextLine();
		return dni;
	}
}
