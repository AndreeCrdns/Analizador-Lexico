public class Nodo  {
    Token dato;
    Nodo sig;

    public Token getDato() {
        return dato;
    }
    public void setDato(Token dato) {
        this.dato = dato;
    }
    public void setSigNodo(Nodo sigNodo) {
        this.sig = sigNodo;
    }
    public Nodo getSigNodo() {
        return sig;
    }
    public Nodo (Token t) {
        this.dato = t;
    }
    public Nodo(String nombre, String patron){
        try{
        
        }
        catch (Exception e){ 
        }
        return;
    }
    public String Validar(String lexema) {
        return null;
    }
}
