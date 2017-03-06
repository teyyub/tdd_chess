
import org.junit.Test;
import com.project.model.Character;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author teyyub 5:02:32 PM
 */
public class CharacterTest {

    @Test
    public void testWhiteSpace() {
       Character ch = new Character("\n");
       assertEquals(true,ch.isWhitespace());
    }
}
