
/**
 * Superklasse Boot die algemeen een boot beschrijft
 * @author (your name)
 * @version (a version number or a date)
 */
public class Boot
{
    private String naam;
    private boolean heeftRadar;
    private final static double toeslagRadar = 7.0;
    
    /*
     * Constructor voor Boot
     */
    
    public Boot(String p_naam, boolean p_heeftRadar)
    {
        naam = p_naam;
        heeftRadar = p_heeftRadar;
    }
    
    /**
     * Methode voor huurprijs
     */
    
    public double huurprijs()
    {
        return 0.0;
    }
    
    /**
     * getRadar geeft aan of er een radar aan boord is
     */
    
    public boolean getRadar()
    {
        return heeftRadar;
    }
    
    /**
     * Methode om toeslagRadar weer te geven
     */
    
    public double getToeslagRader()
    {
        return toeslagRadar;
    }
}
