package com.tdd.model;

/**
 *
 * @author teyyub Mar 25, 2016 4:20:09 PM
 */
public class Pawn extends Piece{

    static final String PAWN = "p";
    private static final String WHITE_COLOR = "WHITE";
    private static final String BLACK_COLOR = "BLACK";

    String pieceColor;
    String pieceRepresent;

    public Pawn() {
    }
    
//     public static Pawn createPawn(String color) {
//        return new Pawn(color);
//    }

//    public Pawn(String color){
//        if(color == null ? WHITE_COLOR == null : color.equals(WHITE_COLOR)){
//            setColor(WHITE_COLOR);
//            setRepresentation(PAWN);
//        } else{
//            setColor(BLACK_COLOR);
//            setRepresentation(PAWN.toUpperCase());
//        }
//    }

}
