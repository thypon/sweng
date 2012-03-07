/**
 * @author Andrea Brancaleoni
 * @version 2012/03/07
 */

public class Data2 {
    private int giorno, 
                mese, 
                anno;

    public Data2(){
        
    }

    // Per copiare le date ho bisogno di copiare tutti i campi semplici uno a uno, altrimenti verrebbero salvate i riferimenti. Tuttavia poiche le String sono immutabili possono essere pensate come tipi base benchè conservino l'efficienza in memoria degli altri tipi.

    public void copiaIn(Data d) {
        d.giorno = giorno;
        d.mese = mese;
        d.anno = anno;
    }

    public static void main(String[] args) {
        Data d1 = new Data(3, 2 1984);
        Data d2 = new Data(1, 1, 1990);
        d1.copiaIn(d2);
    }
}

