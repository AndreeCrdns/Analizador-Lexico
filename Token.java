import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Token { //Clase Token  
    String patron, nombre;
    public String getNombre() {
        return nombre;
    }
    public String getPatron() {
        return patron;
    }
    public Token(String nombre,String patron){
        this.nombre = nombre;
        this.patron = patron;
    }
    public String Validar(String cadena) throws Exception{
            Pattern pat = Pattern.compile(patron); //define el objeto de pattern y este comprueba define la ER
            Matcher mat = pat.matcher(cadena); //define el objeto de matcher y este comprueba que el pattern si coincida con el matcher
            if (mat.matches()){
                return ("Token: " + nombre) ;
            }else {
                throw new Exception("Error ");
            }   
    }
}
