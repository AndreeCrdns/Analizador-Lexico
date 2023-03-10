public class App {
    public static void main(String[] args) throws Exception {
        Lista ls = new Lista();
        Archivo arc = new Archivo("C:/Users/andre/OneDrive/Desktop/Codigo.txt");
        ls.Llenarlista("C:/Users/andre/OneDrive/Desktop/TablaTokens.txt");

        String[] palabraspruebas;
        do {
            palabraspruebas = arc.LineaPalabra();
            if (palabraspruebas[0] == "Error de entrada y salida") {
                System.out.println("Fin del recorrido del archivo");
                break;
            }
            for (int i = 0; i < palabraspruebas.length; i++) // empezando desde 0, hasta el final del arreglo
            {
                String token = ls.validarCadena(palabraspruebas[i]); // manda llamar validarcad de lista
                System.out.println(palabraspruebas[i] + " - " + token);
            }
        } while (palabraspruebas[0] != "Error de entrada y salida");
    }
}
