/**
 * @author Andrea Brancaleoni
 * @version 2012/03/07
 */

public class Data3 {
    private int giorno,
                mese,
                anno;

    public void giornoDopo() {
        this.giorno++;
        if (this.giorno > 31) {
            this.giorno = 1;
            this.mese++;
        }
        // altro
    }

    public Data3(){
          
    }

    public static void main(String[] args) {
        Data d1, d2;
        d1.giornoDopo(); // Da errore a runtime in generale poiche abbiamo definito un oggetto che ancora non esiste. La complicazione è che non basta averlo dichiarato ma anche averlo inizializzato.
        d2.giornoDopo();
    }
}

