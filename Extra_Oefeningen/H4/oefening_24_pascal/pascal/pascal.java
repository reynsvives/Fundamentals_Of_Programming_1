
/**
 * Write a description of class pascal here.
 *
 * @author (MyName)
 * @version (MyVersion)
 */
public class pascal
{
    int[][] driehoek;
   

    /**
     * Constructor maken
     */
    public pascal()
    {
        driehoek = new int[10][10]; //10 rijen en 10 kolommen
               
        //Invullen 1nen
        
        //Invullen 1 in rij 0, kolom 0
        
        driehoek[0][0]=1;
        
        for(int i = 1; i<10; i++)
        {
            driehoek[i][0] = 1; //Invullen 1 in de eerste kolom
            driehoek[i][i] = 1; //Invullen 1 in de laatste kolom van elke rij
        }
        
        //Berekenen driehoek pascal
        
        for(int i=2; i < 10; i++)
        {
            for(int j = 1; j < i; j++)
            {
                driehoek[i][j] = driehoek[i-1][j-1] + driehoek[i-1][j];
            }
        }
    }
    
    /**
     * methode showPascal() is een methode om de driehoek van Pascal te tonen
     */
    
    public void showPascal()
    {
        StringBuffer sb = new StringBuffer();
        
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j<= i; j++)
            {
               sb.append(driehoek[i][j] + " ");
            }
            
            sb.append("\n");
        }
        
        System.out.println(sb.toString());
    }
    
}
