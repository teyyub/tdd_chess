package com.tdd.model;

/**
 *
 * @author teyyub Mar 25, 2016 11:29:59 PM
 */
public class Piece {

//    @Override
//    public boolean isValidMove(Type type) {
//        throw new UnsupportedOperationException("Not supported yet.");
//    }
//    public enum Colors {
//        WHITE, BLACK, NullColor
//    };
//
//    public enum Type {
//        PAWN, ROOK, BISHOP, KNIGHT, QUEEN, KING, NOPIECE;
//    };
//    Map<Piece.Type, Integer> values = null;
    private String color;
    private String representation;
//    private static final String WHITE_COLOR = "WHITE";
//    private static final String BLACK_COLOR = "BLACK";
//    private static final String NULL_COLOR = "Null";
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
//    public static Piece createWhiteQueen(){
//        return new Queen(WHITE_COLOR);
//    }
    public static Piece createPiece(Colors c, Type p) {
        return new Piece(c, p);
    }

    private static Piece createWhitePawn() {
        return new Piece(Colors.WHITE, Type.PAWN);
    }

    private static Piece createWhiteRook() {
        return new Piece(Colors.WHITE, Type.ROOK);
    }

    private static Piece createWhiteBishop() {
        return new Piece(Colors.WHITE, Type.BISHOP);
    }

    private static Piece createWhiteKnight() {
        return new Piece(Colors.WHITE, Type.KNIGHT);
    }

    private static Piece createWhiteQueen() {
        return new Piece(Colors.WHITE, Type.QUEEN);
    }

    private static Piece createWhiteKing() {
        return new Piece(Colors.WHITE, Type.KING);
    }

    private static Piece createBlackPawn() {
        return new Piece(Colors.BLACK, Type.PAWN);
    }

    private static Piece createBlackRook() {
        return new Piece(Colors.BLACK, Type.ROOK);
    }

    private static Piece createBlackBishop() {
        return new Piece(Colors.BLACK, Type.BISHOP);
    }

    private static Piece createBlackKnight() {
        return new Piece(Colors.BLACK, Type.KNIGHT);
    }

    private static Piece createBlackQueen() {
        return new Piece(Colors.BLACK, Type.QUEEN);
    }

    private static Piece createBlackKing() {
        return new Piece(Colors.BLACK, Type.KING);
    }

    private Piece(Colors c, Type p) {

        if (p == Type.PAWN) {
            if (c == Colors.WHITE) {

                this.representation = PAWN;
            } else {
                this.representation = PAWN.toUpperCase();
            }
        }
        if (p == Type.ROOK) {
            if (c == Colors.WHITE) {
                this.representation = ROOK;
            } else {
                this.representation = ROOK.toUpperCase();
            }
        }
        if (p == Type.BISHOP) {
            if (c == Colors.WHITE) {
                this.representation = BISHOP;
            } else {
                this.representation = BISHOP.toUpperCase();
            }
        }
        if (p == Type.KNIGHT) {
            if (c == Colors.WHITE) {
                this.representation = KNIGHT;
            } else {
                this.representation = KNIGHT.toUpperCase();
            }
        }
        if (p == Type.QUEEN) {
            if (c == Colors.WHITE) {
                this.representation = QUEEN;
            } else {
                this.representation = QUEEN.toUpperCase();
            }
        }
        if (p == Type.KING) {
            if (c == Colors.WHITE) {
                this.representation = KING;
            } else {
                this.representation = KING.toUpperCase();
            }
        }
        if (p == Type.NOPIECE) {
            this.representation = ".";
        }
    }

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
        return (getColor() == null ? Colors.WHITE == null : getColor().equals(Colors.WHITE));
    }

    public boolean isBlack() {
        return (getColor() == null ? Colors.BLACK == null : getColor().equals(Colors.BLACK));
    }

}
