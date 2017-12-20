package com.tdd.model;

/**
 *
 * @author teyyub Mar 25, 2016 5:17:51 PM
 */
public class King extends Piece {

    static final String KING = "k";
    private static final String WHITE_COLOR = "WHITE";
    private static final String BLACK_COLOR = "BLACK";

    
    public King() {
    }
    public static King createKing(String color){
      return new King(color);
    } 
    private King(String color) {
        if (color == null ? WHITE_COLOR == null : color.equals(WHITE_COLOR)) {
            setRepresentation(KING);
        } else {
            setRepresentation(KING.toUpperCase());
        }
        setColor(color);
    }
  
}
