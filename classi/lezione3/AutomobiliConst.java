/**
 * @author Andrea Brancaleoni
 * @version 2012/03/07
 */

public class AutomobiliConst {
    int colore;
    final int BLU = 0, GIALLO = 1;

    void dipingi(int colore) {
        this.colore = colore;
    }


    public AutomobiliConst(){
        
    }

    public static void main(String[] args) {
        AutomobiliConst a = new AutomobiliConst();
        a.BLU = 128; // errato non è possibile riassegnare il final
        System.out.println("BLU = " + a.BLU) // Corretto
    }
}

