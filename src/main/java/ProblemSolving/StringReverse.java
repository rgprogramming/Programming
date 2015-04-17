package ProblemSolving;

/**
 * Created by mital on 3/30/15.
 * Reverse String word by word.
 * Input --> "Hello" Output--> "olleH"
 * Consider case sensitive
 * Showing 3 different ways to reverse String
 * Using Array, Using StringBuilder and Using CharAt method of String.
 * Efficient Way is using String Builder
 */
public class StringReverse {
    public String reverse(String input){
        if(input.length() == 0 || input == null){
            return null;
        }
        String output = "";
        for (int i = input.length()-1; i >= 0; i--){
            output += input.charAt(i);
        }
        return output;
    }

    public String reverseUsingArray(String input){
        if (input.length() == 0 || input == null){
            return null;
        }
        String output = "";
        char[] charArray = input.toCharArray();
        for (int i = charArray.length -1; i>=0; i--){
            output += charArray[i];
        }
        return output;
    }
    public String reverseUsingStringBuffer(String input){
        String stringBuffer = new StringBuffer(input).reverse().toString();
        return stringBuffer;
    }

    public String reverseInEfficientWay (String input){
        if (input.length() == 0 || input == null){
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = input.length()-1; i >= 0; i--){
            sb.append(input.charAt(i));
        }
        return sb.toString();
    }

    public String reverseEfficient (String input){
        String sb = new StringBuilder(input).reverse().toString();
        return sb;
    }
}
