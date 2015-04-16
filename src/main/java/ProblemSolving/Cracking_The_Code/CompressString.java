package ProblemSolving.Cracking_The_Code;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mital on 4/9/15.
 */
public class CompressString {
    public String compressUsingMap(String input){
        Map<Character, Integer> mymap = new HashMap<Character, Integer>();
        for (int i = 0; i < input.length(); i++){
            if(mymap.containsKey(input.charAt(i))){
                mymap.put(input.charAt(i), mymap.get(input.charAt(i)) + 1);
            } else{
                mymap.put(input.charAt(i), 1);
            }
        }
        for (Character c : mymap.keySet()){
            Integer count = new Integer (mymap.get(input.charAt(c)));

        }
        return input;
    }
}
