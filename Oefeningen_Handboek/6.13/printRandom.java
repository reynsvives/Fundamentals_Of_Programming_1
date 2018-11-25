
import java.util.Random;
public class printRandom{

     public static void main(String []args){
        Random r = new Random();
        int myVar;
        myVar = r.nextInt();
        System.out.println("Mijn random getal is: " + myVar);
     }
}