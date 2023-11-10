//Ejercicio 5
public class Cadena{
    private int longitudCadena;
    private String cadena;
    
    public Cadena (String cadena){
        this.cadena = cadena;
        this.longitudCadena = cadena.length();
    }
    
    public int getLongitudCadena(){
        return longitudCadena;
    }
    
    public String getCadena(){
        return cadena;
    }
    
    public void visualizar(){
        System.out.println("Cadena de caracteres: " + cadena);
        System.out.println("La longitud de la cadena es: " + longitudCadena);
    }
    
    public char caracter (int i){
        if (i > 0 && i < longitudCadena){
            return cadena.charAt(i);
        } else {
            return (char) -1;
        }
    }
}
