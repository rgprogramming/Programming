package ProblemSolving.Cracking_The_Code;

import java.util.LinkedHashMap;

/**
 * Created by mital on 4/5/15.
 * Program to find the first non repeating character.
 * Input ---> Hello
 * Output---> H
 * Case Sensitive
 *
 */

/*
Implementation of HashMap permits null key and null values.
HashMap does not guarantee for the order of map. But in our problem we need to maintain order
So we have used Linked HashMap which will provide same functionality as HashMap but will also guarantee order.
 */
public class FindFirstUniqueCharacter {
    public Character firstUniqueChar(String input) {
        if (input.length() == 0 || input == null) {
            return '\u0000';
        }
        // Used LinkedHashMap in order to guarantee the order of occurrence of character.

        /*
        Map.get() will return the value to which the specified is key is mapped
        Map.containsKey() will return boolean, will return true if map contains a mapping to specified key
        Map.put() will associates the specified value with the specified key in this map.

         */

        LinkedHashMap<Character, Integer> mymap = new LinkedHashMap<Character, Integer>();
        for (int i = 0; i < input.length(); i++) {
            Character ch = new Character(input.charAt(i));
            if (mymap.containsKey(ch)) {
                mymap.put(ch, mymap.get(ch) + 1);
            } else {
                mymap.put(ch, 1);
            }

        }
        //Check condition if character is exactly = 1 then will return that character
        for (int i = 0; i < input.length(); i++){
            Character c = new Character(input.charAt(i));
            if(mymap.get(c) == 1){
                return c;
            }
        }return null;
    }

    public static void main (String[] args){
        FindFirstUniqueCharacter uniqueCharacter = new FindFirstUniqueCharacter();
        //Expected output: H
        System.out.println (uniqueCharacter.firstUniqueChar("Hello"));
        //Expected output: F
        System.out.println (uniqueCharacter.firstUniqueChar("GeeksForGeeks"));
    }
}


