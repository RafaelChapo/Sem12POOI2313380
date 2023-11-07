//Ejercicio 2
public class Main
{
	public static void main(String[] args) {
		Empleado[] empleados = new Empleado[50];
		
		for (int n = 0; n < empleados.length; n++){
		    System.out.println("Empleado " + (n + 1));
		    empleados[n] = new Empleado();
		    empleados[n].leerDatos();
		}
		
		System.out.println("\nDatos de los empleados: ");
		
		for (int n = 0; n < empleados.length; n++){
		    System.out.println("\nEmpleado " + (n + 1) + " : ");
		    empleados[n].verDatos();
		}
	}
}
