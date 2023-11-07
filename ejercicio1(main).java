//Ejercicio 1
public class Main
{
	public static void main(String[] args) {
		Hora hora1 = new Hora(15, 23, 16);
		Hora hora2 = new Hora(5, 15, 34);
		
		Hora resultado = new Hora();
		
		resultado = hora1.sumarHoras(hora2);
		
		System.out.println("Hora 1: ");
		hora1.mostrarHora();
		
		System.out.println("Hora 2: ");
		hora2.mostrarHora();
		
		System.out.println("Suma de horas: ");
		resultado.mostrarHora();
	}
}
