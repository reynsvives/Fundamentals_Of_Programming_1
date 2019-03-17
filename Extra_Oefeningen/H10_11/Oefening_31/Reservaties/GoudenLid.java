
/**
 * Subklasse gouden lid.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GoudenLid extends Lid
{
    private int aantalAandelen;
    private double kortingHuur = 5.0;
    
    public GoudenLid(String p_naam, String p_telefoonNummer, int p_aantalAandelen)
    {
        super(p_naam, p_telefoonNummer);
        aantalAandelen = p_aantalAandelen;
    }
    
    /**
     * Korting voor huur boten
     */
    
    public double getKorting()
    {
        return kortingHuur;
    }
    
}
