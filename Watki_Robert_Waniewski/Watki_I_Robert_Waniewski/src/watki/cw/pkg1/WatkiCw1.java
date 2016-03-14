
package watki.cw.pkg1;

/**
 *
 * @author Robert Waniewski
 */
public class WatkiCw1 {

    public static void main(String[] args) {
        // TODO code application logic here
     
        Watek w1 = new Watek();
        Watek w2 = new Watek();     
        w1.start();
        w2.start();
        
        try {
         w1.join();
        
         w2.join();
        }
        catch (InterruptedException e) {};
    }
    
}
