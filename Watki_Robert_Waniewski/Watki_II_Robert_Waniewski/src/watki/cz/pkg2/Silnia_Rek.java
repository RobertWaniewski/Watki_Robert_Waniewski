
package watki.cz.pkg2;

import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Robert Waniewski
 */
public class Silnia_Rek extends Thread {
    
    int silniaZ;
    NewJFrame jframe;
    
    public Silnia_Rek(int silniaZ, NewJFrame jframe){
        this.silniaZ = silniaZ;
        this.jframe = jframe;
        
    }
    
    public void run() {     
        long start_array = System.currentTimeMillis();
    String silnia = null;
        try {
            silnia = podajSilnie(BigInteger.valueOf(silniaZ)).toString();
             long stop_array = System.currentTimeMillis();
             long czas = stop_array-start_array;
             jframe.setRek(""+czas);
             jframe.setSil(silnia);
        } catch (InterruptedException ex) {
           
        }
    
    
   
       
       
    }
    
    public BigInteger podajSilnie(BigInteger i) throws InterruptedException{
        //BigInteger n = new BigInteger(i);
        Thread.sleep(1);
        if (((i).toString()).equals("1")) return i;
        else return i.multiply(podajSilnie(i.subtract(BigInteger.valueOf(1))));
        //else return i*podajSilnie(i-1);
        
    }
    
    
}
