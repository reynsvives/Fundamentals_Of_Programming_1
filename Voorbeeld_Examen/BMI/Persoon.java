
/**
 * Write a description of class Persoon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.lang.StringBuffer;
public class Persoon
{
   private String naam;
   private int gewicht; //in kg
   private int lengte; //in cm
   
   /**
    * constructor
    */
   
   public Persoon(String p_naam, int p_gewicht, int p_lengte)
   {
       naam = p_naam;
       setGewicht(p_gewicht);
       setLengte(p_lengte);
       
   }
   
   /**
    * mutator voor gewicht
    */
   
   public void setGewicht(int p_gewicht)
   {
       if(p_gewicht >= 30 && p_gewicht <= 200)
       {
           gewicht = p_gewicht;
       }
       else 
       {
           System.out.println("Gewicht moet tussen 30 en 200 liggen");
       }
    
   }
   
   /**
    * Mutator voor lengte
    */
   
   public void setLengte(int p_lengte)
   {
       if(p_lengte >= 100 && p_lengte <= 220)
       {
           lengte = p_lengte;
       }
       else 
       {
           System.out.println("Geef een lengte in tussen 100 en 220");
       }
   }
   
   /**
    * getLengte in m
    */
   
   public double getLengte()
   {
       return lengte / 100.0;
   }
   
   /**
    * getGewicht
    */
   
   public int getGewicht()
   {
       return gewicht;
   }
   
   /**
    * getNaam()
    */
   
   public String getNaam()
   {
       return naam;
   }
   
   /**
    * getBMI
    */
   
   public double getBMI()
   {
       return getGewicht() / (getLengte() * getLengte());
      
   }
   
   /**
    * getBMICategorie
    */
   
   public String getBMICategorie()
   {
       if(getBMI() < 18.5)
       {
           return "ondergewicht";
       }
       else if(getBMI() > 18.5 && getBMI() < 25)
       {
           return "normaal";
       }
       else if(getBMI() >= 25 && getBMI() < 30)
       {
           return "overgewicht";
       }
       else
       {
           return "obesitas";
       }
   }
   
   /**
    * getInfo
    */
   
   public void getInfo()
   {
       StringBuffer sb = new StringBuffer();
       
       sb.append("Naam = " + getNaam() + "\n");
       sb.append("Gewicht = " + getGewicht() + " kilogram" + "\n");
       sb.append("Lengte = " + getLengte() + " centimeter" + "\n");
       sb.append("BMI = " + getBMI() + "\n");
       sb.append("Categorie = " + getBMICategorie());
       
       System.out.println(sb.toString());
       
   }
   
}
