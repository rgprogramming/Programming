import org.junit.Assert;
import org.junit.Test;
import ProblemSolving.Cracking_The_Code.AnagramString;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by mital on 4/17/15.
 */
public class AnagramStringTest {
    @Test
    public void isAnagramTest(){
        assertFalse(AnagramString.isAnagram(null,""));
        assertFalse(AnagramString.isAnagram(null,null));
        assertFalse(AnagramString.isAnagram("",null));
        assertFalse(AnagramString.isAnagram("Hello","World"));
        assertTrue(AnagramString.isAnagram("Hello", "Elloh"));
        assertTrue(AnagramString.isAnagram("Hello", "hELLO"));
        assertTrue(AnagramString.isAnagram("Dog", "God"));
        assertTrue(AnagramString.isAnagram("21", "12"));
    }
    @Test
    public void isAnagramUsingArrayTest(){
        assertFalse(AnagramString.isAnagramUsingArray(null,""));
        assertFalse(AnagramString.isAnagramUsingArray(null, null));
        assertFalse(AnagramString.isAnagramUsingArray("", null));
        assertFalse(AnagramString.isAnagramUsingArray("Hello", "World"));
        assertFalse(AnagramString.isAnagramUsingArray("Hello", "Elloh"));
        assertFalse(AnagramString.isAnagramUsingArray("Hello", "hELLO"));
        Assert.assertFalse(AnagramString.isAnagramUsingArray("Dog", "God"));
        assertTrue(AnagramString.isAnagramUsingArray("21", "12"));
        assertTrue(AnagramString.isAnagramUsingArray("GOD", "DOG"));
    }
}
