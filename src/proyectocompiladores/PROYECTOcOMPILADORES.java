/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocompiladores;


import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class PROYECTOcOMPILADORES {

    
    public static void main(String[] args) throws IOException {
//        String path = "C:/Users/USER/Documents/NetBeansProjects/PROYECTOcOMPILADORES/src/proyectocompiladores/Lexico.flex";
//        generarLexico(path);
//        interfaz ventana = new interfaz();
//        ventana.setVisible(true);
//       
   
                    /*  Ejecutamos el analizador lexico y sintactico
                     sobre un archivo de pruebas. 
                     */
                    String[] archivoPrueba = {"fichero.txt"};
                    Sintactico.main(archivoPrueba);
                    System.out.println("Ejecutado!");
    }
}

