public class Lista {
    Nodo raiz;
    Nodo ultimo;
    public boolean empty(){
        return raiz == null;
    }
    public void insertar(String nombre, String patron) {
        Nodo nuevo = new Nodo(nombre, patron);
        if (empty()){
            raiz = nuevo;
            ultimo = nuevo;
        }
        else {
            ultimo.sig = nuevo;
            ultimo = ultimo.sig;
        }
    }
    public String validarLexema(String lexema) {
        Nodo aux = raiz;
        String myToken = "ERROR";
        if(!empty()){
            do
            {
                try {
                    myToken = aux.Validar(lexema);
                } catch (Exception e) {
                    
                }
            }
            while(aux != null && myToken == "ERROR");
        }
        return myToken;
    }
    public void vaciarLista() {
        raiz = null;
    }
    public void Llenarlista(String archivo){
        
    }
}
