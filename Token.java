import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Token {
    private String patron;
    private String nombre;

    public Token(String nombre, String patron) {
        this.nombre = nombre;
        this.patron = patron;
    }

    public String Validar(String cadena) {
        Pattern pat = Pattern.compile(patron); // define el objeto de pattern y este comprueba define la ER
        Matcher mat = pat.matcher(cadena); // define el objeto de matcher y este comprueba que el pattern si coincida con el matcher
        if (mat.matches()) {
            return nombre;
        } else {
            return ("Error");
        }
    }
}
