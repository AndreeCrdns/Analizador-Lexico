public class App {
    public static void main(String[] args) throws Exception {
        Lista ls = new Lista();
        Archivo arc = new Archivo("C:/Users/andre/OneDrive/Desktop/Codigo.txt");
        ls.Llenarlista("C:/Users/andre/OneDrive/Desktop/TablaTokens.txt");
        String[] palabrasimprimir;
        do {
            palabrasimprimir = arc.SepararPalabras();
            if (palabrasimprimir[0] == "Error") {
                System.out.println("Fin del archivo");
                break;
            }
            for (int i = 0; i < palabrasimprimir.length; i++) // empezando desde 0, hasta el final del arreglo
            {
                String Token = ls.validarCadena(palabrasimprimir[i]); // manda llamar validarcad de lista
                System.out.println(Token);
            }
        } while (palabrasimprimir[0] != "Error");
    }
}