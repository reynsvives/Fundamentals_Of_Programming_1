
/**
 * Write a description of class geboorteCijfer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class geboorteCijfer
{
    private jaarTabel mTabel;
    private jaarTabel jTabel;
    

    /**
     * Constructor for objects of class geboorteCijfer
     */
    public geboorteCijfer(int jaartal)
    {
       mTabel = new jaarTabel(jaartal);
       jTabel = new jaarTabel(jaartal);
    }

    /**
     * Jaartal geboortecijfers ophalen
     */
    public int getYear()
    {
        return mTabel.jaartal;
    }
    
    /**
     * insertNumberGirl() om geboortecijfers meisjes in te geven
     */
    
    public void insertNumberGirl(int monthIndex, int dayIndex, int value)
    {
        mTabel.addNumber(monthIndex, dayIndex, value);
    }
    
    /**
     * insertNumberBoy() om geboortecijfers jongens in te geven
     */
    
    public void insertNumberBoy(int monthIndex, int dayIndex, int value)
    {
        jTabel.addNumber(monthIndex, dayIndex, value);
    }
    
    /**
     * Verhouding geboortecijfers per maand bepalen
     */
    
    public double fractionBoyGirlMonth(int monthIndex)
    {
        return (double) (mTabel.showMonthTotal(monthIndex) / jTabel.showMonthTotal(monthIndex));
    }
    
    /**
     * Verhouding geboortecijfers per jaar bepalen
     */
    
    public double fractionBoyGirlYear()
    {
        return (double) mTabel.showYearTotal() / jTabel.showYearTotal();
    }
    
}
