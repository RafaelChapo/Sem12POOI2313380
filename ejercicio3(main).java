//Ejercicio 3
public class Main
{
	public static void main(String[] args) {
		Hora hora = new Hora(01, 50, 60);

        System.out.println("Hora actual:");
        hora.visualizar();

        System.out.println("Avanzando la hora:");
        hora.avanzar();
        hora.visualizar();

        System.out.println("Colocando la hora en cero:");
        hora.horaEnCero();
        hora.visualizar();
	}
}
