/**
 * @author Andrea Brancaleoni
 * @version 2012/03/08
 */

public class StoareClass {

    /**
     * Constructor for StoareClass
     */
    public StoareClass() {
        
    }

    /**
     * Method Description
     * @argument s, a string
     * @return the length of s multiplied by two
     */
    static int storage(String s) {
        return s.length() * 2;
    }

    /**
     * Main method
     **/
    static public void main(String[] args) {
        System.out.println(storage("Ciaobao"));
    }

}

