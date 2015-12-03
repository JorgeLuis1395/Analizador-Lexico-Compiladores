/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocompiladores;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

/**
 *
 * @author USER
 */
public class PROYECTOcOMPILADORES {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws IOException {
//        String path = "C:/Users/USER/Documents/NetBeansProjects/PROYECTOcOMPILADORES/src/proyectocompiladores/Lexico.flex";
//        generarLexico(path);
//        interfaz ventana = new interfaz();
//        ventana.setVisible(true);
//       
        java.util.Scanner in = new java.util.Scanner(System.in);
                    String entrada = " ";
                    if(args.length > 0){
                        entrada = args[0];
                    }else{
                        entrada = "fichero.txt";
                    }
                    BufferedReader bf = null;
                    try {
                        bf = new BufferedReader(new FileReader(entrada));
                        Lexico a = new Lexico(bf);
                        Token token = null;
                        do {
                            token = a.nextToken();
                        } while (token != null);
                    } catch (Exception ex) {
                        Logger.getLogger(PROYECTOcOMPILADORES.class.getName()).log(Level.SEVERE, null, ex);
                    } finally {
                        try {
                            bf.close();
                        } catch (IOException ex) {
                            Logger.getLogger(PROYECTOcOMPILADORES.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    
                    
                }
               
         

     public static void generarLexico(String path){
        File file=new File(path);
        jflex.Main.generate(file);
    }
    
}  

