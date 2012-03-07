/**
 * @author Andrea Brancaleoni
 * @version 2012/03/07
 */

public class Shape {
    static Screen screen = new Screen();
    static void setScreen(Screen s) {
      screen = s;
    }

    void Show(Screen s) { 
      setScreen(s);
    }


    public Shape(){
        
    }

    public static void main(String[] args) {
        Shape.setScreen(new Screen());
        Shape.show(); //Errato poiche il metodo show di default non è statico.
        Shape s1 = new Shape(), s2 = new Shape();
        Screen s = new Screen();
        s1.setScreen(s);

        //corretto in quanto si possono chiamare metodi statici su 
    }
}

