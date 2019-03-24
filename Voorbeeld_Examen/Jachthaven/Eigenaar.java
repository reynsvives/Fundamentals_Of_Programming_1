
/**
 * Klasse eigenaar
 *
 * @author myName
 * @version myVersion
 */
public class Eigenaar
{
   //velden
   private String naam;
   private String adres;
   private int postnummer;
   private String gemeente;
   private String rekeningnummer;
    
   
   /**
    * @param p_naam naam van de eigenaar
    * @param p_adres adres van de eigenaar
    * @param p_postnummer postnummer van de woonplaats van de eigenaar
    * @param p_gemeente gemeente van de woonplaats van de eigenaar
    * @param p_rekeningnummer rekeningnummer van de eigenaar
    */
   public Eigenaar(String p_naam, String p_adres, int p_postnummer, String p_gemeente, String p_rekeningnummer)
   {
       naam = p_naam;
       adres = p_adres;
       
       if(p_postnummer >= 1000 & p_postnummer <= 9999)
       {
           postnummer = p_postnummer;
       }
       else 
       {
           System.out.println("Postcode ligt niet tussen 1000 en 9999");
       }

       gemeente = p_gemeente;
       rekeningnummer = p_rekeningnummer;
   }
   
   /**
    * Mutator voor het postnummer
    */
   public void veranderPostnummer(int p_postnummer)
   {
       postnummer = p_postnummer;
   }
   
   /**
    * toString()
    */
   
   public String toString()
   {
       return naam + " " + adres + " " + postnummer + " " + gemeente + " " + rekeningnummer;
   }
}
