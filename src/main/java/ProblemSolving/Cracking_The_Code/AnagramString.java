package ProblemSolving.Cracking_The_Code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by mital on 4/1/15.
 */
public class AnagramString {
    public static boolean isAnagram(String first, String second){
        if (first.length() != second.length()) {
            return false;
        }
            if ((sort(first).equals (sort(second)))) {
                return true;
            }
            else{
                return false;
            }
        }

    public static String sort(String input){
       StringBuilder sb = new StringBuilder();
        char[] charArray = input.toCharArray();
        Arrays.sort(charArray);
        for (int i = 0; i < charArray.length; i++){
            sb.append(charArray[i]);
        }
        String s;
        s = sb.toString();
        return s;
    }


    public static void anagramUsingMap(String first, String second){
        if(first.length() != second.length()){
            System.out.println ("Not Anagram");
        }
        Map<Character, Integer> myMap = new HashMap<Character, Integer>();
    }

    public static void main(String[] args){
        System.out.println (isAnagram("hello", "eholl"));
    }

}
