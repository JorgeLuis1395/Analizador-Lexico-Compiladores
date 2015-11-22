package proyectocompiladores;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

/**
 *
 * @author USER
 */
class archivos {
int contador=0;
    File abrir;
    JFileChooser fc;
    public String aux;
    public String texto;
    boolean existe;
    String direccion;

    
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
                            JOptionPane.showMessageDialog(null, "ERROR", "Solo se acepta formato prac1lfp", 0);
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
        int linea=0;
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
        Reader reader = new BufferedReader(new FileReader("fichero.txt"));
        Lexico lexer = new Lexico (reader);
        String resultado="";
        while(true){
            Token token = lexer.yylex();
            if(token==null){
                System.out.println("EOF");
                return;
            }
            switch(token){
                case Identificador: case LiteralInt: case OperadorCompuesto : case PalabrasReservadas: case CaracterEspecial: case LiteralFloat : case LiteralBool : case LiteralChar : case LiteralString:
                    System.out.println("TOKEN: "+token+" "+lexer.lexema + "linea: "+linea++);
                break;
                case Error:
                    System.out.println("TOKEN: "+token+" "+lexer.lexema);
                default:
                    System.out.println("TOKEN: "+token);
            }
        }
 }
        
        
                    


}
