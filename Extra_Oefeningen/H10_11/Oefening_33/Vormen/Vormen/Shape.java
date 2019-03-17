
/**
 * Shape die een tabel van punten bevat
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.ArrayList;

public class Shape
{
    private ArrayList<Punt> punten;
    
    public Shape()
    {
        punten = new ArrayList<>();
    }
    
    public Shape(ArrayList<Punt> p_punten)
    {
        punten = p_punten;
    }
    
    
    /**
     * Punten toevoegen aan de lijst
     */
    
    public void addPoint(Punt p_punt)
    {
        punten.add(p_punt);
    }
    
    /**
     * getPoint
     */
    
    public Punt getPoint(int p_index)
    {
        return punten.get(p_index);
        
    }
    
    /**
     * getpunten
     */
    
    public ArrayList<Punt> getPoints()
    {
        return punten;
    }
    
    /**
     * Shape verplaatsen door punt voor punt de move() methode aan te 
     * roepen en een delta mee te geven waarover moet verschoven worden.
     */
    
    public void moveShape(double p_delta_x_coord, double p_delta_y_coord)
    {
        for(Punt p : punten)
        {
            p.move(p_delta_x_coord, p_delta_y_coord);
        }
        
    }
   
}
