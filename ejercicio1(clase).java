//Ejercicio 1
public class Hora{
    private int horas;
    private int minutos;
    private int segundos;
    
    public Hora(){
        this.horas = 0;
        this.minutos = 0;
        this.segundos = 0;
    }
    
    public Hora(int horas, int minutos, int segundos){
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    
    public void mostrarHora(){
        System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
    }
    
    public Hora sumarHoras(Hora otraHora){
        int nuevaHora = this.horas + otraHora.horas;
        int nuevosMinutos = this.minutos + otraHora.minutos;
        int nuevosSegundos = this.segundos + otraHora.segundos;
        
        if (nuevosSegundos >= 60) {
            nuevosMinutos++;
            nuevosSegundos %= 60;
        }
        if (nuevosMinutos >= 60) {
            nuevaHora++;
            nuevosMinutos %= 60;
        }
        
        return new Hora(nuevaHora, nuevosMinutos, nuevosSegundos);
    }    
}
