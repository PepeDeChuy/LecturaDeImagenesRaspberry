/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lectorimagenes;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author peper
 */
public class HiloCaptura extends Thread
{
    ProcessBuilder builder;
    Process process;
    
    JFrame jFrame;

    public HiloCaptura(JFrame jFrame) 
    {
        this.jFrame = jFrame;
        String ruta = jFrame.getDireccionPY();
        builder = new ProcessBuilder("python",ruta);   
    }

    @Override
    public void run()
    {
        JOptionPane.showMessageDialog(null, "Hilo de captura iniciado");
        
        try 
        {
            process = builder.start();
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
    
    public void terminarCaptuta()
    {
        process.destroy();
    }
}
