package com.tdd.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author teyyub Mar 25, 2016 4:46:10 PM
 */
public class Board {

//    private final static String WHITE_PAWN_REPRESENTATION = "p";
//    private final static String BLACK_PAWN_REPRESENTATION = "P";

//    private int pieces = 0;
    private static final byte BOARD_SIZE = 8;
//    private String square[][] = new String[8][8];
    private final Piece board[][] = new Piece[BOARD_SIZE][BOARD_SIZE];
    private Map<String, Integer> fileValue = null;
    private Map<Integer, String> rankValue = null;
    private static final Map<Integer, String> ranksValue=null;
    
    private final List<String> kingPassibleMoves = null;
    private Map<Piece, String> piecesLocation = null;
    private final Map<String, Piece> piecesLocationInverse = null;

    public Board() {
       
    }

    public void init() {
        board[0][0] = Piece.createPiece(Piece.Colors.BLACK, Piece.Type.ROOK);
        board[0][1] = Piece.createPiece(Piece.Colors.BLACK, Piece.Type.KNIGHT);
        board[0][2] = Piece.createPiece(Piece.Colors.BLACK, Piece.Type.BISHOP);
        board[0][3] = Piece.createPiece(Piece.Colors.BLACK, Piece.Type.QUEEN);
        board[0][4] = Piece.createPiece(Piece.Colors.BLACK, Piece.Type.KING);
        board[0][5] = Piece.createPiece(Piece.Colors.BLACK, Piece.Type.BISHOP);
        board[0][6] = Piece.createPiece(Piece.Colors.BLACK, Piece.Type.KNIGHT);
        board[0][7] = Piece.createPiece(Piece.Colors.BLACK, Piece.Type.ROOK);

        board[1][0] = Piece.createPiece(Piece.Colors.BLACK, Piece.Type.PAWN);
        board[1][1] = Piece.createPiece(Piece.Colors.BLACK, Piece.Type.PAWN);
        board[1][2] = Piece.createPiece(Piece.Colors.BLACK, Piece.Type.PAWN);
        board[1][3] = Piece.createPiece(Piece.Colors.BLACK, Piece.Type.PAWN);
        board[1][4] = Piece.createPiece(Piece.Colors.BLACK, Piece.Type.PAWN);
        board[1][5] = Piece.createPiece(Piece.Colors.BLACK, Piece.Type.PAWN);
        board[1][6] = Piece.createPiece(Piece.Colors.BLACK, Piece.Type.PAWN);
        board[1][7] = Piece.createPiece(Piece.Colors.BLACK, Piece.Type.PAWN);
        for (int i = 2; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = Piece.createPiece(Piece.Colors.NullColor, Piece.Type.NOPIECE);
            }
        }
        board[6][0] = Piece.createPiece(Piece.Colors.WHITE, Piece.Type.PAWN);
        board[6][1] = Piece.createPiece(Piece.Colors.WHITE, Piece.Type.PAWN);
        board[6][2] = Piece.createPiece(Piece.Colors.WHITE, Piece.Type.PAWN);
        board[6][3] = Piece.createPiece(Piece.Colors.WHITE, Piece.Type.PAWN);
        board[6][4] = Piece.createPiece(Piece.Colors.WHITE, Piece.Type.PAWN);
        board[6][5] = Piece.createPiece(Piece.Colors.WHITE, Piece.Type.PAWN);
        board[6][6] = Piece.createPiece(Piece.Colors.WHITE, Piece.Type.PAWN);
        board[6][7] = Piece.createPiece(Piece.Colors.WHITE, Piece.Type.PAWN);

        board[7][0] = Piece.createPiece(Piece.Colors.WHITE, Piece.Type.ROOK);
        board[7][1] = Piece.createPiece(Piece.Colors.WHITE, Piece.Type.KNIGHT);
        board[7][2] = Piece.createPiece(Piece.Colors.WHITE, Piece.Type.BISHOP);
        board[7][3] = Piece.createPiece(Piece.Colors.WHITE, Piece.Type.QUEEN);
        board[7][4] = Piece.createPiece(Piece.Colors.WHITE, Piece.Type.KING);
        board[7][5] = Piece.createPiece(Piece.Colors.WHITE, Piece.Type.BISHOP);
        board[7][6] = Piece.createPiece(Piece.Colors.WHITE, Piece.Type.KNIGHT);
        board[7][7] = Piece.createPiece(Piece.Colors.WHITE, Piece.Type.ROOK);

    }

    public void emptyBoard() {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = Piece.createPiece(Piece.Colors.NullColor, Piece.Type.NOPIECE);
            }
        }
    }

    public String getPieceLocation(String location) {
        return board[getRow(location)][getCol(location)].getRepresentation();
    }

    public int countWhite() {
        int sum = 0;
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (board[i][j].isWhite()) {
                    sum++;
                }
            }
        }
        return sum;
    }

    public int countBlack() {
        int sum = 0;
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (board[i][j].isBlack()) {
                    sum++;
                }
            }
        }
        return sum;
    }

    public int calculateWhiteStrength() {
        int sum = 0;
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (board[i][j].isWhite()) {
                    sum += pieceValue(board[i][j]);
                }
            }
        }
        return sum;
    }

    public int pieceValue(Piece p) {
        if ((p.getRepresentation().equals("q")) || (p.getRepresentation().equals("Q"))) {
            return 9;
        }
        if ((p.getRepresentation().equals("r")) || (p.getRepresentation().equals("R"))) {
            return 5;
        }
        if ((p.getRepresentation().equals("n")) || (p.getRepresentation().equals("n"))) {
            return 3;
        }
        if ((p.getRepresentation().equals("b")) || (p.getRepresentation().equals("B"))) {
            return 3;
        }
        if ((p.getRepresentation().equals("p")) || (p.getRepresentation().equals("P"))) {
            return 1;
        }
        return 0;
    }

    public int calculateBlackStrength() {
        int sum = 0;
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                if (board[i][j].isBlack()) {
                    sum += pieceValue(board[i][j]);
                }
            }
        }
        return sum;
    }

    public boolean isValidBoardLocation(String location){         
      return (BOARD_SIZE>getRow(location)  && (getRow(location)>=0)) ;
    }
    
    public boolean isValidMove(String startLoc, String endLoc, Piece piece){
        
     return true;
    }
    
    public boolean isBoardLocationEmpty(String location) {        
        return board[getRow(location)][getCol(location)].getRepresentation().equals(".");
    }
    
    public void addPieceToBoard(String location, Piece piece) {  
        if(isValidBoardLocation(location)){  
          if(getPieceLocation(location) == null ? piece.getRepresentation() != null : !getPieceLocation(location).equals(piece.getRepresentation())){   
            board[getRow(location)][getCol(location)] =piece ;
          }
        }
         printBoard();
    }

    public int getRow(String location){
        return BOARD_SIZE - getRank(location);
    }
    public int getCol(String location){
        return getFileValue().get(getFile(location))-1;
    }
    
    public boolean isValidRow(String location){
       return getRank(location)<8;
    }
    
    public boolean isValidCol(String location){
     return getCol(location)<8;
    }
    public void removePieceFromBoard(String location, Piece piece) {
         board[getRow(location)][getCol(location)] = piece;
    }

    private void clear() {
        for (int i = 0; i < 50; i++) {
            System.out.println("");
        }
    }

    public void printBoard() {
        clear();
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print(board[i][j].getRepresentation());
            }
            System.out.println();
        }
    }

    public boolean isWhite() {
        return true;
    }

    public boolean isBlack() {
        return true;
    }

    public Map<String, Integer> getFileValue() {
        if (fileValue == null) {
            loadFileValue();
        }
        return fileValue;
    }

    void loadFileValue() {
        fileValue = new HashMap<String, Integer>();
        fileValue.put("a", 1);
        fileValue.put("b", 2);
        fileValue.put("c", 3);
        fileValue.put("d", 4);
        fileValue.put("e", 5);
        fileValue.put("f", 6);
        fileValue.put("g", 7);
        fileValue.put("h", 8);
    }

    public Map<Integer, String> getRankValue() {
        if (rankValue == null) {
            loadRankValue();
        }
        return rankValue;
    }

    void loadRankValue() {
        rankValue = new HashMap<Integer, String>();
        rankValue.put(1, "a");
        rankValue.put(2, "b");
        rankValue.put(3, "c");
        rankValue.put(4, "d");
        rankValue.put(5, "e");
        rankValue.put(6, "f");
        rankValue.put(7, "g");
        rankValue.put(8, "h");
    }

    
    
    public Map<Piece, String> getPiecesLocation() {
        if(piecesLocation==null){
         loadPiecesLocation();
        }
        return piecesLocation;
    }

    void loadPiecesLocation() {
        piecesLocation = new HashMap<Piece, String>();
        for (int col = 0; col < BOARD_SIZE; col++) {
            for (int row = 0; row < BOARD_SIZE; row++) {               
                piecesLocation.put(board[col][row], getRankValue().get(row+1)+(BOARD_SIZE-row));                
            }
             
        }
        
    }

    public void move(String startLoc, String endLoc, Piece piece) {
         if (!isBoardLocationEmpty(startLoc)) {
            board[getRow(startLoc)][getCol(startLoc)] = Piece.createPiece(Piece.Colors.NullColor, Piece.Type.NOPIECE);
            board[getRow(endLoc)][getCol(startLoc)] = piece;
        }
        printBoard();
    }

    public void KingCanMove(String location) {
    
 
    }

    private String getFile(String location) {
        return Character.toString(location.charAt(0));
    }

    private int getRank(String location) {
        return Integer.parseInt(Character.toString(location.charAt(1)));
    }

    public void allPieceLocation() {
        for (int col = 0; col < BOARD_SIZE; col++) {
            for (int row = 0; row < BOARD_SIZE; row++) {
                System.out.print(board[col][row].getRepresentation() + "-" + getRankValue().get(row + 1) + (BOARD_SIZE - col) + " ");
            }
            System.out.println("");
        }
    }

    public void pieceLocation(Piece p) {
        if (!".".equals(p.getRepresentation())) {

        }
    }

}
