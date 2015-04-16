import ProblemSolving.ConvertTelephone;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by mital on 4/16/15.
 */
public class ConvertTelephoneTest {
    @Test
    public void testnumberTel(){
        assertNotNull(ConvertTelephone.numberTel("**-!@#-@#"));
        assertEquals("18002662278", ConvertTelephone.numberTel("1800-COMCAST"));
        assertEquals("18002662278", ConvertTelephone.numberTel("1800#COMCAST"));
        assertEquals("1800222333", ConvertTelephone.numberTel("1800#ABCDEF"));
        assertNotEquals("1800222353", ConvertTelephone.numberTel("1800#ABCDEF"));
    }

}
