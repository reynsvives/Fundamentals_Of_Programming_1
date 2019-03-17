
/**
 * Superklasse lid
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lid
{
    private String naam;
    private String telefoonNummer;
    private static final double lidgeld = 25;
    
    public Lid(String p_naam, String p_telefoonNummer)
    {
        naam = p_naam;
        telefoonNummer = p_telefoonNummer;  
    }
    
    /**
     * Geefkorting voor huur van boten
     */
    
    public double getKorting()
    {
        return 0.0;
    }
}
