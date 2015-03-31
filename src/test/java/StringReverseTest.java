/**
 * Created by mital on 3/30/15.
 */
import org.junit.Test;
import ProblemSolving.StringReverse;
import static junit.framework.Assert.assertTrue;

public class StringReverseTest {
    @Test
    public void reverseInEfficientWayTest(){
        StringReverse str = new StringReverse();
        assertTrue("olleH".equals( str.reverseInEfficientWay("Hello")));
    }
    @Test
    public void reverseUsingArrayTest(){
        StringReverse str = new StringReverse();
        assertTrue("olleH".equals( str.reverseUsingArray("Hello")));
    }
    @Test
    public void reverseTest(){
        StringReverse str = new StringReverse();
        assertTrue("olleH".equals( str.reverse("Hello")));
    }

}
