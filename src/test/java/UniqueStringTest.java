import org.junit.Test;
import ProblemSolving.Cracking_The_Code.UniqueString;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by mital on 4/16/15.
 */
public class UniqueStringTest {
    @Test
    public void isUniqueUsingArraySortTest(){
        assertFalse(UniqueString.isUniqueUsingArraySort("aCEFWefewsLDf FDFDSAFASFZAGFEWGHJTHMRYJRTEFWET2abcewr4qqleteqeet422r22dqwdaksakFFEFEWFWEEWEFEWFEVR23OR23R23R222EEEWFWASFASFWRAEWREWQWETETHTEHTYRT4RI23R23"));
        assertTrue(UniqueString.isUniqueUsingArraySort("Mital"));
        assertFalse(UniqueString.isUniqueUsingArraySort("Hello"));
        assertTrue(UniqueString.isUniqueUsingArraySort(""));

    }
    @Test
    public void isUniqueUsingArrayTest(){
        assertFalse(UniqueString.isUniqueUsingArray("aCEFWefewsLDf FDFDSAFASFZAGFEWGHJTHMRYJRTEFWET2abcewr4qqleteqeet422r22dqwdaksakFFEFEWFWEEWEFEWFEVR23OR23R23R222EEEWFWASFASFWRAEWREWQWETETHTEHTYRT4RI23R23"));
        assertTrue(UniqueString.isUniqueUsingArray("Mital"));
        assertFalse(UniqueString.isUniqueUsingArray("Hello"));
        assertTrue(UniqueString.isUniqueUsingArray(""));

    }
    @Test
     public void isUniqueUsingMapTest(){
        assertFalse(UniqueString.isUinqueUsingMap("aCEFWefewsLDf FDFDSAFASFZAGFEWGHJTHMRYJRTEFWET2abcewr4qqleteqeet422r22dqwdaksakFFEFEWFWEEWEFEWFEVR23OR23R23R222EEEWFWASFASFWRAEWREWQWETETHTEHTYRT4RI23R23"));
        assertTrue(UniqueString.isUinqueUsingMap("Mital"));
        assertFalse(UniqueString.isUinqueUsingMap("Hello"));
        assertTrue(UniqueString.isUinqueUsingMap(""));

    }

}
