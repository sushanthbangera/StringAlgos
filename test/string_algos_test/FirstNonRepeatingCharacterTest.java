
package string_algos_test;

import org.junit.Test;
import static org.junit.Assert.*;
import stringalgos.FirstNonRepeatingCharacter;

/**
 *
 * @author Sushanth Bangera
 */
public class FirstNonRepeatingCharacterTest {
    
    public FirstNonRepeatingCharacterTest() {
        FirstNonRepeatingCharacter obj = new FirstNonRepeatingCharacter();
    }

    @Test
    public void testFirstNonRepeatingCharacter() {
        assertTrue(1 == FirstNonRepeatingCharacter.getFirstNonRepeatingCharacterIndex("sushanth"));
        assertTrue(Integer.MAX_VALUE == FirstNonRepeatingCharacter.getFirstNonRepeatingCharacterIndex("ssuuhhaa"));
        assertTrue(Integer.MAX_VALUE == FirstNonRepeatingCharacter.getFirstNonRepeatingCharacterIndex(""));
        assertTrue(Integer.MAX_VALUE == FirstNonRepeatingCharacter.getFirstNonRepeatingCharacterIndex(null));
    }
}
 