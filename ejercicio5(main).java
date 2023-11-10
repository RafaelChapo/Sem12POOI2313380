//Ejercicio 5
public class Main
{
	public static void main(String[] args) {
		Cadena cadenaIngresada = new Cadena("Este es el curso de POOI");
		cadenaIngresada.visualizar();
		
		int lugarCaracter = 22;
		
		char caracter = cadenaIngresada.caracter(lugarCaracter);
		
		if (lugarCaracter > cadenaIngresada.getLongitudCadena()) {
            System.out.println("-1");
        } else {
            System.out.println("El caracter en el lugar " + lugarCaracter + " es: "+ caracter);
        }
	}
}
