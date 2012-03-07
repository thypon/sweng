/**
 * @author Andrea Brancaleoni
 * @version 2012/03/06
 */

public class Data {
    private int giorno;
    private int mese;
    private int anno;


    public Data() {
    }
    
    public Data setGiorno(int g) {
        giorno = g;
        return this;
    }

    public Data setMese(int m) {
        mese = m;
        return this;
    }

    public Data setAnno(int a) {
        anno = a;
        return this;
    }

    public int leggiGiorno() {
        return giorno;
    }

    public int leggiAnno() {
        return anno;
    }

    public int leggiMese() {
        return mese;
    }

    public void inspect() {
        System.out.printf("Oggi e' il %d/%d/%d\n", giorno, mese, anno);
    }

    public static void main(String[] args) {
        Data data = new Data();
        data.
          setGiorno(new Integer(args[0])).
          setMese(new Integer(args[1])).
          setAnno(new Integer(args[2])).
          inspect();
    }
}

