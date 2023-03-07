import java.io.*;

public class Archivo {
      String archivo = "C:/Users/andre/OneDrive/Desktop/prueba.txt";
      public void Imprimir(String contenido) {
      try {
         FileWriter fw = new FileWriter(archivo);
         BufferedWriter bw = new BufferedWriter(fw);

         bw.write(contenido);

         bw.close();
      } catch (IOException e) {
         System.out.println("Error al escribir en el archivo: " + e.getMessage());
      }
    }
    public void Leer(){
        String linea;
        try {
           FileReader fr = new FileReader(archivo);
           BufferedReader br = new BufferedReader(fr);
  
           while ((linea = br.readLine()) != null) {
              System.out.println(linea);
           }
  
           br.close();
        } catch (IOException e) {
           System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}