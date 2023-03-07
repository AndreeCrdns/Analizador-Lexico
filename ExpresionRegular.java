import java.util.regex.Matcher; //importa el matcher
import java.util.regex.Pattern; //importa el patern
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class ExpresionRegular extends JFrame {
        public void Initialize(){
            final Font mainFont = new Font("Arial", Font.BOLD, 18); //Define el tipo de letra
            JTextField tER,tCadena; //Crea los textfield ter tcadena
            JLabel lbTexto; //Instancia el label texto

            JLabel lbER = new JLabel("Expresion Regular"); //Crea el label er
            lbER.setFont(mainFont); //Le pone tipo de letra al lable er

            tER = new JTextField(); //Crea el tipo de letra al textfield er
            tER.setFont(mainFont); //Le pone tipo de letra al textfield ER

            JLabel lbCadena = new JLabel("Cadena"); //crea el label cadena
            lbCadena.setFont(mainFont); //Le pone el tipo de letra al label cadena

            tCadena = new JTextField(); //Crea el textfield cadena
            tCadena.setFont(mainFont); //Le pone el tipo de letra a la textfield cadena

            JPanel formPanel = new JPanel(); //Crea la agrupacion formPanel
            formPanel.setLayout(new GridLayout(4,1,5,5));
            formPanel.add(lbER); //Añade al formulario label ER
            formPanel.add(tER); //Añade al formulario textfield ER
            formPanel.add(lbCadena); //Añade al formulario label cadena
            formPanel.add(tCadena); //Añade al formulario textfield cadena

            lbTexto = new JLabel(); // Crea el label texto
            lbTexto.setFont(mainFont); //Le pone el tipo de letra al label texto

            JButton btnComprobar = new JButton("Comprobar"); //Crea el boton comprobar
            btnComprobar.setFont(mainFont); // Le pone el tipo de letra (mainfont) al botton
            btnComprobar.addActionListener(new ActionListener(){ 

                public void actionPerformed(ActionEvent event) { //Accion del boton comprobar
                    String ER = tER.getText();
                    String Cadena = tCadena.getText();
                    Pattern pat = Pattern.compile(ER); //define el objeto de pattern y este comprueba define la ER
                    Matcher mat = pat.matcher(Cadena); //define el objeto de matcher y este comprueba que el pattern si coincida con el matcher
                    if (mat.matches()) {  
                        lbTexto.setText("Coincide"); //si el mat coincide este imprime coincide
                    } else {
                        lbTexto.setText("No coincide"); // Si este no coincide este imprime no coincide
                    }
                }
            });

            JButton btnLimpiar = new JButton("Limpiar"); //Se crea el boton limpiar
            btnLimpiar.setFont(mainFont);
            btnLimpiar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) { //Accion que hace el botton Limpiar
                    tER.setText("");
                    tCadena.setText("");
                    lbTexto.setText("");
                }
            });

            JButton btnLeer = new JButton("Leer");
            btnLeer.setFont(mainFont);
            btnLeer.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    String archivo = "C:/Users/andre/OneDrive/Desktop/prueba.txt";
                    String linea;
              
                    try {
                       FileReader fr = new FileReader(archivo);
                       BufferedReader br = new BufferedReader(fr);
              
                       while ((linea = br.readLine()) != null) {
                          lbTexto.setText(linea+"\n");
                       }
              
                       br.close();
                    } catch (IOException e) {
                       System.out.println("Error al leer el archivo: " + e.getMessage());
                    }
                }
            });

            JButton btnImprimir = new JButton("Imprimir");
            btnImprimir.setFont(mainFont);
            btnImprimir.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event){
                String archivo = "C:/Users/andre/OneDrive/Desktop/prueba.txt";
                String ER = tER.getText();
                String cadena = tCadena.getText();
          
                try {
                   FileWriter fw = new FileWriter(archivo);
                   BufferedWriter bw = new BufferedWriter(fw);
                   bw.write("Expresion Regular: " + ER + "\n"+"Cadena: " + cadena);
                   
                   bw.close();
                } catch (IOException e) {
                   lbTexto.setText("Error al escribir en el archivo: " + e.getMessage());
                }
            }} );

            JPanel buttonsPanel = new JPanel(); //Agrupa los botones
            buttonsPanel.setLayout(new GridLayout(1,2,5,5));
            buttonsPanel.add(btnComprobar);
            buttonsPanel.add(btnImprimir);
            buttonsPanel.add(btnLeer);
            buttonsPanel.add(btnLimpiar);

            JPanel mainPanel = new JPanel(); 
            mainPanel.setLayout(new BorderLayout());
            mainPanel.setBackground(new Color(128,128,255));
            mainPanel.add(formPanel, BorderLayout.NORTH); //Pone el formulario arriba
            mainPanel.add(lbTexto, BorderLayout.CENTER); //Pone el label texto en el centro
            mainPanel.add(buttonsPanel, BorderLayout.SOUTH); //Pone los botones abajo

            add(mainPanel);

            setTitle("ER");
            setSize(300,300);
            setMinimumSize(new Dimension(600,400));
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setVisible(true);
        }

        public static void main (String[] args){
            ExpresionRegular ventana = new ExpresionRegular();
            ventana.Initialize();
        }
    }

