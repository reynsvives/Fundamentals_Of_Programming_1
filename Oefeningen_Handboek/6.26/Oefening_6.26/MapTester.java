
/**
 * Write a description of class MapTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.HashMap;
public class MapTester
{
    // instance variables - replace the example below with your own
    private HashMap<String, String> myHashMap; 

    /**
     * Constructor for objects of class MapTester
     */
    public MapTester()
    {
        myHashMap = new HashMap();
    }

    /**
     * Method enterNumber
     */
    public void enterNumber(String name, String number)
    {
        myHashMap.put(name, number);
    }
    
    /**
     * Method enterNumber
     */
    public String lookupNumber(String name)
    {
        return myHashMap.get(name);
    }
    
    /**
     * Print keyset
    */

    public void printKeySet()
    {
        System.out.println(myHashMap.keySet());
    }
    
    /**
     * checkKey checks if key is already present in the hashMap
     */

    public boolean checkKey(String Key)
    {
        return myHashMap.containsKey(Key);
    }
}

