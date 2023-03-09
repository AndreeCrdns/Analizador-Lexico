public class Nodo {
    private Token dato;
    private Nodo sig;

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    public Nodo(String nombre, String patron) { // Constructor para crear un nuevo nodo y ese nodo va a tener un token
        dato = new Token(nombre, patron);
    }

    public String Validar(String cadena) { // Valida la cadena mandando a llamar la validacion de la clase token por
                                           // medio de dato
        try {
            return dato.Validar(cadena);
        } catch (Exception e) {
            return "Error";
        }
    }
}
