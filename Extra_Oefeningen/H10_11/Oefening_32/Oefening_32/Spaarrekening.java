
/**
 * Spaarrekeningen
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Spaarrekening extends Rekening
{
    private double rentePercentage = 5.0;
    
    public Spaarrekening(String p_rekeningNummer, String p_naamKlant)
    {
        super(p_rekeningNummer, p_naamKlant);
    }
    
    /**
     * neemGeld() overschrijven want er mag niet onder 0 gegaan worden op de
     * spaarrekening
     * @param p_bedrag is het op te nemen bedrag
     */
    
    public void neemGeld(double p_bedrag)
    {
        if(getSaldo() - p_bedrag >= 0)
        {
            super.neemGeld(p_bedrag);
        }
    }
    
    /**
     * Rente berekenen van de voorbije maand
     */
    
    public void berekenRente()
    {
        double rentebedrag;
        rentebedrag = getSaldo() * (rentePercentage / 100);
        stortGeld(rentebedrag); // nieuw saldo toekennen
    }
    
}
