
import com.project.model.Board;
import com.project.model.Pawn;
import static org.junit.Assert.assertEquals;
import org.junit.Test;


/**
 *
 * @author teyyub 4:43:29 PM
 */
public class BoardTest {
 @Test
    public void testCreateBoard(){
        Board board = new  Board();
        Pawn whitePawn = new Pawn("white");
        board.addPawn(whitePawn);
        assertEquals(1,board.getPawnCount());
        Pawn blackPawn = new Pawn("black");
        board.addPawn(blackPawn);
        assertEquals(2,board.getPawnCount());
    }
}
