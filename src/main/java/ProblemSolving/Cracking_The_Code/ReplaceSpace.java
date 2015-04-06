package ProblemSolving.Cracking_The_Code;

/**
 * Created by mital on 4/2/15.
 */
public class ReplaceSpace {
    public static String replacespaceUsingReplaceAll(String input){
        return input.replaceAll(" ","%20");
    }

    public static String replaceSpaceUsingStringBuilder(String input){
        String[] arr = input.split(" ");

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < arr.length; i++){
            sb.append("%20");
            sb.append(arr[i]);
        }

       return sb.toString();
    }


    public static void main (String[] args){
        System.out.println (replacespaceUsingReplaceAll(" Hello World Of String        "));
        System.out.println (replaceSpaceUsingStringBuilder(" Hello World Of String        "));
    }
}
