import java.io.*;

public class Archivo {
    private FileReader lectorReader;
    private BufferedReader lectorBuffer;

    public Archivo(String archivo) {
        try {
            this.lectorReader = new FileReader(archivo);
            this.lectorBuffer = new BufferedReader(lectorReader);
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
        }
    }

    public String[] LineaPalabra() {
        String linea;
        try {
            while ((linea = lectorBuffer.readLine()) != null) {
                if (linea.trim().startsWith("#") || linea.isEmpty()) {
                    continue;
                }
                String[] palabras = linea.split("\\s+(?=([^\"]*\")*[^\"]*$)");
                return palabras;
            }
            lectorBuffer.close();
            String[] mensaje = { "Error" };
            return mensaje;
        } catch (IOException e) {
            String[] mensaje = { "Error de lectura" };
            return mensaje;
        }
    }
}
// "([^"\\]*(\\.[^"\\]*)*)"