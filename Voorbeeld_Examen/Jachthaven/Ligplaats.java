
/**
 * Ligplaats van de boot op een bepaald ponton
 *
 * @author myName
 * @version myVersion
 */
public class Ligplaats
{
   //Variabelen
   private String identificator; //ID van de ligplaats
   private double breedte; //breedte van de ligplaats
   private Boot boot; //Boot die toegewezen is aan de ligplaats voor het seizoen
   
   /**
    * Constructor
    * @param p_identificator is de id van de ligplaats
    * @param p_breedte is de breedte van de ligplaats
    */
   
   public Ligplaats(String p_identificator, double p_breedte)
   {
       identificator = p_identificator;
       breedte = p_breedte;
       
   }
   
   /**
    * Methode om de boot aan een ligplaats toe te wijzen
    * @param p_boot de boot die toegewezen moet worden aan de ligplaats
    */
   
   public void toewijzenBoot(Boot p_boot)
   {
       if(boot == null)
       {
          boot = p_boot;
       }

   }
   
   /**
    * verwijderBoot() verwijdert de boot van de ligplaats
    */
   
   public void verwijderBoot()
   {
       boot = null;
   }
   
   /**
    * isBezet() geeft aan of de ligplaats is toegekend aan een boot
    */
   
   public boolean isBezet()
   {
       if(boot == null)
       {
           return false;
       }
       else
       {
           return true;
       }
   }
   
   /**
    * geefBoot() geeft de boot die aan de ligplaats is toegekend
    */
   
   public Boot geefBoot()
   {
       return boot;
   }
}
