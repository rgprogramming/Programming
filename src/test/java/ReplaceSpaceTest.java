import org.junit.Test;

import static ProblemSolving.Cracking_The_Code.ReplaceSpace.*;
import static org.junit.Assert.assertEquals;

public class ReplaceSpaceTest {
    @Test
    public void replacespaceUsingReplaceAllTest(){
        assertEquals("Hello%20World%20of%20String",replacespaceUsingReplaceAll(" Hello World of String        "));
        assertEquals("Hello%20World%20of%20String", replaceSpaceUsingStringBuilder(" Hello World of String        "));
        assertEquals("Hello%20World%20of%20String",replacespaceUsingReplaceInString(" Hello World of String        "));
        assertEquals("Hello%20World%20of%20String",replaceSpaceUsingSplit(" Hello World of String        "));
    }
}
