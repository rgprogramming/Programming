package ProblemSolving.Cracking_The_Code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by mital on 4/17/15.
 * Program to check two string are anagram
 * First String : Dog , Second String : God
 * Output : True
 * First String :
 */
public class AnagramString {
    public static boolean isAnagram(String first, String second) {
        if (first == null) {
            return false;
        }
        if (second == null) {
            return false;
        }
        if (first.length() != second.length()) {
            return false;
        } else if (sort(first).equals(sort(second)))
        {
            return true;
        }
        return false;
    }

    public static String sort(String input) {
        StringBuilder sb = new StringBuilder();
        char[] charArray = input.toLowerCase().toCharArray();
        Arrays.sort(charArray);
        for (int i = 0; i < charArray.length; i++) {
            sb.append(charArray[i]);
        }
        String s;
        s = sb.toString();
        return s;
    }


    public static boolean anagramUsingMap(String first, String second) {
        if (first == null) {
            return false;
        }
        if (second == null) {
            return false;
        }
        if (first.length() != second.length()) {
            return false;
        }
        Map<Character, Integer> myMap1 = new HashMap<Character, Integer>();
        for (int i = 0; i < first.length(); i++) {
            if (myMap1.containsKey(first.charAt(i))) {
                myMap1.put(first.charAt(i), myMap1.get(first.charAt(i)) + 1);
            } else {
                myMap1.put(first.charAt(i), 1);
            }
        }
        Map<Character, Integer> myMap2 = new HashMap<Character, Integer>();
        for (int i = 0; i < second.length(); i++) {
            if (myMap2.containsKey(second.charAt(i))) {
                myMap2.put(second.charAt(i), myMap2.get(second.charAt(i) + 1));
            } else {
                myMap2.put(second.charAt(i), 1);
            }
        }
//        for(Character c : myMap1.keySet()){
//            for (Character ch : myMap2.keySet()){
//                if(myMap1.get(c) == myMap2.get(ch))
//            }
//        }
        return false;
    }

    public static boolean isAnagramUsingArray(String first, String second) {
        if (first == null) {
            return false;
        }
        if (second == null) {
            return false;
        }
        if (first.length() != second.length()) {
            return false;
        }
        //I am considering case sensitive. If we want to ignore then we can convert into lowercase and just use an array of 128
        int[] letters = new int[256];
        for (int i = 0; i < first.length(); i++) {
            // If ignoring case sensitive then first.toLowerCase().charAt(i)
            letters[first.charAt(i)]++;
            letters[second.charAt(i)]--;
        }
        for (int i = 0; i < 256; i++) {
            if (letters[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
