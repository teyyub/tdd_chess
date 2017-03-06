
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
         Pawn whitePawn = new Pawn("white");
         String whitePawnColor = "white";
         assertEquals(whitePawn.getColor(), whitePawnColor);
         
         Pawn blackPawn = new Pawn("black");
         assertEquals(blackPawn.getColor(), "black");
                 
    }
}
