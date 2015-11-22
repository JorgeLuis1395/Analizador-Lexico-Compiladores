package proyectocompiladores;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;
// thread redefine el método run
//Al contructor de la clase derivada Hilo le 
//pasamos el nombre del subproceso y éste se lo 
//pasa al constructor de la clase base Thread 
public class Hora extends Thread {
    
    private JLabel lbl;

    public Hora(JLabel lbl) {
        this.lbl = lbl;
    }
    
    public void run()
    {
        while(true)
        {
            Date hoy=new Date();
            SimpleDateFormat s=new SimpleDateFormat("hh:mm:ss");
            this.lbl.setText(s.format(hoy));
            try
            {
                sleep(1000);
            }
            catch(Exception e){}
        }
    
    }
