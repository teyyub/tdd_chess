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

    private Piece piece;

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
        piece = new Piece();
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getColor method, of class Piece.
     */
    @Test
    public void testPiece() {
//        Piece whitePiece = Piece.createWhitePawn();
//        assertTrue("white", piece.isWhitePiece(whitePiece));

    }

    @Test
    public void testBlankPiece() {
        Piece blank = Piece.noPiece();
        assertEquals('.', blank.getRepresentation());
        assertEquals(Piece.Type.NO_PIECE, blank.getType());
    }

    @Test
    public void testCreatePawn() {
        Piece piece = Piece.createWhitePawn();
        assertEquals(piece.getType(),Piece.Type.PAWN);
        assertEquals(piece.getRepresentation(), Piece.PAWN_REPRESENTATION);

        assertEquals(Piece.createBlackPawn().getType(),Piece.Type.PAWN);
        assertEquals(Piece.createBlackPawn().getRepresentation(),Character.toUpperCase(Piece.PAWN_REPRESENTATION));       
    }

    @Test
    public void testCreate() {
        verifyCreation(Piece.createWhitePawn(), Piece.createBlackPawn(),
                Piece.Type.PAWN, Piece.PAWN_REPRESENTATION);
        verifyCreation(
                Piece.createWhiteRook(), Piece.createBlackRook(),
                Piece.Type.ROOK, Piece.ROOK_REPRESENTATION);
        verifyCreation(
                Piece.createWhiteKnight(), Piece.createBlackKnight(),
                Piece.Type.KNIGHT, Piece.KNIGHT_REPRESENTATION);
        verifyCreation(
                Piece.createWhiteBishop(), Piece.createBlackBishop(),
                Piece.Type.BISHOP, Piece.BISHOP_REPRESENTATION);
        verifyCreation(Piece.createWhiteQueen(), Piece.createBlackQueen(),
                Piece.Type.QUEEN, Piece.QUEEN_REPRESENTATION);
        verifyCreation(Piece.createWhiteKing(), Piece.createBlackKing(),
                Piece.Type.KING, Piece.KING_REPRESENTATION);
        Piece blank = Piece.noPiece();
        assertEquals('.', blank.getRepresentation());
        assertEquals(Piece.Type.NO_PIECE, blank.getType());
    }

    private void verifyCreation(Piece whitePiece, Piece blackPiece,
            Piece.Type type, char representation) {
        assertTrue(whitePiece.isWhite());
        assertEquals(type, whitePiece.getType());
        assertEquals(representation, whitePiece.getRepresentation());
        assertTrue(blackPiece.isBlack());
        assertEquals(type, blackPiece.getType());
        assertEquals(Character.toUpperCase(representation),
                blackPiece.getRepresentation());
    }
}
