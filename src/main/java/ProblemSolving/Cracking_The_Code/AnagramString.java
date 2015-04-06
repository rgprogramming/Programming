package ProblemSolving.Cracking_The_Code;

import java.util.Arrays;

/**
 * Created by mital on 4/1/15.
 */
public class AnagramString {
    public static boolean isAnagram(String first, String second){
        if(first.length() == 0 || first == null || second == null || second.length()==0){
            return false;
        }
       if( sort(first).equals(sort(second))){
            return true;
        }
        return false;
    }

    public static String sort(String input){
       StringBuilder sb = new StringBuilder();
        char[] arr = input.toCharArray();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++){
            sb.append(arr[i]);
        }
        return sb.toString();
    }

//    public static boolean isAnagramUsingStringBuilder (String first, String second){
//        if(first.length() != second.length() || first == null || second == null){
//            return false;
//        }
//        char[] arrOfFirst = first.toCharArray();
//        StringBuilder sb = new StringBuilder(second);
//        return false;
//    }

    public static void main (String[] args){
        System.out.println (isAnagram("Hello","oellH"));
        System.out.println (isAnagram("Hardik","kdiraH"));
        System.out.println (isAnagram("Hardik","Mital"));
        System.out.println ();
//        System.out.println (isAnagramUsingStringBuilder("Hello", "oellH"));
//        System.out.println (isAnagramUsingStringBuilder("Hardik", "kdiraH"));
//        System.out.println (isAnagramUsingStringBuilder("Hardik", "Mital"));
    }
}
