public class App {
    public static void main(String[] args) throws Exception {
        Lista ls = new Lista();
        Archivo arc = new Archivo("C:/Users/andre/OneDrive/Desktop/Codigo.txt");
        ls.Llenarlista("C:/Users/andre/OneDrive/Desktop/TablaTokens.txt");
        String [] palabrasimprimir;
        do {
            palabrasimprimir = arc.LeerPalabra();
            if (palabrasimprimir[0] == "Error") {
                System.out.println("Fin del recorrido del archivo");
                break;
            }
            for (int i = 0; i < palabrasimprimir.length; i++) // empezando desde 0, hasta el final del arreglo
            {
                String Token = ls.validarCad(palabrasimprimir[i]); // manda llamar validarcad de lista
                System.out.println(palabrasimprimir[i] + " - " + Token);
            }
        } while (palabrasimprimir[0] != "Error");
    }
}