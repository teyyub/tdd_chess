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
    public void initialize(){
        
        board = "........\n"+
                 "PPPPPPPP\n"+
                 "........\n"+
                 "........\n"+
                 "........\n"+
                 "........\n"+
                 "pppppppp\n"+
                 "........\n";
 
    }
  
    public String printBoard(){
        return board;
    }
    
    public List<Pawn> getPawns() {
        return pawns;
    }
    
    
}
