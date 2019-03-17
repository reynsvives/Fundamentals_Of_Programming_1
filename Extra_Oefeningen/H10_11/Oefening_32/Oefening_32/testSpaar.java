

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class testSpaar.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class testSpaar
{
    private Spaarrekening spaarrek1;
    private Spaarrekening spaarrek2;

    /**
     * Default constructor for test class testSpaar
     */
    public testSpaar()
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
        spaarrek1 = new Spaarrekening("123", "Nikolaas");
        spaarrek1.stortGeld(1000);
        spaarrek1.berekenRente();
        spaarrek2 = new Spaarrekening("test", "test");
        spaarrek2.stortGeld(1000);
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
