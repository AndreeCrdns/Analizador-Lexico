import java.io.*;
//import java.util.Scanner;
public class Archivo {
   FileReader lFileReader;
   BufferedReader lBufferedReader;
   public Archivo(String direccionArchivo){
   try {
      this.lFileReader = new FileReader(direccionArchivo);
      this.lBufferedReader = new BufferedReader(lFileReader);
   } catch (Exception e) {
      System.out.println("Error al leer el archivo");
   } 
    }
   public String[] LineaPalabra(){
      String linea;
      try {
         if((linea = lBufferedReader.readLine()) != null){
            String [] palabras = linea.split(" ");
            return palabras;
         }

         lBufferedReader.close();
         String [] mensaje = {"Error al archivo vacio"} ;
         return mensaje;
         
         }catch (IOException e) {
         String [] mensaje = {"Error de IO"} ;
         return mensaje;
         }
   }
//public static void main(String[] args) {
//  Archivo arc = new Archivo("C:/Users/andre/OneDrive/Desktop/Leer.txt");
     //    System.out.println(arc);
   // }
}
//try {
//   Scanner sc = new Scanner(new File(direccionArchivo));
//   while(sc.hasNext()){
//      String nombre = sc.next();
//      String patron = sc.next();
//      System.out.println("Nombre: "+ nombre +" Patron: "+ patron);
//   }
//   sc.close();
//} catch (Exception e) {
//}
//
