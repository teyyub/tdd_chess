package chess.board;

import chess.pieces.Pawn;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import utils.StringUtil.StringUtil;

/**
 *
 * @author teyyub 4:56:45 PM
 */
public class BoardTest {

    private Board instance;
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
    public void testBoardInit() {
        assertEquals(16, instance.getInitPieces());
    }

    @Test
    public void testBoardPrint() {
        instance.initialize();
        System.out.println(instance.printBoard());
    }

    
    public void testInitBoard() {

        board.initialize();

        String blankRank = "........";
        String sevenRank = "PPPPPPPP";
        String secondRank = "pppppppp";
        assertEquals(StringUtil.appendNewLine("RNBQKBNR")
                + StringUtil.appendNewLine("PPPPPPPP")
                + StringUtil.appendNewLine(blankRank)
                + StringUtil.appendNewLine(blankRank)
                + StringUtil.appendNewLine(blankRank)
                + StringUtil.appendNewLine(blankRank)
                + StringUtil.appendNewLine(secondRank)
                +StringUtil.appendNewLine("rnbqkbnr")
                + blankRank, instance.printBoard());
    }

  
}
