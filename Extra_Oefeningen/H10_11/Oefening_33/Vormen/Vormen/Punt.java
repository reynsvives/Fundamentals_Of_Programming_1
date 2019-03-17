
/**
 * Een klasse die een punt beschrijft als X-Y coördinaat
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.lang.Math;
import java.lang.StringBuffer;

public class Punt
{
    private double x_coord;
    private double y_coord;
    
    public Punt(double p_x_coord, double p_y_coord)
    {
        x_coord = p_x_coord;
        y_coord = p_y_coord;
        
    }
    
    /**
     * X-coördinaat ophalen
     */
    
    public double getXCoord()
    {
        return x_coord;
    }
    
    /**
     * Y-coördinaat ophalen
     */
    
    public double getYCoord()
    {
        return y_coord;
    }
    
    /**
     * Aanpassen x-coördinaat
     */
    
    public void setXCoord(double p_x_coord)
    {
        x_coord = p_x_coord;
    }
    
    /**
     * Aanpassen y-coördinaat
     */
    
    public void setYCoord(double p_y_coord)
    {
        y_coord = p_y_coord;
    }
    
    /**
     * Verplaatsten van het punt
     * @param p_delta_x_coord geeft het aantal eenheden om punt te verplaatsen
     * over de x-as
     * @param p_detla_y_coord geeft het aantal eenheden om het punt te
     * verplaatsen over de y-as
     */
    
    public void move(double p_delta_x_coord, double p_delta_y_coord)
    {
        double new_x_coord;
        double new_y_coord;
        
        //Bereken nieuwe coördinaat
        new_x_coord = getXCoord() + p_delta_x_coord;
        new_y_coord = getYCoord() + p_delta_y_coord;
        
        //Toekennen van de nieuwe coördinaat
        
        setXCoord(new_x_coord);
        setYCoord(new_y_coord);

    }
    
    /**
     * Afstand tussen 2 punten berekenen via euclidische afstandsformule
     */
    
    public double distance(Punt p_punt)
    {
        double diff_x_squared;
        double diff_y_squared;
        double distance;
        
        //Kwadraat verschil x-coördinaten berekenen
        diff_x_squared = 
        (p_punt.getXCoord() - getXCoord()) * 
        (p_punt.getXCoord() - getXCoord());
        
        //Kwadraat verschil y-coördinaten berekenen
        diff_y_squared = 
        (p_punt.getYCoord() - getYCoord()) * 
        (p_punt.getYCoord() - getYCoord());
        
        //Vierkantswortel berekenen
        
        distance  = Math.sqrt(diff_x_squared + diff_y_squared);
        
        return distance;
    }
    
    /**
     * Punt als coördinatenkoppel voorstellen
     */
    
    public String toString()
    {
        StringBuffer sb = new StringBuffer();
        
        sb.append("Punt (");
        sb.append(getXCoord());
        sb.append(", ");
        sb.append(getYCoord());
        sb.append(")");
        
        return sb.toString();

    }
}
