
/**
 * Klasse waar we een aantal woorden vertalen op basis van het woordenboek
 */

import java.util.ArrayList;
public class Hoofdklasse
{
    Woordenboek wb;
    ArrayList<String> teVertalenWoorden;
    Vertaler vt;
    
    
    
    public Hoofdklasse()
    {
        wb = new Woordenboek();
        teVertalenWoorden = new ArrayList<>();
        
        //woorden toevoegen aan het woordenboek
        
        wb.addWord("mooi", "beautiful");
        wb.addWord("mooi", "pretty");
        wb.addWord("mooi", "nice");
        wb.addWord("kind", "child");
        
        //lijst te vertalen woorden
        
        teVertalenWoorden.add("mooi");
        teVertalenWoorden.add("kind");
        
        //vertaler
        vt = new Vertaler(wb);
    }
    
    /**
     * Print vertaling
     */
    
    public void printVertaling()
    {
        System.out.println(vt.vertaalReeks(teVertalenWoorden).toString());
        
    }
    
}
