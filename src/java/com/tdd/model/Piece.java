package com.tdd.model;

/**
 *
 * @author teyyub Mar 25, 2016 11:29:59 PM
 */
public class Piece   {

   

//    @Override
//    public boolean isValidMove(Type type) {
//        throw new UnsupportedOperationException("Not supported yet.");
//    }

    public enum Colors {
        WHITE, BLACK, NullColor
    };

//    public enum Type {
//        PAWN, ROOK, BISHOP, KNIGHT, QUEEN, KING, NOPIECE;
//    };

//    Map<Piece.Type, Integer> values = null;
 
    private String color;
    private String representation;
    private static final String WHITE_COLOR = "WHITE";
    private static final String BLACK_COLOR = "BLACK";
    private static final String NULL_COLOR = "Null";
    static final String ROOK = "r";
    static final String KNIGHT = "n";
    static final String BISHOP = "b";
    static final String QUEEN = "q";
    static final String KING = "k";
    static final String PAWN = "p";

    public Piece() {
    }

//    void loadValues() {
//        values = new EnumMap<Type, Integer>(Piece.Type.class);
//        values.put(Type.KING, -1);
//        values.put(Type.QUEEN, 9);
//        values.put(Type.ROOK, 5);
//        values.put(Type.BISHOP, 3);
//        values.put(Type.KNIGHT, 3);
//        values.put(Type.PAWN, 1);
//    }

//    public Map<Type, Integer> getValues() {
//        if (values == null) {
//            loadValues();
//        }
//        return values;
//    }

    
    public static Piece createWhiteQueen(){
        return new Queen(WHITE_COLOR);
    }
    
    
//    public static Piece createPiece(Colors c, Type p) {
//        return new Piece(c, p);
//    }

//    private Piece(Colors color, Type type) {
////        if (type == Type.PAWN) {
////            if (color == Colors.WHITE) {
////                Pawn.createPawn(WHITE_COLOR);
////            }
////        }
//    }
//    private Piece(Colors c, Type p) {
//        if (null != c) {
//            switch (c) {
//                case WHITE:
//                    this.color = WHITE_COLOR;
//                    break;
//                case BLACK:
//                    this.color = BLACK_COLOR;
//                    break;
//                default:
//                    this.color = NULL_COLOR;
//                    break;
//            }
//        }
//
//        if (p == Type.Pawn) {
//            if (c == Colors.WHITE) {   
//                
//                this.representation = PAWN;
//            } else {
//                this.representation = PAWN.toUpperCase();
//            }
//        }
//        if (p == Type.Rook) {
//            if (c == Colors.WHITE) {
//                this.representation = ROOK;
//            } else {
//                this.representation = ROOK.toUpperCase();
//            }
//        }
//        if (p == Type.Bishop) {
//            if (c == Colors.WHITE) {
//                this.representation = BISHOP;
//            } else {
//                this.representation = BISHOP.toUpperCase();
//            }
//        }
//        if (p == Type.Knight) {
//            if (c == Colors.WHITE) {
//                this.representation = KNIGHT;
//            } else {
//                this.representation = KNIGHT.toUpperCase();
//            }
//        }
//        if (p == Type.Queen) {
//            if (c == Colors.WHITE) {
//                this.representation = QUEEN;
//            } else {
//                this.representation = QUEEN.toUpperCase();
//            }
//        }
//        if (p == Type.King) {
//            if (c == Colors.WHITE) {
//                this.representation = KING;
//            } else {
//                this.representation = KING.toUpperCase();
//            }
//        }
//        if (p == Type.NoPiece) {
//            this.representation = ".";
//        }
//    }
   
    private Piece(String color, Pawn p) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRepresentation() {
        return representation;
    }
    public void setRepresentation(String representation) {
        this.representation = representation;
    }

    public boolean isWhite() {
        return (getColor() == null ? WHITE_COLOR == null : getColor().equals(WHITE_COLOR));
    }

    public boolean isBlack() {
        return (getColor() == null ? BLACK_COLOR == null : getColor().equals(BLACK_COLOR));
    }

   

}
