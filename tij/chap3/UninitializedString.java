/**
 * @author Andrea Brancaleoni
 * @version 2012/03/10
 */

public class UninitializedString {
    public String s;

    /**
     * Constructor for UninitializedString
     */
    public UninitializedString() {
        
    }

    /**
     * Main method
     **/
    static public void main(String[] args) {
        UninitializedString u = new UninitializedString();
        System.out.println(u.s);
    }

}

