package chess.board;

import chess.pieces.Pawn;
import chess.pieces.Piece;
import java.util.LinkedList;
import java.util.List;
import utils.StringUtil.StringUtil;

/**
 *
 * @author teyyub 4:34:06 PM
 */
public class Board {

//    private byte pieces = 0;
    private byte pawnCount = 0;
    private int pieceCount;
    private int whitePieceCount = 0;
    private int blackPieceCount = 0;
    private byte initPieces = 16;
    private List<Pawn> pawns = new LinkedList<>();
    private String board;
    private List<Piece> pieces = new LinkedList();

    public void addPawn(Pawn pawn) {
        pawnCount += 1;
    }

    public void addPiece(Piece piece) {
        pieces.add(piece);
    }

    public List<Piece> getPieces() {
        return pieces;
    }

    public int getAllPieceCount() {
        return pieces.size();
    }

    public int whitePieceCount() {
        for (int i = 0; i < pieces.size(); i++) {
            Piece p = pieces.get(i);
            if (p.isWhite()) {
                whitePieceCount += 1;
            }
        }
        return whitePieceCount;
    }

    public int blackPieceCount() {
        for (int i = 0; i < pieces.size(); i++) {
            Piece p = pieces.get(i);
            if (p.isBlack()) {
                blackPieceCount += 1;
            }
        }
        return blackPieceCount;
    }

    public byte getPawnCount() {
        return pawnCount;
    }

    public byte getInitPieces() {
        return initPieces;
    }

    public void initialize() {

        board = StringUtil.appendNewLine("RNBQKBNR")
                + StringUtil.appendNewLine("PPPPPPPP")
                + StringUtil.appendNewLine("........")
                + StringUtil.appendNewLine("........")
                + StringUtil.appendNewLine("........")
                + StringUtil.appendNewLine("........")
                + StringUtil.appendNewLine("pppppppp")
                + StringUtil.appendNewLine("rnbqkbnr");

    }

    public String printBoard() {
        return board;
    }

    public List<Pawn> getPawns() {
        return pawns;
    }

}
