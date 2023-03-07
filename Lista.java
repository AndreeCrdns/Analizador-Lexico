public class Lista {
    Nodo raiz;
    Nodo ultimo;
    
    public Lista(){
        this.raiz = raiz;
        this.ultimo = ultimo;
    }

    public boolean empty(){ //Revisa si la lista esta vacia
        return raiz == null;
    }
    public void insertar(String nombre, String patron) { //
        Nodo nuevo = new Nodo(nombre, patron);
        if (empty()){ //Si la lista esta vacia pone el nuevo en la raiz y en ultimo
            raiz = nuevo;
            ultimo = nuevo;
        }
        else { // Si la lista no esta vacia pone el nuevo en el ultimo y el ultimo "apunta" hacia la nada
            ultimo.setSig(nuevo);;
            ultimo.getSig();
        }
    }
    public String validarLexema(String lexema) {
        String myToken = "ERROR";
        if(!empty()){
            Nodo aux = raiz;
            do
            {
                myToken = aux.Validar(lexema);
                aux = aux.getSig();
            }while(aux != null && myToken == "ERROR");
            return myToken;
        }else{
            return "Lista vacia";
        }
        
    }
    public void vaciarLista() { // Vacia la lista
        raiz = null;
    }
    public void Llenarlista(String archivo){
        Archivo arc = new Archivo(archivo);
        String [] palabras;
        do
        {
            palabras = arc.LineaPalabra();
            if(palabras[0]== "Error de archivos"){
                break;
            }
            insertar(palabras[0],palabras[1]);
        }   while (palabras[0] != "Error de archivos" );
    }
}
