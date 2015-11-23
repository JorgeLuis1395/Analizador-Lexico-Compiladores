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
            
//        public void probarLexico(JTextArea area) throws IOException{//ahio dejame ver k sale //sicogia loco ahora se volvio loco perame
//        int contIDs=0;
//        int linea=0;
//        
//        int columna=0;
//        
//        File fichero = new File ("fichero.txt");
//        File salida= new File("resultados.csv");
//        PrintWriter writer;
//        try {
//            writer = new PrintWriter(fichero);
//            writer.print(area.getText());
//            writer.close();
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(interfaz.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        BufferedWriter salida1;
//        salida1=new BufferedWriter(new FileWriter("resultados.csv"));
//        Reader reader = new BufferedReader(new FileReader("fichero.txt"));
//        Lexico lexer = new Lexico (reader);
//        String resultado="";
//        Token token = lexer.yylex();
//       while(true)
//           {
//               if(token==null){
//               System.out.println("eof");;
//                return;
//            }
//           
//            switch(token){
//                    case Identificador: case LiteralInt: case OperadorCompuesto : case PalabrasReservadas: case CaracterEspecial: case LiteralFloat : case LiteralBool : case LiteralChar : case LiteralString:
//                    System.out.println("TOKEN: "+token+" "+lexer.lexema + "linea: "+linea++);
//                    break;
//                case Error:
//                    System.out.println("TOKEN: "+token+" "+lexer.lexema+"hola");
//                default:
//                    System.out.println("TOKEN: "+token);
//            }
//            System.out.println(resultado);
//           //salida1.write(resultado); 
//            } 
//       
//        // salida1.close(); 
//       
//}
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
        
        salida1=new BufferedWriter(new FileWriter("resultados.csv"));
        Lexico lexer = new Lexico (reader);
        String resultado="";
        int i=0;
        while(linea<6){//ahi si corre y funciona en vez de escribir resultado ponle diractemaente writer
            Token token = lexer.yylex();
            if(token==null){
                System.out.println("EnOF");
                return;
            }
            switch(token){
                case Identificador: case LiteralInt: case OperadorCompuesto : case PalabrasReservadas: case CaracterEspecial: case LiteralFloat : case LiteralBool : case LiteralChar : case LiteralString:
                   salida1.write("TOiKEN: "+token+" "+lexer.lexema + "linea: "+linea++);//prame un5
                   System.out.println("TOKEN: "+token+" "+lexer.lexema + "linea: "+linea++);
                break;
                case Error:
                    System.out.println("TOKEN: "+token+" "+lexer.lexema);
                    salida1.write("TOKEN: "+token+" "+lexer.lexema);
                default:
                    salida1.write("TOKEN: "+token);
            }//ahora donde cierro el archivoro  ya salio mijin ajjajaja 
        }
    //no loco solo coge el primeroo el problema es como le podems en vez de i otra forma  cuantas 
        salida1.close();
    }
}

