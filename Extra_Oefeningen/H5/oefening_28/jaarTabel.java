
/**
 * Write a description of class jaarcijfers here.
 *
 * @author (MyName)
 * @version (MyVersion)
 */
public class jaarTabel
{
    // instance variables - replace the example below with your own
    private int[] aantalDagenPerMaand = {31,28,31,30,31,30,31,31,30,31,30,31};
    private int[][] jaarcijfers; 
    public int jaartal;
    

    /**
     * Constructor for objects of class jaarcijfers
     */
    public jaarTabel(int jaartal) //parameter jaartal
    {
        jaartal = this.jaartal;
        
        for(int i = 0; i < 12; i++)
        {
            int aantalDagen = aantalDagenPerMaand[i]; //Aantal dagen voor de maand ophalen 
            
            //Controle doen op schrikkeljaar
            
            if((jaartal % 4 == 0 && jaartal % 100 != 0) || (jaartal % 400 == 0))
            {
                //Logica indien het om een schrikkeljaar gaat
                if(i == 1) //Check of de maand februari is
                {
                    jaarcijfers[i] = new int[29];
                }
                else
                {
                    jaarcijfers[i] = new int[aantalDagen];
                }
            }
            else
            {
                //Logica als het geen schrikkeljaar betreft
                jaarcijfers[i] = new int[aantalDagen];
                
            }
        }
        
    }

    /**
     * addNummber() is een methode om een de waarde uit een cel in tabel jaarcijfers te verhogen met een getal
     */
    public void addNumber(int rowIndex, int colIndex, int number)
    {
        //Check geldige waarden (rowIndex mag lopen t.e.m. 11 en colIndex tot lengte van de rij - 1)
        
        if((rowIndex >= 0 && rowIndex < 12) && (colIndex >= 0 && colIndex < jaarcijfers[rowIndex].length - 1))
        {
            jaarcijfers[rowIndex][colIndex] = number;
        }
        
    }
    
    
    /**
     * showNumber() is een methode om de waarde van een cel in jaarcijfers op te vragen
     */
    
    public void showNumber(int rowIndex, int colIndex)
    {
                //Check geldige waarden (rowIndex mag lopen t.e.m. 11 en colIndex tot lengte van de rij - 1)
        
        if((rowIndex >= 0 && rowIndex < 12) && (colIndex >= 0 && colIndex < jaarcijfers[rowIndex].length - 1))
        {
            System.out.println("Jaarcijfer is: " + jaarcijfers[rowIndex][colIndex]);
        }
        else
        {   System.out.println("-1");
        }
    }
    
    /**
     * showMonthTotal() is een methode om de som van de maandcijfers weer te geven
     */
    
    public int showMonthTotal(int rowIndex)
    {
        if(rowIndex >= 0 && rowIndex < 12)
        {
            //Berekenen van maandtotaal
            
            int monthTotal = 0;
            
            for(int i = 0; i < jaarcijfers[rowIndex].length; i++)
            {
                monthTotal += jaarcijfers[rowIndex][i];
            }
            
            //return resultaat
            
            return monthTotal;
        }
        else
        {
           return -1;
        }
    }
    
    /**
     * showYearTotal() is een methode om het totaal voor een volledig jaar op te vragen
     */
    
    public int showYearTotal()
    {
        int yearTotal = 0;
        
        for(int i = 0; i < 12; i++)
        {
            for(int j = 0; j < jaarcijfers[i].length - 1; j++)
            {
                yearTotal += jaarcijfers[i][j];
            }
        }
        
        //Printen van het resultaat
        
        return yearTotal;
        
    }
    
    /**
     * avgMonth() is een methode om het gemiddelde jaarcijfer voor een maand op te vragen
     */
    
    public double avgMonth(int rowIndex)
    {
        if(rowIndex >= 0 && rowIndex < 12)
        {
            return (double) showMonthTotal(rowIndex) / jaarcijfers[rowIndex].length;
        }
        else
        return -1;
        
    }
    
    /**
     * avgYear() is een methode om het gemiddelde over het hele jaar op te vragen.
     * We dienen rekening te houden met schrikkeljaren. We moeten dus steeds het aantal dagen berekenen op basis van de tabel
     */
    
    public double avgYear()
    {
        int jaarTotaal = showYearTotal();
        int aantalDagenJaar;
        double avgJaar;
        
        //Check schrikkeljaar
        
        if((jaartal % 4 == 0 && jaartal % 100 != 0) || (jaartal % 400 == 0))
        {
            aantalDagenJaar = 366;
        }
        else
        {
            aantalDagenJaar = 365;
        }
        
        avgJaar = jaarTotaal / aantalDagenJaar;
        return avgJaar;
    }
    
    /**
     * methode toString() dat het jaartal en alle jaarcijfers teruggeeft
     */
    
    public String toString()
    {
        StringBuffer strCijfers = new StringBuffer();
        
        strCijfers.append(jaartal);
        
        for(int i=0; i<12; i++)
        {
            for(int j=0; j<jaarcijfers[i].length; j++)
            {
                strCijfers.append(" jaarcijfer: " + jaarcijfers[i][j] + " ");
            }
            
            strCijfers.append("\n");
        }
        
        return strCijfers.toString();
    }
    
    
}
