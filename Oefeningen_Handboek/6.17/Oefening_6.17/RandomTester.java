/**
    *Print random numbers
*/


import java.util.Random;

public class RandomTester
{
    private Random randomGenerator;
    
    //create constructor
    
    public RandomTester()
    {
        //Create random number generator
        randomGenerator = new Random();
    }



    //Method for print one random number

    public void printOneRandom()
    {
        
        int myVar = randomGenerator.nextInt();
        System.out.println("Single random number is: " + myVar);
    }

    //Method for printing multiple random numbers

    public void printMultipleRandom(int numberOfRandom)
    {

        int index = 0;
        int myVar;

        while(index < numberOfRandom)
        {
            myVar = randomGenerator.nextInt();
            System.out.println(
            "Multiple random number at index " 
            + index + " : " + myVar);
            index = index + 1;
        }
    }//end method printMultipleRandom
    
    public void getResponse()
    {
        int myVar;
        myVar = randomGenerator.nextInt(3); //0, 1 en 2
        
        switch (myVar)
        {
            case 0: System.out.println("Random number is " + myVar + " Answer = ja");
            break;
            case 1: System.out.println("Random number is " + myVar + " Answer = nee");
            break;         
            case 2: System.out.println("Random number is " + myVar + " Answer = misschien");
            break;  
        }
        
        
    }
}