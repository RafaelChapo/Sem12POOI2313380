//Ejercicio 6
import java.util.*;

public class LAN {
    private String topologia;
    private int tamannoPaquete;
    
    public LAN(String topologia, int tamannoPaquete){
        this.topologia = topologia;
        this.tamannoPaquete = tamannoPaquete;
    }

    public String getTopologia() {
        return topologia;
    }

    public int getTamannoPaquete() {
        return tamannoPaquete;
    }
    
    public void visualizar() {
        System.out.println("Topologia: " + topologia + "\nTamaño del paquete: " + tamannoPaquete);
    }
}
