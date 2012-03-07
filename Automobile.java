/**
 * @author Andrea Brancaleoni
 * @version 2012/03/07
 */

public class Automobile {
    // In java è necessario definire la visibilità
    // in quanto se non viene fatto viene data di default
    private String colore, marca, modello;
    private int cilindrata, numPorte;
    private boolean accesa;

    public Automobile(){
      
    }

    public void accendi() {
        accesa = true;
    }
    
    // I parametri che sono base sono passati per copia, altrimenti sono passati per riferimento in maniera trasparente all'utente.
    public boolean puoPartire() {
        return accesa;
    }

    public void dipingi(String col) {
        colore = col;
    }
    
    public void trasforma(String ma, String mo) {
        marca = ma;
        modello = mo;
    }
}

