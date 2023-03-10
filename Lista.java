public class Lista {
    private Nodo raiz;
    private Nodo ultimo;

    public Lista() {
        this.raiz = raiz;
        this.ultimo = ultimo;
    }

    public boolean empty() { // Revisa si la lista esta vacia
        return raiz == null;
    }

    public void vaciarLista() { // Vacia la lista
        raiz = null;
    }

    public void insertar(String nombre, String patron) { //
        Nodo nuevo = new Nodo(nombre, patron);
        if (empty()) 
        { // Si la lista esta vacia pone el nuevo en la raiz y en ultimo
            raiz = nuevo;
            ultimo = nuevo;
        } 
        else 
        { // Si la lista no esta vacia pone el nuevo en el ultimo y el ultimo "apunta" hacia la nada
            ultimo.setSig(nuevo); 
            ultimo=ultimo.getSig();
        }
    }
    public String validarCad(String cadena) throws Exception //
    {
        Nodo aux=raiz;
        String palabra = "Error" ;
        while(aux!=null && palabra == "Error") {

            String valid=aux.Validar(cadena);
            if(valid!=palabra) {
                palabra=valid;
            }
            aux=aux.getSig();
        
    }
        return palabra;
}
    public void Llenarlista(String archivo) {
        Archivo arc = new Archivo(archivo);
        String [] palabra;
        do {
            palabra = arc.LineaPalabra();
            if (palabra[0] == "Error") {
                break;
            }
            insertar(palabra[0], palabra[1]);
        } while (palabra[0] != "Error de llenado");
    }
}
