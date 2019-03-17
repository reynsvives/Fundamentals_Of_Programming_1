
/**
 * Reservatie invoeren en prijs berekenen
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Reservatie
{
   private double aantalUren;
   private Lid res_Lid;
   private Boot res_Boot;
   
   public Reservatie(Lid p_Lid, Boot p_Boot, double p_aantalUren)
   {
       res_Lid = p_Lid;
       res_Boot = p_Boot;
       aantalUren = p_aantalUren;
   }
   
   /**
    * Methode om prijzen te berekenen in functie van het soort lid en 
    * het soort boot.
    */
   
   public double kostReservatie()
   {
       return aantalUren * res_Boot.huurprijs() * (1.0 - (res_Lid.getKorting() / 100));
   }
 
}
