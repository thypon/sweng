/**
 * @author Andrea Brancaleoni
 * @version 2012/03/07
 */

public class Automobile2 {
    public String colore, marca, modello;

    // C'è la necessità di specificare il this, ad esempio nel costruttore
    public void trasfoma(String marca, String modello) {
        this.marca = marca;
        this.modello = modello;
    }

    //...
    
    public static void main(String[] args) {
        Automobile a = new Automobile();
        a.trasforma("FORD", "4");
    }
}

