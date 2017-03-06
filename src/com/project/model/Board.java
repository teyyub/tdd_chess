package com.project.model;

/**
 *
 * @author teyyub 4:34:06 PM
 */
public class Board {

    private byte pieces = 0;
    private byte pawnCount = 0;

    public void addPawn(Pawn pawn) {
        pawnCount += 1;
    }

    public byte getPieces() {
        return pieces;
    }

    public byte getPawnCount() {
     return pawnCount;
    }
}
