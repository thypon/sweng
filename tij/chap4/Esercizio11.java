/**
 * @author Andrea Brancaleoni
 * @version 2012/03/11
 */

public class Esercizio11 {
    private Esercizio11 e11ref;
    private static int ref = 0;
    private int myref;

    /**
     * Constructor for Esercizio11
     */
    public Esercizio11() {
        ref += 1;
        myref = ref;
    }

    protected void finalize() {
        System.out.println("Finalized " + myref);
    }

    public void newRef(Esercizio11 e2) {
        e11ref = e2;
    }

    /**
     * Main method
     **/
    static public void main(String[] args) {
        {
            Esercizio11 e1, e2;
            e1 = new Esercizio11();
            e2 = new Esercizio11();
            e1.newRef(e2);
            e2.newRef(e1);
        }
        
        while (true) {
            System.gc();
        }
    }

}
