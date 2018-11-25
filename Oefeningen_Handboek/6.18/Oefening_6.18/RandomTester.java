/**
    *Print random numbers
*/


import java.util.Random;
import java.util.ArrayList;

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
        
        ArrayList<String> myArrayList = new ArrayList<>();
        myArrayList.add("ja");
        myArrayList.add("nee");
        myArrayList.add("misschien");
        
        System.out.println("Random number is " + myVar + " Answer is: " + myArrayList.get(myVar));
    }
}