package proyectocompiladores;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileNameExtensionFilter;
import proyectocompiladores.Lexico;
import proyectocompiladores.Token;
import proyectocompiladores.interfaz;

/**
 *
 * @author USER
 */
class archivos {
     public int linea;
    public int columna;
    File abrir;
    JFileChooser fc;
    public String aux;
    public String texto;
    boolean existe;
    String direccion;
BufferedWriter salida1;
    File salida= new File("resultados.csv");
    public void abrir(){
    
    aux = "";
		texto = "";
		try {
			int status = 0;
                        if(abrir.getName().endsWith("proyectocompiladores")){
			if (fc != null) {
				FileReader archivos = new FileReader(abrir);

				BufferedReader lee = new BufferedReader(archivos);
				while ((aux = lee.readLine()) != null) {
					texto += aux + "\n";
                                        existe = true;
                                        direccion = abrir.getAbsolutePath();
				}
				lee.close();
				archivos.close();
			}
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "ERROR","", 0);
                        }
                        
                         if(status== JFileChooser.CANCEL_OPTION){
                            JOptionPane.showMessageDialog(null, "No eligio ningun archivo", "Error", 0);
                        }
		} catch (IOException ex) {
			JOptionPane.showMessageDialog(null, ex + ""
					+ "\nNo se ha encontrado el archivo", "ADVERTENCIA!!!",
					JOptionPane.WARNING_MESSAGE);
		}
                
                
    
    }
    
    public String devolver(){
        return texto;
    }
    
    public void guardar(JTextArea textArea) throws InterruptedException {
		try {
			FileWriter fw = new FileWriter(abrir);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			pw.write(textArea.getText());
			pw.append("");
			pw.close();
			bw.close();
			fw.close();
			JOptionPane.showMessageDialog(fc,"El archivo se a guardado Exitosamente", "Información",JOptionPane.INFORMATION_MESSAGE);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(fc,"Se encontro un ERROR","Información", JOptionPane.INFORMATION_MESSAGE);
			e.printStackTrace();
		}
	} 
            
    public void probarLexico(JTextArea area) throws IOException{
        int contIDs=0;
        String linea="";
        int columna=0;
        File fichero = new File ("fichero.txt");
         
        PrintWriter writer;
        try {
            writer = new PrintWriter(fichero);
            writer.print(area.getText());
            writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(interfaz.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}

