
/**
 * Write a description of class Lijn here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lijn extends Shape
{
    public Lijn()
    {
        super();
        Punt p1 = new Punt(0, 0);
        Punt p2 = new Punt(1, 1);
        super.addPoint(p1);
        super.addPoint(p2);

    }
    
    public double omtrek()
    {
        Punt p1 = super.getPoint(0);
        Punt p2 = super.getPoint(1);
        
        return p1.distance(p2);
    }
}
