import java.io.*;
//import java.util.Scanner;
public class Archivo {
   FileReader lectorReader;
   BufferedReader leerlinea;

   public Archivo(String archivo){
      try {
      this.lectorReader = new FileReader(archivo);
      this.leerlinea = new BufferedReader(lectorReader);
      } catch (IOException e) {
      System.out.println("ERROR AL LEER EL ARCHIVO");
      }
   }

   public String[] LineaPalabra(){
      String linea;
      try {
         if((linea = leerlinea.readLine()) != null){
            String [] palabra = linea.split(" ");
            return palabra;
         }
         leerlinea.close();
         String [] mensaje = {"Error de archivos"} ;
         return mensaje;
         }catch (Exception e) {
         String [] mensaje = {"Error de entradas y salidas"} ;
         return mensaje;
         }
   }
}