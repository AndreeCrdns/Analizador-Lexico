

public class Nodo { // clase nodo hace el espacio para guardar los datos.
    
    private Token dato;
    Nodo sig;
    
    public Token getDato() {
        return dato;
    }
    public void setDato(Token token) {
        this.dato = token;
    }
    public Nodo getSig() {
        return sig;
    }
    public void setSig(Nodo sig) {
        this.sig = sig;
    }
    public Nodo(Token t) {
        this.dato = t;
    }
    public Nodo(String nombre, String patron) { //Constructor para crear un nuevo nodo y ese nodo va a tener un token
        this.dato = new Token(nombre, patron);
    }
    public String Validar(String cadena){ // Valida la cadena mandando a llamar la validacion de la clase token por medio de dato
        try {
            return dato.Validar(cadena);
        } catch (Exception e) {
            return "ERROR";
        }
    }
}

