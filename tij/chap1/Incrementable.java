/**
 * @author Andrea Brancaleoni
 * @version 2012/03/08
 */

public class Incrementable {

    /**
     * Constructor for Incrementable
     */
    public Incrementable() {
        
    }

    public static void increment() {
        StaticTest.i++;
    }

    /**
     * Main method
     **/
    static public void main(String[] args) {
        Incrementable sf = new Incrementable();
        sf.increment(); //StaticTest.i == 48
        Incrementable.increment(); //StaticTest.i == 49
        increment(); //StaticTest.i == 50
    }

}

