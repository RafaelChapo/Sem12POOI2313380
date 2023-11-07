//Ejercicio 2
import java.util.Scanner;

public class Empleado {
    private String nombre;
    private int numEmpleado;
    
    public Empleado(){
        
    }
    
    public void leerDatos(){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del empleado: ");
        this.nombre = leer.nextLine();
        
        System.out.println("Ingrese el numero del empleado: ");
        this.numEmpleado = leer.nextInt();
    }
    
    public void verDatos(){
        System.out.println("Nombre del empleado: " + this.nombre);
        System.out.println("Numero del empleado: " + this.numEmpleado);
    }
}
