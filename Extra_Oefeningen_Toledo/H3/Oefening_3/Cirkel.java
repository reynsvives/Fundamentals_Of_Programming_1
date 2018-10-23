
/**
 * Oefening 3: cirkel   
 */

//Importeer math library om "pi" op te halen
import java.lang.Math.*;

public class Cirkel
{

    
    
    //Variabelen declareren
    private double straal;
    
    //Constructor
    public Cirkel(double straal)
    {
    
        this.straal = straal;
         
    }
    
    //getStraal methode
    
    public void getStraal()
    {
    
        System.out.println("De straal is: " + straal);
    
    }
    
    //setStraal methode
    
    public void setStraal(double newStraal)
    {
    
        straal = newStraal;
    
    }
    
    //getPerimeter 
    
    public void getPerimeter()
    {
        
        double perimeter;
        perimeter = 2 * straal * Math.PI;
        System.out.println("De omtrek is: " + perimeter);
    }
    
    
    //getArea
    
    public void getArea()
    {
        double area;
        area = straal * straal * Math.PI;
        System.out.println("De oppervlakte is: " + area);
        
    }
}
