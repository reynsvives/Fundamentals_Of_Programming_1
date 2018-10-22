
/**
 * Klasse om powerpointdata bij te houden.
 *
 * @author MyName
 * @version MyVersion
 */
public class Powerpoint
{
    private int grootte;
    private String naam;
    private int aantalSlides;
    
    //Constructor met naam als formele parameters
    
    public Powerpoint(String naam){
    
        grootte = 2;
        this.naam = naam;
        aantalSlides = 1;
    }
    
    //Naam opvragen
    
    public void getName()
    {
        System.out.println("De naam van de presentatie is: " + naam);
    }
    
    //Grootte opvragen
    
    public void getSize()
    {
        System.out.println("De grootte vande presentatie is: " + grootte);
    }
    
    //Aantal slides opvragen
    
    public void getSlides()
    {
        System.out.println("Het aantal slides is: " + aantalSlides);
    }
    
    //Slide toevoegen
    
    public void addSlide(int size)
    {
        grootte = grootte + size;
        aantalSlides = aantalSlides + 1;
    }
}
