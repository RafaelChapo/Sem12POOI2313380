//MAIN
public class Main
{
	public static void main(String[] args) {
		Empleado empleado1 = new Empleado("Pablo", 2000.50, 27, 568, "Enfermo", 4);
        Supervisor supervisor1 = new Supervisor("Oscar", 3000.30, 30, 465, "Bueno", 6, 100);
        Gerente gerente1 = new Gerente("Masias", 6000.60, 55, 921, "Bueno", 10);
        RRHH rrhh1 = new RRHH("Jaime", 4000.100, 43, 231, "Bueno", 8);
        
        empleado1.calcularSalario();
        supervisor1.calcularSalario();
        gerente1.calcularSalario();
        rrhh1.calcularSalario();
        
        empleado1.calcularAumentoSalarial(150);
        supervisor1.calcularAumentoSalarial(300);
        gerente1.calcularAumentoSalarial(200);
        rrhh1.calcularAumentoSalarial(500);
        
        supervisor1.calcularPrima();
        
        rrhh1.informacionCompleta(empleado1);
        rrhh1.informacionCompleta(supervisor1);
        rrhh1.informacionCompleta(gerente1);
        gerente1.verificarProductividad();
        rrhh1.informacionCompleta(rrhh1);
	}
}
//CLASE EMPLEADO
public class Empleado{
    private String nombre;
    private double salario;
    private int edad;
    private int idEmpleado;
    private String estadoDeSalud;
    private int productividad;
    
    public Empleado(String nombre, double salario, int edad, int idEmpleado, String estadoDeSalud, int productividad) {
        this.nombre = nombre;
        this.salario = salario;
        this.edad = edad;
        this.idEmpleado = idEmpleado;
        this.estadoDeSalud = estadoDeSalud;
        this.productividad = productividad;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public int getEdad() {
        return edad;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public String getEstadoDeSalud() {
        return estadoDeSalud;
    }

    public int getProductividad() {
        return productividad;
    }
    public void calcularSalario() {
        System.out.println("Salario de " + nombre + ": " + salario + " soles");
    }

    public void calcularAumentoSalarial(int aumento) {
        salario += aumento;
        System.out.println("Nuevo salario de " + nombre + ": " + salario + " soles");
    }
}
//CLASE SUPERVISOR
public class Supervisor extends Empleado{
    private int prima;

    public Supervisor(String nombre, double salario, int edad, int idEmpleado, String estadoDeSalud, int productividad, int prima) {
        super(nombre, salario, edad, idEmpleado, estadoDeSalud, productividad);
        this.prima = prima;
    }

    public void calcularPrima() {
        setSalario(getSalario() + prima);
        System.out.println("Salario de " + getNombre() + " con prima: " + getSalario() + " soles");
    }
}
//CLASE GERENTE
public class Gerente extends Empleado{
    
    public Gerente(String nombre, double salario, int edad, int idEmpleado, String estadoDeSalud, int productividad) {
        super(nombre, salario, edad, idEmpleado, estadoDeSalud, productividad);
    }

    public void verificarProductividad() {
        if (getProductividad() <= 5) {
            System.out.println("El empleado no recibe una promoción");
        } else {
            System.out.println("El empleado recibe una promoción");
        }
    }
}
//CLASE RRHH
public class RRHH extends Empleado {
    
    public RRHH(String nombre, double salario, int edad, int idEmpleado, String estadoDeSalud, int productividad) {
        super(nombre, salario, edad, idEmpleado, estadoDeSalud, productividad);
    }

    public void informacionCompleta(Empleado empleado) {
        System.out.println("Información de " + empleado.getNombre() + " \nSalario: " + empleado.getSalario() + "\nEdad: "
                + empleado.getEdad() + "\nId del Empleado: " + empleado.getIdEmpleado()
                + "\nEstado de salud del empleado: " + empleado.getEstadoDeSalud()
                + "\nNivel de productividad (1-5: Bajo, 6-10: Alta): " + empleado.getProductividad());
    
}
}
