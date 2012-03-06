/**
 * @author Andrea Brancaleoni
 * @version 2012/03/06
 */

public class StateShare {
    //la classe StateShare emula un namespace con membri privati. L'idea è di avere uno stato (conn), condiviso tra Writer e Reader.

    private static DBConnection conn;

    static public class Writer {
        //Qui posso accedere a conn
    }

    static public class Reader {
        //Allo stesso modo posso accedere a conn
    }
}

