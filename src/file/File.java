/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 *
 * @author miguel
 */
public class File {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws FileNotFoundException
    {
        // TODO code application logic here
        System.setOut(new PrintStream(new FileOutputStream("Salida.txt"))); //declaramos la salida del archivo
        
        //guardamos datos al archivo
        System.out.println("My File");
        for(int i = 0; i<19; i++)
        {
            System.out.println("Número "+i);
        }
    }
    
}
