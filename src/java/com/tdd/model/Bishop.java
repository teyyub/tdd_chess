package com.tdd.model;

/**
 *
 * @author teyyub  Mar 25, 2016 5:17:19 PM
 */
public class Bishop extends Piece{
   static final String BISHOP = "b";
    private static final String WHITE_COLOR = "WHITE";
    private static final String BLACK_COLOR = "BLACK";

    String pieceColor;
    String pieceRepresent;

    public Bishop() {
    }

    public Bishop(String color){
        if(color == null ? WHITE_COLOR == null : color.equals(WHITE_COLOR)){
            setColor(WHITE_COLOR);
            setRepresentation(BISHOP);
        } else{
            setColor(BLACK_COLOR);
            setRepresentation(BISHOP.toUpperCase());
        }
    }
}
