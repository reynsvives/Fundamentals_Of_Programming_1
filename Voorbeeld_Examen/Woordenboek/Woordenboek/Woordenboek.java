
/**
 * Klasse om te vertalen
 *
 * @author MyName
 * @version MyVersion
 */

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;
public class Woordenboek
{
    private HashMap<String, ArrayList<String>> woorden;
    private Random randomGenerator;
    
    /**
     * Constructor zonder argumenten
     */
    
    public Woordenboek()
    {
        woorden = new HashMap<>();
        randomGenerator = new Random();
    }
    
    /**
     * Getter voor veld woorden
     */
    
    public HashMap<String, ArrayList<String>> getWoorden()
    {
        return woorden;
    }
    
    /**
     * @param p_woord het nederlandstalig woord
     * @param p_woordenLijst de lijst van woorden in het Engels.
     */
    
    public void addWord(String p_woord, String p_vertaling)
    {
        boolean woordBestaat = false;
        
        //Check of het woord al bestaat in het woordenboek
        if(getWoorden().containsKey(p_woord))
        {
            woordBestaat = true;
        }
        
        //Logica als het woord al bestaat
        
        if(woordBestaat)
        {
            //Checken of de vertaling eerder al werd toegevoegd
            ArrayList<String> lijst_vertalingen = woorden.get(p_woord);
            boolean vertalingBestaat = false;
            
            for(String s : lijst_vertalingen)
            {
                if(s.equals(p_vertaling))
                {
                    vertalingBestaat = true;
                }
            }
            
            //Indien vertaling nog niet bestond, voeg vertaling toe, anders niet
            if(vertalingBestaat == false)
            {
                getWoorden().get(p_woord).add(p_vertaling);
            }
        }
        else //Toevoegen van de vertaling als het woord nog niet bestond
        {
            ArrayList<String> mijnVertaling = new ArrayList<>();
            mijnVertaling.add(p_vertaling);
            
            getWoorden().put(p_woord, mijnVertaling);
        }
        
    }
    
            
    /**
     * Methode om de reeks vertalingen weer te geven
     * @param p_woord het woord dat we willen vertalen
     */
    
        public String getVertaling(String p_woord)
        {
            //woord opzoeken en willekeurige vertaling kiezen
            
            //Aantal vertalingen voor het woord bepalen
            
            int aantalVertalingen = getWoorden().get(p_woord).size();
            
            //Genereer random getal tussen 0 en aantalVertalingen
            
            int indexGekozenVertaling = randomGenerator.nextInt(aantalVertalingen);
                
            //Ophalen van de vertaling
            
            return getWoorden().get(p_woord).get(indexGekozenVertaling);

        }
        
}
