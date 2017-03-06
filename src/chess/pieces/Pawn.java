package chess.pieces;

/**
 *
 * @author teyyub 4:13:52 PM
 */
public class Pawn {

    private String color;
    final String whitePawnColor = "white";
    final String blackPawnColor = "black";
    
    public Pawn() {

    }

    public Pawn(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

}
