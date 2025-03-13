package exm;

import java.util.HashSet;
import java.util.Set;

public class EmpleadoCrud {

	private static Set<Empleado> empleados = new HashSet<Empleado>();
	
	public static boolean añadirEmpleado(Empleado e) {
		return empleados.add(e);
	}
	
	public static void listarEmpleados() {
		for (Empleado empleado: empleados) {
			System.out.println(empleado);
			System.out.println("------------------------");
		}
	}
	
	public static boolean modificarHorasExtras(Empleado e, int horasExtras) {
		boolean realizado = false;
		Empleado empleado = buscarEmpleado(e);
		if (empleado != null) {
			empleado.setHorasExtras(horasExtras);
			realizado = true;
		}
		return realizado;
	}
	
	private static Empleado buscarEmpleado(Empleado e) {
		Empleado emp = null;
		for (Empleado empleado: empleados) {
			if (empleado.equals(e)) {
				emp = empleado;
			}
		}
		return emp;
	}
	
	public static boolean modificarImporte(double importe) {
		boolean realizado = false;
		if (importe > 0) {
			realizado = true;
			Empleado.setImporteHorasExtras(importe);
		}
		return realizado;
	}
	
	public static boolean eliminarEmpleado(Empleado e) {
		return empleados.remove(e);
	}
}
