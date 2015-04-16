package ProblemSolving.Cracking_The_Code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by mital on 4/15/15.
 * Program to check whether String contains unique character or not
 * Return true if string contains all unique character
 */

public class UniqueString {

    //Demonstrating if we cannot use any extra data structure
    public static boolean isUniqueUsingArraySort(String input) {
        if (input.length() > 256) {
            return false;
        }
        char[] arr = input.toCharArray();
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isUniqueUsingArray(String input) {
        if (input.length() > 256) {
            return false;
        }
        boolean[] char_set = new boolean[256];
        for (int i = 0; i < input.length(); i++) {
            int val = input.charAt(i);
            if (char_set[val] == true) {
                return false;
            }
            else{
                char_set[val] = true;
            }
        } return true;
    }

    public static boolean isUinqueUsingMap(String input){
        if(input.length() > 256){
            return false;
        }
        Map <Character, Integer> myMap = new HashMap<Character, Integer>();
        for (int i = 0; i < input.length(); i++){
            Character key = input.charAt(i);

            if((myMap.containsKey(key))){
                myMap.put(key, myMap.get(key) + 1);
            }
            else{
                myMap.put(key, 1);
            }
        }
        for (Character c : myMap.keySet()){
            if(myMap.get(c) > 1){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        UniqueString us = new UniqueString();
        System.out.println("Using Array Sort: Input --> Mital  Output --> " +us.isUniqueUsingArraySort("Mital"));
        System.out.println("Using Array Sort: Input --> Hello   Output -->" +us.isUniqueUsingArraySort("Hello"));
        System.out.println("Using Array: Input --> Mital   Output -->" +us.isUniqueUsingArray("Mital"));
        System.out.println("Using Array:Input --> Hello   Output -->" +us.isUniqueUsingArray("Hello"));
        System.out.println("Using Map: Input --> Hello  Output -->" +us.isUinqueUsingMap("Hello"));
        System.out.println("Using Map: Input --> Mital  Output -->" +us.isUinqueUsingMap("Mital"));
    }
}
