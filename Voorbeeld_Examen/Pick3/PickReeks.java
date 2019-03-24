
/**
 * Write a description of class PickReeks here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.lang.Math;
public class PickReeks
{
    private int pickWaarde; //gekozen getal
    private int maxWaarde; //maximum te kiezen waarde
    
    public PickReeks(int p_maxWaarde)
    {
        setPickWaarde();
        maxWaarde = p_maxWaarde;
    }
    
    //pickWaarde krijgt een willekeurig getal toekend tussen 0 
    //en maximum (0 en maximum inbegrepen
    
    public void setPickWaarde()
    {
        pickWaarde = (int)(Math.random() * (maxWaarde + 1));
    }
    
    /**
     * getPickwaarde
     */
    
    public int getPickWaarde()
    {
        return pickWaarde;
    }
    
}
