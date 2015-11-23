/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocompiladores;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
        
        // TODO code application logic here
        interfaz ventana = new interfaz();
        ventana.setVisible(true);
        String path = "C:/Users/USER/Documents/NetBeansProjects/PROYECTOcOMPILADORES/src/proyectocompiladores/Lexico.flex";
        generarLexico(path);

    }
    public static void generarLexico(String path){
        File file=new File(path);
        jflex.Main.generate(file);
    }
    }

