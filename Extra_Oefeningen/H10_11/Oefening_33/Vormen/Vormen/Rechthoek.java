
/**
 * Write a description of class Rechthoek here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rechthoek extends Shape
{
    /**
     * Constructor met default waarden
     */
    public Rechthoek()
    {
        super();
        Punt myPoint1 = new Punt(0, 1);
        Punt myPoint2 = new Punt(1, 0);
        super.addPoint(myPoint1);
        super.addPoint(myPoint2);
    }
    
    /**
     * Constructor met zelf gekozen parameters
     */
    
    public Rechthoek(Punt p_punt1, Punt p_punt2)
    {
        super();
        super.addPoint(p_punt1);
        super.addPoint(p_punt2);
    }
    
    /**
     * Omtrek berekenen
     */
    
    public double getOmtrek()
    {
        Punt hoekpunt1 = super.getPoint(0);
        Punt hoekpunt2 = super.getPoint(2);
        
        //Hoekpunt op zelfde lijn als hoekpunt1
        double x_hp_3 = hoekpunt2.getXCoord();
        double y_hp_3 = hoekpunt1.getYCoord();
        //Maak nu het punt aan zodat we de distance tussen 2 punten
            //kunnen berekenen.
        Punt hoekpunt3 = new Punt(x_hp_3, y_hp_3);
        
                //Hoekpunt op zelfde lijn als hoekpunt1
        double x_hp_4 = hoekpunt1.getXCoord();
        double y_hp_4 = hoekpunt2.getYCoord();
        //Maak nu het punt aan zodat we de distance tussen 2 punten
            //kunnen berekenen.
        Punt hoekpunt4 = new Punt(x_hp_4, y_hp_4);
        
        //Lengte van de zijden berekenen
        
        double zijde1 = hoekpunt1.distance(hoekpunt3);
        double zijde2 = hoekpunt1.distance(hoekpunt4);
        
        //Omtrek bepalen
        
        double omtrek = (2 * zijde1) + (2 * zijde2);
        
        return omtrek;
        
    }
    
}
