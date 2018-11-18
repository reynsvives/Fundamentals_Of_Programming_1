
/**
 * Extra oefeningen: 2
 *
 * @author MyName
 * @version MyVersion
 */

import java.util.Scanner;

public class Lengtes
{
    
    private int meters;
    private int centimeters;
    private int millimeters;
    
    /**
     * Constructor voor gegevens m, cm en mm
     */
    public Lengtes(int meters, int centimeters, int millimeters)
    {
        this.meters = meters;
        this.centimeters = centimeters;
        this.millimeters = millimeters;

    }
    
    //Constructor voor invoer in millimeters
    
    public Lengtes(int millimeters)
    {
        this.millimeters = millimeters % 10; //Geeft aantal millimeter weer
        this.centimeters = (millimeters % 1000 - millimeters % 10) / 10; //Aantal centimeters
        this.meters = millimeters / 1000;
        
    }
    
    //Constructor voor het geval niets wordt ingevoerd.
    
    public Lengtes()
    {
        meters = 0;
        centimeters = 0;
        millimeters = 0;
    
    
    }
   
    //Print lengte
    
    public void printLength()
    {
        System.out.println(
            "De lengte is: " 
            + meters + " m " 
            + centimeters + " cm "
            + millimeters + " mm ");
    }
    
    //Methode om te converteren naar mm
    
    public int convertToMm()
    {
        int mm = 1000 * meters + 10 * centimeters + millimeters;
        
        return(mm);
    }
    
    
    //Sommeren lengte
    
    public Lengtes addLengte(Lengtes lengte2)
    {
        int somLengte;
        
        somLengte = this.convertToMm() + lengte2.convertToMm();
        
        return new Lengtes(somLengte);
    }
    
    //Aftrekken van 2 lengtes
    
    public Lengtes subtractLengte(Lengtes lengte2)
    {
        int len1 = this.convertToMm(); 
        int len2 = lengte2.convertToMm();
        int result;
        
        if(len1 >= len2)
        {
            result = len1 - len2; 
        }
        else
        {
            result = len2 - len1;
        
        }   
        
        return new Lengtes(result);

    }
    
    //vermenigvuldigen
    
    public Lengtes multiply(int factor)
    {
        int result;
        
        result = this.convertToMm() * factor;
        
        return new Lengtes(result);
    }
    
    //Vergelijken
    
    public void compareLengte(Lengtes l)
    {
        int result;
        int l1; //Huidige lengte
        int l2; //Lengte in de parameter 
        
        l1 = this.convertToMm();
        l2 = l.convertToMm();
        
        if(l1 > l2)
        {
            System.out.println("+1");
        }
        else
            if(l1<l2)
            {
                System.out.println("-1");
            }
            else{System.out.println("0");}
    }
}
