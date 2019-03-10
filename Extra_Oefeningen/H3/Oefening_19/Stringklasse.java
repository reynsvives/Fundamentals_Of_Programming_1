
/**
 * Write a description of class Stringklasse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Stringklasse
{
    // instance variables - replace the example below with your own
    private String myString;

    /**
     * Constructor for objects of class Stringklasse
     */
    public Stringklasse(String s)
    {
        // Initialiseren
        
        myString = s;
        
    }

    /**
     * isPalindroom()
     */
    public boolean isPalindroom()
    {
        boolean isPalindroom = true;
        int nchar = myString.length(); //aantal karakters
        int i = 0; //loopvariabele
        //Zolang we de string niet ten einde zijn en de karakters voor en achter gelijk zijn, vergelijken we verder
        
        while(i < nchar && (myString.charAt(i) == myString.charAt(nchar - i - 1)))
        {
            i += 1;
        }
        
        //Als de while loop wordt afgebroken voor het einde, dan wil dat zeggen dat er minstens 1 karakter niet over een komt
        
        if(i < nchar)
        {
            isPalindroom = false;
        }
        
        return isPalindroom;
    }
    
    /**
     * isBinair()
     */
    
    public boolean isBinair()
    {
        boolean isBinair = true;
        int i = 0;
        int nchar = myString.length();
        
        while(i < nchar && ((myString.charAt(i) == '0' || myString.charAt(i) == '1')))
        {
            i += 1;
        }
        
        if(i < nchar)
        {
            isBinair = false;
        }
        
        return isBinair;
    }
    
    /**
     * binToDec() converteert binaire string naar een decimaal getal
     */
    
    public int binToDec()
    {
        int som = 0;
        
        if(isBinair())
        {
            
            for(int i = 0; i < myString.length(); i++)
            {
                som = som + (int) myString.charAt(myString.length() - 1 - i) * (int) Math.pow(2, i);
                
                System.out.println(som);
                
            }
            
            return som;

        }
        
        return som;
    }
}
