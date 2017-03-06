package chess.board;

import chess.pieces.Pawn;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author teyyub 4:34:06 PM
 */
public class Board {

    private byte pieces = 0;
    private byte pawnCount = 0;
    private byte initPieces = 16;
    private List<Pawn> pawns = new LinkedList<>();
    private String board;
    final static String NEW_LINE = System.getProperty("line.separator");

    public void addPawn(Pawn pawn) {
        pawnCount += 1;
    }

    public byte getPieces() {
        return pieces;
    }

    public byte getPawnCount() {
        return pawnCount;
    }

    public byte getInitPieces() {
        return initPieces;
    }

    public void initialize() {

        board =   "........" + NEW_LINE
                + "PPPPPPPP" + NEW_LINE
                + "........" + NEW_LINE
                + "........" + NEW_LINE
                + "........" + NEW_LINE
                + "........" + NEW_LINE
                + "pppppppp" + NEW_LINE
                + "........";

    }

    public String printBoard() {
        return board;
    }

    public List<Pawn> getPawns() {
        return pawns;
    }

}
