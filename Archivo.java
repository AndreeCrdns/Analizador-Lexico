import java.io.*;

public class Archivo {
    private FileReader lectorReader;
    private BufferedReader lectorBuffer;

    public Archivo(String archivo) { //Lee el archivo y si este no lo detecta imprime un error.
        try {
            this.lectorReader = new FileReader(archivo);
            this.lectorBuffer = new BufferedReader(lectorReader);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
    }

    public String[] SepararPalabras() { // Separa las palabras por espacios
        String linea;
        try {
            while ((linea = lectorBuffer.readLine()) != null) // Mientras linea sea diferente de null, se va a imprimir
                                                              // la linea
            {
                if (linea.trim().startsWith("#") || linea.trim().isEmpty()) {
                    continue;
                }
                String[] palabras = linea.trim().split("\\s+(?=([^\"]*\"[^\"]*\")*[^\"]*$)"); // Junta con las cadenas
                                                                                              // cuando inicien y
                                                                                              // terminen con ""
                return palabras;
            }
            lectorBuffer.close();
            String[] Error = { "Error" };
            return Error;
        } catch (IOException e) {
            String[] Error = { "Error de entrada y salida" };
            return Error;
        }
    }
}