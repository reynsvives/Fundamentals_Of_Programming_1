
/**
 * Vertaler die een reeks woorden kan vertalen
 *
 * @author myName
 * @version MyVersion
 */
import java.util.ArrayList;
public class Vertaler
{
    Woordenboek wb;
    ArrayList<String> woorden;
    
    /**
     * Constructor
     * @param p_woordenboek die de woordenboek aanneemt
     */
    
    public Vertaler(Woordenboek p_woordenboek)
    {
        wb = p_woordenboek;
        woorden = new ArrayList<>();
    }
    
    /**
     * Geef woordenboek
     */
    
    public Woordenboek geefWoordenboek()
    {
        return wb;
    }
    
    /**
     * Vertaal woordenreeks
     */
    
    public ArrayList<String> vertaalReeks(ArrayList<String> w)
    {
        ArrayList<String> vertaaldeWoorden = new ArrayList<>();
        
        //Overlopen van de te vertalen woorden in arratlist w
        for(int i = 0; i < w.size(); i++)
        {
            String vertaaldWoord = geefWoordenboek().getVertaling(w.get(i));
            vertaaldeWoorden.add(vertaaldWoord);
        }
        
        return vertaaldeWoorden;
        
    }
}
