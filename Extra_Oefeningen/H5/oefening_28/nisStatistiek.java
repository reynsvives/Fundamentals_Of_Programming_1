
/**
 * Write a description of class nisStatistiek here.
 *
 * @MyName
 * @myVersion
 */

import java.util.ArrayList;

public class nisStatistiek
{
    ArrayList<geboorteCijfer> geboortecijfers;
    
    /**
     * Constructor
     */
    public nisStatistiek()
    {
       geboortecijfers = new ArrayList<>();
    }
    
    /**
     * Methode voor toevoegen geboortecijfers
     */
    
    public void addGeboortcijfer(int jaartal)
    {
        geboorteCijfer tabelGeboorteCijfer = new geboorteCijfer(jaartal);
        geboortecijfers.add(tabelGeboorteCijfer);
    }
}
