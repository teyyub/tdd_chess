package chess.pieces;

/**
 *
 * @author teyyub 4:13:52 PM
 */
public class Pawn {

    private String color;
    final String whitePawnColor = "white";
    final String blackPawnColor = "black";
    String representation;
    public Pawn() {

    }

    public Pawn(String color) {
        this.color = color;
    }
    
    public Pawn(String color, String representation){
        this.color = color;
        this.representation = representation;
    }
    
    public String getColor() {
        return color;
    }
    public String getRepresentation(){
      return representation;
    }
}
