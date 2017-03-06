package chess.board;

import chess.pieces.Pawn;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author teyyub 4:56:45 PM
 */
public class BoardTest {

    public BoardTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of addPawn method, of class Board.
     */
    @Test
    public void testAddPawn() {
     
        Pawn pawn = new Pawn("white");
        Board instance = new Board();
        instance.addPawn(pawn);
//        instance.addPawn(new Integer("7"));
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(1,instance.getPawnCount());
    }

    /**
     * Test of getPieces method, of class Board.
     */
    

}