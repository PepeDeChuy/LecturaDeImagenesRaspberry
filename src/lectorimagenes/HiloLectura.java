/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lectorimagenes;

import java.io.File;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author peper
 */
public class HiloLectura extends Thread
{
    public JFrame jFrame;
    
    File folder;
    boolean f;
    
    Date dateActual;

    public HiloLectura(JFrame jFrame) 
    {
        this.jFrame = jFrame;
        this.f = true;
        dateActual = extraerFechactual();
    }   
    
    @Override
    public void run()
    {
        folder = new File(jFrame.getLc());
        while(f)
        {
            File[] filesArray = folder.listFiles();
            Arrays.sort(filesArray);
            
            for (File file : filesArray) 
            {
                if (!file.isDirectory()) 
                {
                    String name = file.getName(); 

                    if(!name.contains("Y"))
                    {   
                        jFrame.agregarElemento(name);

                        File fil = new File(jFrame.getLc()+"/Y_"+name);

                        if (!file.renameTo(fil))
                        {
                            System.out.println("error en renombrar archivo:" + name);
                        }
                    }
                    else if((((dateActual.getTime() - extraerFechactual().getTime())/1000)/60) >=jFrame.getMinBorrar()) //Else para la compracion de cuanto tiempo se tiene con ese archivo
                    {       
                        //Se puede optimizar
                        int y = Integer.parseInt(file.getName().substring(2, 6)) - 1900;
                        int m = Integer.parseInt(file.getName().substring(7, 9)) - 1;
                        int d = Integer.parseInt(file.getName().substring(10, 12));
                        int h = Integer.parseInt(file.getName().substring(13, 15));
                        int mi = Integer.parseInt(file.getName().substring(16, 18));
                        
                        Date dateFile = new Date(y,m,d,h,mi);
                        //
                        Long a = ((dateActual.getTime() - dateFile.getTime())/1000)/60; //Se realiza la direrencia para extraer el tiempo de su creacion
                        
                        if(a>=jFrame.getMinBorrar())
                        {
                            if(!file.delete())
                            {
                                System.err.println("Error al borrar el archivo:" + file.getName());
                            }
                        }
                    }
                }
            }
        }
    }
    
    private Date extraerFechactual()
    {
        DateTimeFormatter nq = DateTimeFormatter.ofPattern("uuuu/MM/dd HH:mm");
        LocalDateTime now = LocalDateTime.now();
        
        return new Date(nq.format(now));//Se extrae la fecha actual
    }
    
    public void terminarHilo()
    {
        this.f = false;
    }
}
