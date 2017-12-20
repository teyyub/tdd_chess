package com.tdd.intf;

import com.tdd.model.Piece;

/**
 *
 * @author teyyub  Apr 13, 2016 12:28:58 PM 
 */
public interface PieceValue {

    /**
     *
     * @param type
     * @return
     */
    public int getValueForPiece(Piece.Type type);
    public boolean isValidMove(Piece.Type type);
}
