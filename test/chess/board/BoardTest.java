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
    private Board board;
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
        board = new Board();
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
         
        
        
         board.initialize();
       
         String blankRank = "........";
         String sevenRank = "PPPPPPPP";
         String secondRank = "pppppppp";
         assertEquals(instance.printBoard(),
                      blankRank+Board.NEW_LINE+
                      sevenRank+Board.NEW_LINE+
                      blankRank+Board.NEW_LINE+
                      blankRank+Board.NEW_LINE+
                      blankRank+Board.NEW_LINE+
                      blankRank+Board.NEW_LINE+
                      secondRank+Board.NEW_LINE+
                      blankRank);
    }
  @Test
  public void testNewLine(){
//      String exp = "A\nB";
//      System.out.println(exp);
//      String a= "a"+"\r\n"+"b";
//      System.out.println(a);
////      System.out.println("A\nB");
//      
//      assertEquals("A"+Board.NEW_LINE+"B","A"+"\n"+"B");
  }
}