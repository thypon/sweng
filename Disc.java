/**
 * @author Andrea Brancaleoni
 * @version 2012/03/07
 */

public class Disc {
    private static int counter;
    private int discNumber;

    public Disc(){
        discNumber = counter++;       
    }

    public int getDiscNumber() {
        return discNumber;
    }

    public static int getTotalNoOfDiscs() {
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(Disc.getTotalNoOfDiscs());
        Disc d1 = new Disc();
        Disc d2 = new Disc();

        System.out.println(d1.discNumber); // 0
        System.out.println(d2.discNumber); // 1
        //System.out.println(Disc.getDiscNumber());// Errore poiche' cerco di acceder a un metodo non statico da un nome di una classe
        System.out.println(Disc.getTotalNoOfDiscs()); // 2
    }
}

