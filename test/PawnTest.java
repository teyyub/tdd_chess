
import com.project.model.Board;
import com.project.model.Pawn;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author teyyub 12:33:51 PM
 */
public class PawnTest {

    @Test
    public void testCreate() {
         
         final String whitePawnColor = "white";
         final String blackPawnColor = "black";
                 
         
         Pawn whitePawn = new Pawn(whitePawnColor);
         
         assertEquals(whitePawn.getColor(), whitePawnColor);                  
         
         Pawn blackPawn = new Pawn(blackPawnColor);
         
         assertEquals(blackPawn.getColor(), blackPawnColor);
                 
    }
    
    @Test
    public void testCreateBoard(){
        Board board = new Board();
        assertEquals(board.getPieces(), 0);
    }
}
