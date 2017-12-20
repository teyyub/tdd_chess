package com.tdd.model;

import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author teyyub
 */
public class BoardTest {

    Board instance;

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
        instance.emptyBoard();
    }

    @After
    public void tearDown() {
    }

//    @Test
//    public void testPrintBoard() {
//        instance.init();
//        instance.printBoard();
//    }
//
//    @Test
//    public void testGetPieceLocation() {
//        instance.init();
//        assertEquals("r", instance.getPieceLocation("a1"));
//        assertEquals("n", instance.getPieceLocation("b1"));
//        assertEquals("b", instance.getPieceLocation("c1"));
//        assertEquals("q", instance.getPieceLocation("d1"));
//        assertEquals("k", instance.getPieceLocation("e1"));
//        assertEquals("b", instance.getPieceLocation("f1"));
//        assertEquals("n", instance.getPieceLocation("g1"));
//        assertEquals("r", instance.getPieceLocation("h1"));
//        assertEquals("R", instance.getPieceLocation("a8"));
//        assertEquals("N", instance.getPieceLocation("b8"));
//        assertEquals(".", instance.getPieceLocation("a3"));
//        assertEquals(".", instance.getPieceLocation("e6"));
//    }
//
//    @Test
//    public void testClearBoard() throws IOException {
//        instance.init();
//        instance.printBoard();
//        instance.emptyBoard();
//        System.out.println("");
//        System.out.println("Empty Board");
//        instance.printBoard();
//
//    }

    @Test
    public void testAddPieceToBoard() throws IOException {
        String loc1 = "a1";
        String loc2 = "h7";
        String loc3 = "g9";        
//        instance.addPieceToBoard(loc1, Piece.createBlackPawn(Colors.BLACK, Type.PAWN));
//        instance.addPieceToBoard(loc2, Piece.createPiece(Colors.BLACK, Type.KING));
//        instance.addPieceToBoard(loc3, Piece.createPiece(Colors.BLACK, Type.Queen));
//        instance.addPieceToBoard(loc1, Piece.createPiece(Colors.BLACK, Type.Queen));
//        instance.addPieceToBoard(loc1, Piece.createPiece(Colors.BLACK, Type.Pawn));
    }

    @Test
    public void testIsLocationEmpty() {
//        instance.emptyBoard();
//        assertTrue(instance.isBoardLocationEmpty("a1"));
//        instance.addPieceToBoard("a1", Piece.createPiece(Piece.Colors.BLACK, Piece.Type.Pawn));
//        assertFalse(instance.isBoardLocationEmpty("a1"));
//        instance.printBoard();
    }

    @Test
    public void testStrength() {
//        instance.emptyBoard();
//        instance.addPieceToBoard("a1", Piece.createPiece(Piece.Colors.WHITE, Piece.Type.Pawn));
//        instance.addPieceToBoard("a2", Piece.createPiece(Piece.Colors.BLACK, Piece.Type.Pawn));
//        instance.addPieceToBoard("h8", Piece.createPiece(Piece.Colors.BLACK, Piece.Type.Queen));
//        instance.addPieceToBoard("h7", Piece.createPiece(Piece.Colors.BLACK, Piece.Type.Queen));
//        instance.addPieceToBoard("h3", Piece.createPiece(Piece.Colors.BLACK, Piece.Type.Rook));
//        assertEquals(1, instance.calculateWhiteStrength());
//        assertEquals(24, instance.calculateBlackStrength());
    }

    @Test
    public void testPieceValue() {
//        instance.addPieceToBoard("a1", Piece.createPiece(Piece.Colors.WHITE, Piece.Type.Pawn));
//        assertEquals(1, instance.pieceValue(Piece.createPiece(Piece.Colors.BLACK, Piece.Type.Pawn)));
//        assertEquals(1, instance.pieceValue(Piece.createPiece(Piece.Colors.WHITE, Piece.Type.Pawn)));
//        assertEquals(1, instance.pieceValue(Piece.createPiece(Piece.Colors.WHITE, Piece.Type.Pawn)));
    }

    @Test
    public void testMove() {
//        instance.init();
//        instance.move("e2", "e4", Piece.createPiece(Piece.Colors.WHITE, Piece.Type.Pawn));
//        instance.move("e7", "e5", Piece.createPiece(Piece.Colors.BLACK, Piece.Type.Pawn));
//        instance.move("f2", "f4", Piece.createPiece(Piece.Colors.WHITE, Piece.Type.Pawn));
//        instance.move("d7", "d5", Piece.createPiece(Piece.Colors.BLACK, Piece.Type.Pawn));
//        instance.move("e5", "e6", Piece.createPiece(Piece.Colors.WHITE, Piece.Type.Pawn));

    }

    @Test
    public void testKingMove() {
//        instance.printBoard();
//        instance.addPieceToBoard("a8", Piece.createPiece(Piece.Colors.BLACK, Piece.Type.Pawn));
//        instance.printBoard();
//        instance.move("a8", "a5", Piece.createPiece(Piece.Colors.BLACK, Piece.Type.King));
////        instance.move("a7", "a5", Piece.createPiece(Piece.Colors.BLACK, Piece.Type.King));
//        instance.printBoard();
//        instance.KingCanMove("a5");
    }

    @Test
    public void testAllPiecesLocation() {
//        instance.init();
//        instance.allPieceLocation();
    }

    @Test
    public void testPieceLocation() {
//        instance.init();
//        instance.printBoard();
//        Piece p = Piece.createPiece(Piece.Colors.BLACK, Piece.Type.Rook);
//       System.out.println(instance.getPiecesLocation().get(p));
//     assertEquals("a8",instance.getPiecesLocation().get()));
    }

//    @Test
//    public void testValidLocation() {
//        instance.emptyBoard();
//        String location = "a5";
//        System.out.println(instance.getRow(location));
//        System.out.println(instance.isValidBoardLocation(location));
//        assertTrue(instance.isValidBoardLocation(location));
//    }
//
//    @Test
//    public void testRow() {
//        instance.emptyBoard();
//        System.out.println(instance.getRow("z4"));
//    }
//    @Test
//    public void testCol(){
//         assertEquals(0, instance.getCol("a1"));
//         assertEquals(1, instance.getCol("b1"));
//         assertEquals(7, instance.getCol("h1"));
//         
//         assertEquals(0, instance.getCol("a5"));
//         assertEquals(0, instance.getCol("a8"));
//         assertEquals(7, instance.getCol("h8"));
//         
//         assertEquals(4, instance.getCol("e4"));
//    }
}
