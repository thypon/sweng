/**
 * @author Andrea Brancaleoni
 * @version 2012/03/11
 */

public class Dog2 {

    /**
     * Constructor for Dog2
     */
    public Dog2() {
        
    }

    /**
     * Method Description
     * 
     * @return 
     */
    public void bark(int num, String b) {
        for (int i=0; i < num; i++) {
            System.out.println(b);
        }
    }

    /**
     * Method Description
     * 
     * @return 
     */
    public void bark(String b, int num) {
        for (int i=0; i < num; i++) {
            System.out.println(b);
        }
    }

}

