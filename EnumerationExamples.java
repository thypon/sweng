/**
 * @author Andrea Brancaleoni
 * @version 2012/03/07
 */


public class Size {
    // versione prima della 6
    public static SMALL = 0,
                  MEDIUM = 1,
                  LARGE = 2,
                  EXTRA_LARGE = 3;
}

public class EnumerationExamples {
    enum Size {SMALL, MEDIUM, LARGE, EXTRA_LARGE;

    Size s = Size.MEDIUM;
    // Quello che facciamo è definire una classe con simboli statici. Non posso costruire altre istanze se non con quelle definite dalla ENUM, posso fare confronto con il == poichè i valori che diamo all'enum sono solo etichette che viene tradotto con un insieme di interi
    public EnumerationExamples(){
        
    }
}

public enum Size {
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");

    private string abbreviation;

    private Size(String abbreviation) {
        this.abbreviation = abbreviation;
    } // IMPORTANTE, il costruttre è privato poichè non viene offerta al mondo esterno dato che non posso istanziare direttamente una Enum.

    public String getAbbreviation() {
        return abbreviation;
    }
