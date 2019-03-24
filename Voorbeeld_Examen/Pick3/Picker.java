
/**
 * Write a description of class Picker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.lang.StringBuffer;
public class Picker
{
    private PickReeks reeks1;
    private PickReeks reeks2;
    private PickReeks reeks3;
    
    /**
     * Zero argumenten constructor
     */
    
    public Picker()
    {
        reeks1 = new PickReeks(10);
        reeks2 = new PickReeks(10);
        reeks3 = new PickReeks(10);
    }
    
    /**
     * Constructor met maxWaarde
     */
    
    public Picker(int p_maxWaarde)
    {
        reeks1 = new PickReeks(p_maxWaarde);
        reeks2 = new PickReeks(p_maxWaarde);
        reeks3 = new PickReeks(p_maxWaarde);
        
    }
    
    /**
     * getReeks1()
     */
    
    public PickReeks getReeks1()
    {
        return reeks1;
    }
    
    /**
     * getReeks2()
     */
    
    public PickReeks getReeks2()
    {
        return reeks2;
    }
    
    /**
     * getReeks3()
     */
    
    public PickReeks getReeks3()
    {
        return reeks3;
    }
    
    /**
     * printOverzicht()
     */
    
    public void printOverzicht()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("Getal 1:" + getReeks1().getPickWaarde());
        sb.append("Getal 2:" + getReeks2().getPickWaarde());
        sb.append("Getal 3:" + getReeks3().getPickWaarde());
        System.out.println(sb.toString());
        
    }
}
