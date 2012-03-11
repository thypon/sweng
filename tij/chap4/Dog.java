/**
 * @author Andrea Brancaleoni
 * @version 2012/03/11
 */

public class Dog {

    /**
     * Constructor for Dog
     */
    public Dog() {
        
    }

    /**
     * Method Description
     * 
     * @return 
     */
    public void bark() {
        System.out.println("Bau! ");
    }

    /**
     * Method Description
     * 
     * @return 
     */
    public void bark(int times) {
        for (int i = 0; i < times; i++) {
            bark();
        }
    }

    /**
     * Method Description
     * 
     * @return 
     */
    public void bark(String bau) {
        System.out.println(bau);
    }

    /**
     * Main method
     **/
    static public void main(String[] args) {
        Dog fuffy = new Dog();

        fuffy.bark();
        fuffy.bark(3);
        fuffy.bark("Rawl!");
    }

}

