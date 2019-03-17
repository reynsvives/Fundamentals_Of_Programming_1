
/**
 * Write a description of class gebrokenLijn here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;

public class gebrokenLijn extends Shape
{
    public gebrokenLijn()
    {
    }
    
    public gebrokenLijn(ArrayList<Punt> p_punten)
    {
        super(p_punten);
    }
    
    /**
     * Omtrek bepalen
     */
    
    public double omtrek()
    {
        double omtrek = 0.0;
        for(int i = 0; i < super.getPoints().size(); i++)
        {
            Punt currentPoint = super.getPoint(i);
            Punt nextPoint = super.getPoint(i+1);
            omtrek = omtrek + currentPoint.distance(nextPoint);
        }
        
        return omtrek;
    }
}
