

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class testDatabase.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class testDatabase
{
    private Database database1;

    

    /**
     * Default constructor for test class testDatabase
     */
    public testDatabase()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        database1 = new Database();
        database1.voegKlantToe("1", "Nikolas", "Test");
        database1.printLijstOrders();
        database1.checkKlant("1");
        database1.getKlant("1");
        database1.printLijstOrders();
        database1.voegOrderToe("45", "test", "45");
        database1.voegOrderToe("1", "bla", "1");
        database1.printLijstOrders();
        database1.voegKlantToe("456", "myKlant", "myAdres");
        database1.voegOrderToe("999", "mybla", "456");
        database1.printLijstOrders();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
