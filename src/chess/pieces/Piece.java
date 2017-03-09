package chess.pieces;

/**
 *
 * @author teyyub 7:22:47 PM
 */
public class Piece {

    private final static String WHITE_COLOR = "WHITE";
    private final static String BLACK_COLOR = "BLACK";
//    private String name;
    private char representation;
    private Type type;
    private String color;
    private boolean isWhite;
    private boolean isBlack;
    
    public final static char PAWN_REPRESENTATION = 'p';
    public final static char ROOK_REPRESENTATION = 'r';
    public final static char KNIGHT_REPRESENTATION = 'n';
    public final static char BISHOP_REPRESENTATION = 'b';
    public final static char QUEEN_REPRESENTATION = 'q';
    public final static char KING_REPRESENTATION = 'k';
    public final static char BLANK_REPRESENTATION = '.';

    enum Colors {
        WHITE, BLACK
    };

    enum Type {
        ROOK, KNIGHT, BISHOP, QUEEN, KING, PAWN, NO_PIECE;
    };

//    enum Representation {
//        ROOK
//    };
//    public enum Value {
//        R(5), N(3), B(3), Q(9), P(1);
//
//        private int value;
//
//        private Value(int value) {
//            this.value = value;
//        }
//
//        int getValue() {
//            return value;
//        }
//    };
//    private Piece createPiece(String color, String name) {
//        return new Piece(color, name);
//    }
    public static Piece createWhitePawn() {
        return new Piece(Colors.WHITE, Type.PAWN);
    }

    public static Piece createBlackPawn() {
        return new Piece(Colors.BLACK, Type.PAWN);
    }

    public static Piece createWhiteRook() {
        return new Piece(Colors.WHITE, Type.ROOK);
    }

    public static Piece createBlackRook() {
        return new Piece(Colors.BLACK, Type.ROOK);
    }

    public static Piece createWhiteKnight() {
        return new Piece(Colors.WHITE, Type.KNIGHT);
    }

    public static Piece createBlackKnight() {
        return new Piece(Colors.BLACK, Type.KNIGHT);
    }

    public static Piece createWhiteBishop() {
        return new Piece(Colors.WHITE, Type.BISHOP);
    }

    public static Piece createBlackBishop() {
        return new Piece(Colors.BLACK, Type.BISHOP);
    }

    public static Piece createWhiteQueen() {
        return new Piece(Colors.WHITE, Type.QUEEN);
    }

    public static Piece createBlackQueen() {
        return new Piece(Colors.BLACK, Type.QUEEN);
    }

    public static Piece createWhiteKing() {
        return new Piece(Colors.WHITE, Type.KING);
    }

    public static Piece createBlackKing() {
        return new Piece(Colors.BLACK, Type.KING);
    }

    public static Piece noPiece() {
        return new Piece(BLANK_REPRESENTATION, Type.NO_PIECE);
    }

    public Piece(char r, Type type) {
        representation = r;
        this.type = type;
    }

    public Piece() {
    }

    public Piece(Colors c, Type t) {

        if (c == Colors.WHITE) {

            if (t == Type.PAWN) {
                this.representation = PAWN_REPRESENTATION;
                this.type = t;
                this.isWhite=true;
            }
            if (t == Type.BISHOP) {
                this.representation = BISHOP_REPRESENTATION;
                this.type = t;
                this.isWhite=true;
            }
            if (t == Type.KNIGHT) {
                this.representation = KNIGHT_REPRESENTATION;
                this.type = t;
                this.isWhite=true;
            }
            if (t == Type.QUEEN) {
                this.representation = QUEEN_REPRESENTATION;
                this.type = t;
                this.isWhite=true;
            }

            if (t == Type.ROOK) {
                this.representation = ROOK_REPRESENTATION;
                this.type = t;
                this.isWhite=true;
            }
            if (t == Type.KING) {
                this.representation = KING_REPRESENTATION;
                this.type = t;
                this.isWhite=true;
            }

        } else {
            if (t == Type.PAWN) {
                this.representation = Character.toUpperCase(PAWN_REPRESENTATION);
                this.type = t;
                this.isBlack=true;
            }
            if (t == Type.BISHOP) {
                this.representation = Character.toUpperCase(BISHOP_REPRESENTATION);
                this.type = t;
                this.isBlack=true;
            }
            if (t == Type.KNIGHT) {
                this.representation = Character.toUpperCase(KNIGHT_REPRESENTATION);
                this.type = t;
                this.isBlack=true;
            }
            if (t == Type.QUEEN) {
                this.representation = Character.toUpperCase(QUEEN_REPRESENTATION);
                this.type = t;
                this.isBlack=true;
            }

            if (t == Type.ROOK) {
                this.representation = Character.toUpperCase(ROOK_REPRESENTATION);
                this.type = t;
                this.isBlack=true;
            }
            if (t == Type.KING) {
                this.representation = Character.toUpperCase(KING_REPRESENTATION);
                this.type = t;
                this.isBlack=true;
            }
        }

    }

//    public Piece(String color, String name) {
//        this.color = color;
//        this.name = name;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public String getName() {
//        return name;
//    }
    public char getRepresentation() {
        return representation;
    }

    public Type getType() {
        return type;
    }

    public boolean isWhitePiece(Piece p) {
//        if ((p.getColor().equals("white")) || (p.getName().equals("p"))) {
//            return true;
//        }
        return false;
    }

    public boolean isWhite() {        
        return isWhite;
    }

    public boolean isBlack() {
        return isBlack;
    }
}
