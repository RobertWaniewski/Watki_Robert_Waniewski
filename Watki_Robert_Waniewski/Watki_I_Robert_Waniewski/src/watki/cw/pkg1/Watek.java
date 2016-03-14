/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package watki.cw.pkg1;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.Random;

/**
 *
 * @author Robert Waniewski
 */
public class Watek extends Thread {
  
    public void run() {
        
        Random gen = new Random(); 
        String tekst = "";
        String nazwa = "";
        char a;
        for(int i = 0; i<1048000; i++){
            a = (char)(gen.nextInt(90)+32);
            tekst = tekst + a;
            //System.out.println(a);
        }    
        nazwa = nazwa + (char)(gen.nextInt(25)+65) + (char)(gen.nextInt(25)+65) + ((char)gen.nextInt(25)+65);     
        Writer out;
        
        try {
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(nazwa+".txt")));
            out.write(tekst);
            out.flush();
            out.close();
        } catch (IOException iOException) {
        }
        
    }
}
