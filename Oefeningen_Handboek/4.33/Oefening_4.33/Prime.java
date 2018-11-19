
/**
 * Write a description of class Prime here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Prime
{
    /**
     * Constructor for objects of class Prime
     */
    public Prime()
    {
    }

    /**
     * isPrime()
     */
    public void isPrime(int n)
    {
        int index = 2; //We starten met delen door 2, dan door 3, 4, etc.
        int rest = -1; //Rest op onmogelijk te behalen getal instellen
        while(index < n && rest != 0){
            
            rest = n % index;
            index++;
        }
        
        if(rest == 0){
        
            System.out.println(
                "Kleinste deler met rest = 0 voor getal " + 
                n + " is: " + (index - 1) //index - 1 omdat index al is verhoogd als we de lus doorlopen
                );
        }else{
            System.out.println(n + " is een priemgetal");
        }

    }
}
