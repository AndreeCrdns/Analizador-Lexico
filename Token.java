import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Token { //Clase Token  
    private String patron;
    private String nombre;
    public String getNombre() {
        return nombre;
    }
    public String getPatron() {
        return patron;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPatron(String patron) {
        this.patron = patron;
    }
    public Token(String nombre,String patron){
        this.nombre = nombre;
        this.patron = patron;
    }
    public String Validar(String cadena) throws Exception{
            Pattern pat = Pattern.compile(patron);      //define el objeto de pattern y este comprueba define la ER
            Matcher mat = pat.matcher(cadena);          //define el objeto de matcher y este comprueba que el pattern si coincida con el matcher
            if (mat.matches()){
               return "Token: "+ nombre;
            }else{
               return "ERROR"; 
            }

        }
    //public static void main(String[] args) {
    //    Scanner sc = new Scanner(System.in);
    //   String nombre,patron,cadena;
    //    System.out.println("Ingresa nombre");
    //    nombre=sc.nextLine();
    //    System.out.println("Ingresa patron");
    //    patron = sc.nextLine();
    //    System.out.println("Ingresa cadena");
    //    cadena = sc.nextLine();
    //    Token tkn = new Token(nombre, patron);
    //    try {
    //        tkn.Validar(cadena);
    //    } catch (Exception e) {
    //   }
    //   sc.close();
    //}
}

