
/**
 * Ponton met ligplaatsen
 *
 * @author myName
 * @version myVersion
 */
import java.util.ArrayList;
import java.lang.StringBuffer;
public class Ponton
{
    //Velden
    private double maxDiepte; //maximale diepte van een boot aan het ponton
    private double maxLengte; //maximale lengte van een boot aan het ponton
    private String identificator; //ID van het ponton
    private ArrayList<Ligplaats> ligplaatsen; //Alle ligplaatsen in dat ponton
    
    /**
     * Constructor voor het ponton
     * @param p_maxDiepte is de maximale diepte van een boot aan het ponton
     * @param p_maxLengte is de maximale lengte van een boot aan het ponton
     * @param p_identificator is de ID van het ponton
     */
    
    public Ponton(double p_maxDiepte, double p_maxLengte, String p_identificator)
    {
        maxDiepte = p_maxDiepte;
        maxLengte = p_maxLengte;
        identificator = p_identificator;
    }
    
    /**
      * Maakt een nieuwe ligplaats voor deze ponton met een bepaalde breedte
      * Het identificatie nummer wordt automatisch gegenereerd en is een samenstelling
      * van de pontonletter en het nummer dat afhankelijk is van het reeds aantal 
      * bestaande ligplaatsen
      * @param breedte de breedte van de nieuwe gecreëerde ligplaats
   */
   public void toevoegenLigplaats(double p_breedte)
   {
       int volgnummerLigplaats = ligplaatsen.size() + 1; //volgnummer van de ligplaats in het ponton
       String identificatorLigplaats = identificator + volgnummerLigplaats; //ID van de nieuwe ligplaats
       Ligplaats nieuweLigplaats = new Ligplaats(identificatorLigplaats, p_breedte);
       ligplaatsen.add(nieuweLigplaats);
       
   }
   
   /**
      * Deze methode zoekt de optimale ligplaats voor een boot van een bepaalde breedte
      * We streven ernaar zo weinig mogelijk overschot te hebben. Wel moet verplicht een 
      * overschot van 60 cm zijn tussen de breedte van de ligplaats en de breedte van de
      * boot.
      * Bij het toekennen wordt ook rekening gehouden met het al dan niet bezet zijn, de 
      * lengte en de diepgang van de boot.
      * Indien de optimale ligplaats wordt gevonden wordt de boot er voorlopig nog niet 
      * aan toegekend
      * @param p_boot de boot waarvoor de ideale ligplaats wordt gezocht
      * @return de best passende ligplaats
      * null indien geen ligplaats gevonden 
   */
   public Ligplaats zoekOptimaleLigplaats(Boot p_boot)
   {
       //Indien lengte of diepgang boot > dan die van het ponton > null teruggeven (boot past niet)
       //Indien boot mogelijks voldoet:
           //Arraylist met ligplaatsen voor het ponton overlopen
            //Indien ligplaats bezet ==> ga naar volgende ligplaats
                //Bereken breedte ligplaats - breedte boot en check of dit groter is dan 60 ==>mogelijke kandidaat ligplaats
                //Update een indexvariabele van beste ligplaats. Indien overschot breedte > 60 maar < 
                    //beste tot nog toe gevonden ligplaaats ==>updaten
       
                    
       //Check of de boot überhaupt in het ponton kan op basis van lengte en diepte             
       if(p_boot.getLengte() > maxLengte || p_boot.getDiepte() > maxDiepte || ligplaatsen.size() == 0)
       {
           return null;
       }
       else
       {
           double breedteBesteLigplaats = ligplaatsen.get(0).getBreedte();
           int indexBesteLigplaats = 0;
           for(int i = 0; i < ligplaatsen.size(); i++)
           {
               //Als ligplaats al bezet is, bekijk de volgende ligplaats
               if(ligplaatsen.get(i).isBezet()==true)
               {
                   continue;
               }
               else 
               {
                   //speling tussen breedte boot en ligplaats berekenen
                   double spelingBreedte = ligplaatsen.get(i).getBreedte() - p_boot.getBreedte();
                   
                   if(spelingBreedte < 60)
                   {
                       continue;
                   }
                   else 
                   {
                       //Indien de aanvaardbare speling < dan deze van de best tot nog toe gevonden speling, pas dan
                       //de beste ligplaats aan
                       if(spelingBreedte < breedteBesteligplaats)
                       {
                           indexBesteLigplaats = i;
                       }
                   }
                   
               }
           }
           
           //geef beste ligplaats weer
           
           return ligplaatsen.get(indexBesteLigplaats);
       }
   }
   
   /**
     * Geeft een lijst van de eigenaars van alle boten die op deze ponton liggen * als <CODE>String</CODE> terug
     * @return de lijst van eigenaren als <CODE>String</CODE>
     */

    public String lijstEigenaars()
    {
        StringBuffer sb = new StringBuffer();
        
        for(int i = 0; i < ligplaatsen.size(); i++)
        {
            if(ligplaatsen.get(i).isBezet() == true)
            {
                Ligplaats mijnLigplaats = ligplaatsen.get(i);
                //We halen uit de ligplaats de boot op, dan via het boot object de eigenaar en dan passen we de toString toe
                    //op de eigenaar.
                sb.append(mijnLigplaats.geefBoot().geefEigenaar().toString()); 
            }
            //Indien de ligplaats nog niet bezet is, ga gewoon verder met het overlopen van de ligplaatsen
            else
            {
                continue;
            }
        }
        
        return sb.toString();
        
    }
}
