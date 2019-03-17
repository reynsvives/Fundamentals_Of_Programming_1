
/**
 * Cirkels
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;
import java.lang.Math;

public class Cirkel extends Shape
{
    private double straal;
   
    
    public Cirkel()
    {
        super();
        Punt myPoint = new Punt(0.0, 0.0);
        super.addPoint(myPoint);
        straal = 1;
    }
    
    public Cirkel(double p_straal, Punt middelpunt)
    {
      super(); 
      super.addPoint(middelpunt);
      straal = p_straal;
    }
    
    /**
     * Omtrek berekenen
     */
    
    public double getOmtrek()
    {
        return Math.PI * straal;
    }
    
    /**
     * Middelpunt ophalen
     */
    
    public Punt getMiddelPunt()
    {
       return super.getPoint(0);
    }
}
