package chess.pieces;

/**
 *
 * @author teyyub 7:22:47 PM
 */
public class Piece {

    private String color;
    private String name;

    private Piece createPiece(String color, String name) {
         return  new Piece(color, name);
    }
    
    public static Piece createWhitePawn(String color, String name) {
         return  new Piece(color, name);
    }
    
    public static Piece createBlackPawn(String color, String name) {
         return  new Piece(color, name);
    }

    public Piece() {
    }
            
    
    public Piece(String color, String name) {
        this.color = color;
        this.name = name;
    }
   
    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
   public boolean isWhitePiece(Piece p){
       if((p.getColor().equals("white")) || (p.getName().equals("p")) )
           return  true;
      return false;
   }
}
