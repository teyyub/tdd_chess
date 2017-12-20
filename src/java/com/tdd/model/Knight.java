package com.tdd.model;

/**
 *
 * @author teyyub Mar 25, 2016 5:17:28 PM
 */
public class Knight extends Piece {

    static final String KNIGHT = "n";
    private static final String WHITE_COLOR = "WHITE";
    private static final String BLACK_COLOR = "BLACK";

    public Knight() {
    }

    public static Knight createKnight(String color) {
        return new Knight(color);
    }
    
    private Knight(String color) {
        if (color == null ? WHITE_COLOR == null : color.equals(WHITE_COLOR)) {    
            setRepresentation(KNIGHT);
        } else {            
            setRepresentation(KNIGHT.toUpperCase());
        }
        setColor(color);
    }

}
