
/**
 * Klasse zeilboot die een subklasse is van Boot.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Zeilboot extends Boot
{
    private double huurprijs = 25.0;
    private boolean heeftGPS;
    private static final double toeslagGPS = 3.0;
    
    public Zeilboot(String p_naam, boolean p_heeftRadar, boolean heeftGPS)
    {
        
        super(p_naam, p_heeftRadar);
        this.heeftGPS = heeftGPS;
    }
     
    
    /**
     * Huurprijs bepalen in functie van GPS en radar 
     */
    
    public double huurprijs()
    {
        //Indien enkel radar
        if(getRadar() == true && heeftGPS == false)
        {
            return huurprijs * (1 + (getToeslagRader()/100));
        }
        
        //Indien geen radar maar wel gps
        else if(getRadar() == false && heeftGPS == true)
        {
            return huurprijs * (1 + (toeslagGPS / 100)); 
        }
        
        //Indien radar en gps
        else if(getRadar() == true && heeftGPS == true)
        {
            return  
                huurprijs + //basisbedrag    
                huurprijs * (getToeslagRader() / 100) + //toeslag radar
                huurprijs * (toeslagGPS / 100); //toeslag gps
        }
        
        //Indien geen extra opties
        
        else 
        {
            return huurprijs;
        }
        
    }
   
    
}
