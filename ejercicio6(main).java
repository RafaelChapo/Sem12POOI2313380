//Ejercicio 6
public class Main {
    public static void main(String[] args) {
        
        LAN lan1 = new LAN("Estrella", 32);
        LAN lan2 = new LAN("Bus", 64);
        
        lan1.visualizar();
        lan2.visualizar();
    }
}
