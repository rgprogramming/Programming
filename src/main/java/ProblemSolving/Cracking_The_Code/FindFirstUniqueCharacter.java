package ProblemSolving.Cracking_The_Code;

import java.util.LinkedHashMap;

/**
 * Created by mital on 4/5/15.
 * Program to find the first non repeating character.
 * Input ---> Hello
 * Output---> H
 * Ignore Case Sensitive
 *
 */
public class FindFirstUniqueCharacter {
    public Character firstUniqueChar(String input) {
        if (input.length() == 0 || input == null) {
            return '\u0000';
        }
        // Used LinkedHashMap in order to guarantee the order of occurrence of character.

        LinkedHashMap<Character, Integer> mymap = new LinkedHashMap<Character, Integer>();
        for (int i = 0; i < input.length(); i++) {
            Character ch = new Character(input.charAt(i));
            if (mymap.containsKey(ch)) {
                mymap.put(ch, mymap.get(ch) + 1);
            } else {
                mymap.put(ch, 1);
            }

        }
        for (int i = 0; i < input.length(); i++){
            Character c = new Character(input.charAt(i));
            if(mymap.get(c) == 1){
                return c;
            }
        }return null;
    }

    public static void main (String[] args){
        FindFirstUniqueCharacter uniqueCharacter = new FindFirstUniqueCharacter();
        System.out.println (uniqueCharacter.firstUniqueChar("Hello"));
    }
}


