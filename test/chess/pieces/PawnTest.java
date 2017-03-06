package chess.pieces;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author teyyub 4:56:17 PM
 */
public class PawnTest {

    private Pawn instance;

    public PawnTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        instance = new Pawn();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getColor method, of class Pawn.
     */
    @Test
    public void testGetColor() {

        instance = new Pawn("black");
        String expResult = "black";
        String result = instance.getColor();
        assertEquals(expResult, result);

    }

    @Test
    public void testPawnRepresentation() {
        instance = new Pawn("black","P");        
        assertEquals(instance.getRepresentation(), "P");
        
        instance = new Pawn("white", "p");
        assertEquals(instance.getRepresentation(), "p");
        
        
        
    }

}
