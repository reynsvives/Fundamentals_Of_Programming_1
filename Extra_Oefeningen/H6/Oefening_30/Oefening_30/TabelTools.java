
/**
 * Write a description of class TabelTools here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.HashMap;

public class TabelTools
{
    private int[] tab;
    
    public TabelTools(int[] myTable)
    {
        tab = myTable;
    }
    
    //Implementatie van de oplossing met een hashmap.
    //In de hashmap wordt per getal de frequentie bijgehouden.
    public void komtHetVaakstVoorHash()
    {
        //Hashmap om resultaten in op te slaan
        HashMap<Integer, Integer> statMap = new HashMap<>();
        
        //Over de de tabel met integers lopen en de frequentie van elk element bepalen
            //Als het getal al in de hashmap zit, dan gewoon de frequentie ophogen
            //Als het getal nog niet in de hasmap zit, dan het getal invoeren en frequentie op 1 zetten.
        
        for(int i = 0; i < tab.length; i++)
        {
            int currentElement = tab[i];
            if(statMap.containsKey(currentElement))
            {
                //Huidige waarde ophalen en ophogen met 1
                int newValue = statMap.get(currentElement) + 1;
                //Nieuwe waarde invoeren voor het element
                statMap.replace(currentElement, newValue);
            }
            else 
            {
                statMap.put(currentElement, 1);
            }
            
        }
        
        //Over de HashMap lopen en nagaan welk element het meest voorkomt
        
        int vaakstVoorkomendElement = statMap.get(tab[0]);
        int frequentie = 0;
        
        for(Integer key : statMap.keySet())
        {
            if(statMap.get(key) > frequentie)
            {
                frequentie = statMap.get(key);
                vaakstVoorkomendElement = key;
            }
        }
        
        //Printen van het resultaat
        
        System.out.println("{" + vaakstVoorkomendElement + "," + frequentie +"}");
    }
    
    public void komtHetVaakstVoorTab()
    {
        //hulptabel aanmaken
        int[] myTab = tab;
        int hulpVar;
        int min = 0;
        
        //Sort by Selection
        
        for(int i = 0; i < tab.length - 1; i++)
        {
            for(int j = i+1; j < tab.length; j++)
            {
                if(tab[j] < tab[min])
                {
                    min = j;
                }
            }
            
            //Minimum naar voor schuiven
            hulpVar = myTab[i];
            myTab[i] = myTab[min];
            myTab[min] = hulpVar;
        }
       
        
        //Over de gesorteerde tabel lopen en meest voorkomende tellen
       
        System.out.println(myTab[0]);
        
        int currentElement=myTab[0];
        int freqCurrentElement=0;
        int freqMeestVoorkomend=0;
        int meestVoorkomendElement = myTab[0];

        
        for(int i = 0; i < myTab.length; i++)
        {
           if(myTab[i] == meestVoorkomendElement)
           {
               freqMeestVoorkomend = freqMeestVoorkomend + 1;
           }
           else 
           {
               if(currentElement != myTab[i])
               {
                   freqCurrentElement = 0;
               }
               currentElement = myTab[i];
               freqCurrentElement = freqCurrentElement + 1;
               
               if(freqCurrentElement > freqMeestVoorkomend)
               {
                   freqMeestVoorkomend = freqCurrentElement;
                   meestVoorkomendElement = currentElement;
               }
           }
           
           System.out.println("currentElement" + currentElement);
           System.out.println("freqCurrentElement" + freqCurrentElement);
           System.out.println("meestVoorkomendElement" + meestVoorkomendElement);
           System.out.println("freqVoorkomendElement" + freqMeestVoorkomend); 
        }
        
        //Printen van het resultaat
        
        System.out.println("{" + meestVoorkomendElement + "," + freqMeestVoorkomend + "}");
       
    }
}
