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
    private  Board instance ;
    private Pawn whitePawn;
    private Pawn blackPawn;
    private Pawn noPawn;
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
        instance = new Board();
        
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of addPawn method, of class Board.
     */
    @Test
    public void testAddPawn() {
     
       
       
        
    }

    @Test
    public void testBoardInit(){
        assertEquals(16, instance.getInitPieces());
    }
    
    @Test
    public void testInitBoard(){
        
         instance.initialize();
         String blankRank = "........\n";
         String sevenRank = "PPPPPPPP\n";
         String secondRank = "pppppppp\n";
         assertEquals(instance.printBoard(),blankRank+
                      sevenRank+
                      blankRank+
                      blankRank+
                      blankRank+
                      blankRank+
                      secondRank+
                      blankRank);
    }

}