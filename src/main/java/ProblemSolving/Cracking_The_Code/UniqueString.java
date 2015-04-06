package ProblemSolving.Cracking_The_Code;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by mital on 3/31/15.
 * Program to check whether String contains unique character or not
 * Return true if string contains all unique character
 */

public class UniqueString {

    //Demonstrating if we cannot use any extra data structure
    public boolean isUniqueUsingArraySort(String input) {
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

    public boolean isUniqueUsingArray(String input) {
        if (input.length() > 256) {
            return false;
        }
        boolean[] char_set = new boolean[256];
        for (int i = 0; i < input.length(); i++) {
            int val = input.charAt(i);
            if (char_set[val] == true) {
                return false;
            }
        }
        return true;
    }

//    public boolean isUniqueUsingMap(String input) {
//        if (input == null || input.length() == 0 || input.length() > 256) {
//            return false;
//        }
//        Map<Character, Integer> mymap = new HashMap<Character, Integer>();
//        for (int i = 0; i < input.length(); i++) {
//            Character c = input.charAt(i);
//
//            if (mymap.get(c) > 1) {
//                mymap.put(c, mymap.get(c) + 1);
//            } else {
//                mymap.put(c, 1);
//            }
//        }
//        for (Character c : mymap.keySet()) {
//            System.out.println (" ->" + mymap.get(c));
//
//        }
//
//        for (Character c : mymap.keySet()) {
//            if (mymap.get(c) > 1) {
//                return false;
//            }
//        }
//
//        return true;
//    }

    public static void main(String[] args) {
        UniqueString us = new UniqueString();
        System.out.println(us.isUniqueUsingArraySort("Mital"));
        System.out.println(us.isUniqueUsingArray("Mital"));
      //  System.out.println(us.isUniqueUsingMap("Hello"));
    }
}
