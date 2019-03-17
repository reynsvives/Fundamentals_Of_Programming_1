
/**
 * Write a description of class Rekening here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rekening
{
   //variabelen
   private String rekeningNummer;
   private String naamKlant;
   private double saldo;
   
   public Rekening(String p_rekeningNummer, String p_naamKlant)
   {
       rekeningNummer = p_rekeningNummer;
       naamKlant = p_naamKlant;
       saldo = 0.0;
   }
   
   /**
    * Methode om saldo op te halen
    */
   
   public double getSaldo()
   {
       return saldo;
   }
   
  
   /**
    * Stort geld bij op de rekening
    */
   
   public void stortGeld(double p_bedrag)
   {
       saldo = saldo + p_bedrag;
   }
   
   /**
    * Haal geld af van de rekening
    */
   
   public void neemGeld(double p_bedrag)
   {
       saldo = saldo - p_bedrag;
   }
   
   
}
