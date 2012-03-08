/**
 * @author Andrea Brancaleoni
 * @version 2012/03/08
 */

public class Class8 {
    public static String s;    

    /**
     * Constructor for Class8
     */
    public Class8(String ns) {
        this.s = ns;
    }

    /**
     * Main method
     **/
    static public void main(String[] args) {
        Class8 c1, c2;
        c1 = new Class("cane");
        c2 = new Class("pagliaccio");

        // If the two references point at the same object
        if (c1.s == c2.s) {
            System.out.println("The static member s is the same in c1 e c2");
        } else {
            System.out.println("The static member s isn't the same in c1 e c2");
        }
    }

}

