package com.tdd.model;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author teyyub
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
     * Test of createWhitePawn method, of class Piece.
     */
    @Test
    public void testCreateWhitePawn() {        
        piece = Piece.createPiece(Piece.Colors.WHITE, Piece.Type.PAWN);
//        assertTrue(piece.isWhite());
        assertEquals(Piece.class,piece.getRepresentation());
        System.out.println(piece.getColor() + " " + piece.getRepresentation()+ " created");
    }

    @Test
    public void testCreateBlackPawn() {        
        piece = Piece.createPiece(Piece.Colors.BLACK, Piece.Type.PAWN);
        assertTrue(piece.isBlack());
        assertEquals(piece.getRepresentation(), Piece.PAWN.toUpperCase());
        System.out.println(piece.getColor() + " " + piece.getRepresentation() + " created");
    }
     @Test
    public void testCreateWhiteRook() {        
        piece = Piece.createPiece(Piece.Colors.WHITE, Piece.Type.ROOK);
        assertTrue(piece.isWhite());
        assertEquals(piece.getRepresentation(), Piece.ROOK);
        System.out.println(piece.getColor()+" "+piece.getRepresentation()+" created");
    }  
      @Test
    public void testCreateBlackRook() {
        piece = Piece.createPiece(Piece.Colors.BLACK, Piece.Type.ROOK);
        assertTrue(piece.isBlack());
        assertEquals(piece.getRepresentation(), Piece.ROOK.toUpperCase());
        System.out.println(piece.getColor()+" "+piece.getRepresentation()+" created");
    } 
      @Test
    public void testCreateWhiteKnight() {        
        piece = Piece.createPiece(Piece.Colors.WHITE, Piece.Type.KNIGHT);
        assertTrue(piece.isWhite());
        assertEquals(piece.getRepresentation(), Piece.KNIGHT);
        System.out.println(piece.getColor()+" "+piece.getRepresentation()+" created");
    } 
      @Test
    public void testCreateBlackKnight() {        
        piece = Piece.createPiece(Piece.Colors.BLACK, Piece.Type.KNIGHT);
        assertTrue(piece.isBlack());
        assertEquals(piece.getRepresentation(), Piece.KNIGHT.toUpperCase());
        System.out.println(piece.getColor()+" "+piece.getRepresentation()+" created");
    } 
      @Test
    public void testCreateWhiteBishop() {        
        piece = Piece.createPiece(Piece.Colors.WHITE, Piece.Type.BISHOP);
        assertTrue(piece.isWhite());
        assertEquals(piece.getRepresentation(), Piece.BISHOP);
        System.out.println(piece.getColor()+" "+piece.getRepresentation()+" created");
    } 
      @Test
    public void testCreateBlackBishop() {        
        piece = Piece.createPiece(Piece.Colors.BLACK, Piece.Type.BISHOP);
        assertTrue(piece.isBlack());
        assertEquals(piece.getRepresentation(), Piece.BISHOP.toUpperCase());
        System.out.println(piece.getColor()+" "+piece.getRepresentation()+" created");
    } 
      @Test
    public void testCreateWhiteQueen() {        
        piece = Piece.createPiece(Piece.Colors.WHITE, Piece.Type.QUEEN);
        assertTrue(piece.isWhite());
        assertEquals(piece.getRepresentation(), Piece.QUEEN);
        System.out.println(piece.getColor()+" "+piece.getRepresentation()+" created");
    } 
       @Test
    public void testCreateBlackQueen() {        
        piece = Piece.createPiece(Piece.Colors.BLACK, Piece.Type.QUEEN);
        assertTrue(piece.isBlack());
        assertEquals(piece.getRepresentation(), Piece.QUEEN.toUpperCase());
        System.out.println(piece.getColor()+" "+piece.getRepresentation()+" created");
    }
       @Test
    public void testCreateWhiteKing() {        
        piece = Piece.createPiece(Piece.Colors.WHITE, Piece.Type.KING);
        assertTrue(piece.isWhite());
        assertEquals(piece.getRepresentation(), Piece.KING);
        System.out.println(piece.getColor()+" "+piece.getRepresentation()+" created");
    }
       @Test
    public void testCreateBlackKing() {        
        piece = Piece.createPiece(Piece.Colors.BLACK, Piece.Type.KING);
        assertTrue(piece.isBlack());
        assertEquals(piece.getRepresentation(), Piece.KING.toUpperCase());
        System.out.println(piece.getColor()+" "+piece.getRepresentation()+" created");
    }
}
