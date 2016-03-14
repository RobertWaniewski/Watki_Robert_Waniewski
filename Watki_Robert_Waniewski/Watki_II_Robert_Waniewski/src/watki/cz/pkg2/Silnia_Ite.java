
package watki.cz.pkg2;

import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Robert Waniewski
 */
public class Silnia_Ite extends Thread {
    int silniaZ;
    NewJFrame jframe;
    
    public Silnia_Ite(int silniaZ, NewJFrame jframe){
    
        this.silniaZ = silniaZ;
        this.jframe = jframe;
        
    }
    
    public void run() {
     long start_array = System.currentTimeMillis();
    String silnia = null;
        try {
            silnia = (podajSilnie(silniaZ)).toString();
            long stop_array = System.currentTimeMillis();
            long czas = stop_array-start_array;
            jframe.setIte(""+czas);
            jframe.setSil(silnia);
        } catch (InterruptedException ex) {
           
        }
    
    }
    
    public BigInteger podajSilnie(int i) throws InterruptedException{
    BigInteger silnia = BigInteger.valueOf(1);
        for (; i>1 ; i--){
            
            silnia = silnia.multiply(BigInteger.valueOf(i));
            Thread.sleep(1);
    }
        return silnia;
    
    }
    
}
