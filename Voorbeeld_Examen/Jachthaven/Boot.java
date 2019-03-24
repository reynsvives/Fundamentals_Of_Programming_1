
/**
 * Deze klasse modelleert een boot
 *
 * @author myName
 * @version myVersion
 */
public class Boot
{
   //Variabelen
   public static final int MOTORBOOT = 1;
   public static final int ZEILBOOT = 0;
   private double breedte;
   private double diepgang;
   private double lengte;
   private String naam;
   private int type;
   private Eigenaar eigenaar;
   
   /**
    * Constructor
    * @param p_breedte is de breedte van de boot
    * @param p_diepgang is de diepgang van de boot
    * @param p_lengte is de lengte van de boot
    * @param p_naam is de naam van de boot
    * @param p_eigenaar is de eigenaar van de boot
    */
   
   public Boot(double p_breedte, double p_diepgang, double p_lengte, String p_naam, int p_type, Eigenaar p_eigenaar)
   {
       breedte = p_breedte;
       diepgang = p_diepgang;
       lengte = p_lengte;
       naam = p_naam;
       
       if(p_type != MOTORBOOT || p_type != ZEILBOOT)
       {
           System.out.println("Het type boot is niet van type ZEILBOOT of MOTORBOOT");
       }
       else 
       {
           type = p_type;
       }

       eigenaar = p_eigenaar;
       
   }
   
   /**
    * Mutator om de eigenaar van de boot te wijzigen
    */
   
   public void veranderEigenaar(Eigenaar p_eigenaar)
   {
       eigenaar = p_eigenaar;
   }
   
   /**
    * toString() methode om het object te tonen op het scherm
    */
   
   public String toString()
   {
       return naam + " " + type + " " + eigenaar + " " + breedte + " " + lengte + " " + diepgang;
   }
}
