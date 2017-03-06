package chess.pieces;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author teyyub 7:37:29 PM
 */
public class PieceTest {
    private  Piece piece ;
    public PieceTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        piece = new  Piece();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getColor method, of class Piece.
     */
    @Test
    public void testPiece() {
       Piece whitePiece =  Piece.createWhitePawn("white", "p");
        assertTrue("white", piece.isWhitePiece(whitePiece));
        
    }
}
