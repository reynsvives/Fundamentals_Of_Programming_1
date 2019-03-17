
/**
 * Subklasse voor motorboot
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Motorboot extends Boot
{
   private double huurprijs = 50.0;
   private boolean fishFinder;
   private double toeslagFishFinder = 7.0;
   
   public Motorboot(String p_naam, boolean p_heeftRadar, boolean fishFinder)
   {
       super(p_naam, p_heeftRadar);
       this.fishFinder = fishFinder;
   }
   
   /**
     * Huurprijs bepalen in functie van GPS en radar 
     */
    
    public double huurprijs()
    {
    //Indien enkel radar
    if(getRadar() && fishFinder == false)
    {
        return huurprijs * (1 + (getToeslagRader() / 100));
    }
    
    //Indien geen radar maar wel gps
    else if(getRadar() == false && fishFinder == true)
    {
        return huurprijs * (1 + (toeslagFishFinder / 100)); 
    }
    
    //Indien radar en gps
    else if(getRadar() == true && fishFinder == true)
    {
        return 
            huurprijs + //basisbedrag    
            huurprijs * (getToeslagRader() / 100) + //toeslag radar
            huurprijs * (toeslagFishFinder / 100); //toeslag fishFinder
    }
    
    //Indien geen extra opties
    
    else 
    {
        return huurprijs;
    }
        
    }
   
}
