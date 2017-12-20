package com.tdd.model;

/**
 *
 * @author teyyub Mar 25, 2016 5:10:41 PM
 */
public class Rook extends Piece{
    static final String ROOK = "r";
    private static final String WHITE_COLOR = "WHITE";
    private static final String BLACK_COLOR = "BLACK";

    String pieceColor;
    String pieceRepresent;

    public Rook() {
    }

    public Rook(String color){
        if(color == null ? WHITE_COLOR == null : color.equals(WHITE_COLOR)){
            setColor(WHITE_COLOR);
            setRepresentation(ROOK);
        } else{
            setColor(BLACK_COLOR);
            setRepresentation(ROOK.toUpperCase());
        }
    }

    public String getPieceColor() {
        return pieceColor;
    }

    public void setPieceColor(String pieceColor) {
        this.pieceColor = pieceColor;
    }

    public String getPieceRepresent() {
        return pieceRepresent;
    }

    public void setPieceRepresent(String pieceRepresent) {
        this.pieceRepresent = pieceRepresent;
    }
    
}
