
/**
 * Write a description of class Sum here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sum
{
    public Sum(){
    }
    
    
    public void sum(int a, int b){
    
        int currentNumber = a;
        int sum = 0;
        while(currentNumber <= b){
        
            sum = sum + currentNumber;
            currentNumber = currentNumber + 1;
        }
        
        //Print sum als a <= b
        
        if(a <= b){
            System.out.println("Som is: " + sum);
        }
        else{
            System.out.println("a moet kleiner zijn dan b !");
        }
    }
}
