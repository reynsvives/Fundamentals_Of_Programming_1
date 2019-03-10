
/**
 * Simuleren van een RDBMS
 *
 * @author (MyName)
 * @version (MyVersion)
 */

import java.util.HashMap;
import java.util.ArrayList;

public class Database
{
   private HashMap<String, ArrayList<String>> klantMap;
   private HashMap<String, ArrayList<String>> orderMap;
   
   /**
    * Constructor
    */
   
   public Database()
   {
       klantMap = new HashMap<>();
       orderMap = new HashMap<>();
   }
   
   /**
    * Methode om klant toe te voegen
    * @param klantNummer Het unieke klantennummer
    * @param naam De naam van de klant
    * @param adres Het adres van de klant
    * 
    */
   
   public void voegKlantToe(String klantNummer, String naam, String adres)
   {
       //Bereken klantennummer
       
       if(klantMap.containsKey(klantNummer))
       {
           System.out.println("Het opgegeven klantennummer bestaat al !");
       }
       else {
           
           //Toevoegen van de record aan de klantentabel
           
           ArrayList<String> klantenData = new ArrayList<>();
           klantenData.add(naam);
           klantenData.add(adres);
           
           //Toevoegen in de hashMap
           klantMap.put(klantNummer, klantenData);
       
       }

   }
   
   /**
    * Order toevoegen aan de tabel met orders.
    */
   
   public void voegOrderToe(String orderNummer,String omschrijving, String klantNummer)
   {
       if(orderMap.containsKey(orderNummer))
       {
           System.out.println("Het ordernummer bestaat al !");
       }
       else if(! klantMap.containsKey(klantNummer))
       {
           System.out.println("Het klantennummer is nog niet ingevoerd in de klantentabel");
           
       }
       else 
       {
           ArrayList<String> orderData = new ArrayList<>();
           orderData.add(omschrijving);
           orderData.add(klantNummer);
           
           //Toevoegen van de record aan de tabel met orders
           
           orderMap.put(orderNummer, orderData);
         
       }
       
   }
   
   /**
    * getKlant
    */
   
   public String getKlant(String key)
   {
       return klantMap.get(key).toString();
   }
   
   /**
    * printLijstOrders
    */
   
   public void printLijstOrders()
   {
       StringBuffer sb = new StringBuffer(); 
       
       for(String keyOrder : orderMap.keySet())
       {
           //Ophalen van de data uit orderMap
           
           ArrayList<String> orderItem = new ArrayList<>();
           orderItem = orderMap.get(keyOrder); //Geeft voor het bepaalde ordernummer een Arraylist met omschrijving en klantnummer
           
           String omschrijving = orderItem.get(0);
           String klantNummer = orderItem.get(1);
           
           //Opzoeken van klantennummer in de klantenTabel
           
           ArrayList<String> klantItem = new ArrayList<>();
           klantItem = klantMap.get(klantNummer);
           String naam = klantItem.get(0);
           String adres = klantItem.get(1);
           
           //String opbouwen
           sb.append(keyOrder);
           sb.append(" ");
           sb.append(omschrijving);
           sb.append(" ");
           sb.append(klantNummer);
           sb.append(" ");
           sb.append(naam);
           sb.append(" ");
           sb.append(adres);
           sb.append("\n");
           
           //Print
           
           System.out.println(sb);
       }
   }
   
   /**
    * schrapOrder 
    */
   
   public void schrapOrder(String orderNummer)
   {
       if(orderMap.containsKey(orderNummer))
       {
           orderMap.remove(orderNummer);
       }
       else 
       {
           System.out.println("Het opgegeven ordernummer bestaat niet !");
       }
   }
   
   /**
    * checkKlant zoekt of een klant order heeft in de order tabel
    */
   
   public boolean checkKlant(String klantNummer)
   {
     boolean myBool = false;
     
       for(String orderKey : orderMap.keySet())
       {
           String klant = orderMap.get(orderKey).get(1); //Geeft klantnummer terug
           
           if(klant.equals(klantNummer))
           {
             myBool = true;
           }
       }
       
     return myBool;
   }
   
  
   /**
     * SchrapKlant
   */

    public void schrapKlant(String klantNummer)
    {
        if(!klantMap.containsKey(klantNummer))
        {
            System.out.println("Het opgegeven klantnummer bestaat niet !");
        }
        else if (checkKlant(klantNummer)) //Check of klant bestaat in orders
        {
            for(String orderKey : orderMap.keySet())
            {
                //Check of het klantennummer voor een bepaald order gelijk is aan de te verwijderen klant.
                if(orderMap.get(orderKey).get(1).equals(klantNummer)) 
                {
                    schrapOrder(orderKey);
                }
            }
            
        }
    }
  
}


