package ProblemSolving.Cracking_The_Code;

/**
 * Created by mital on 4/17/15.
 */
public class ReplaceSpace {
    public static String replacespaceUsingReplaceAll(String input){
        //Using Repalce All method of String
        input = input.trim();
        return input.replaceAll(" ","%20");
    }

    public static String replacespaceUsingReplaceInString(String input){
        //Using Replace method of String
        input = input.trim();
         return input.replace(" ", "%20");
    }

    //Inefficient Way as I am using String [] and also StringBuilder which is unnecessary
    public static String replaceSpaceUsingSplit(String input){
        input = input.trim();
        String[] arr = input.split(" ");

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++){
            sb.append("%20");
            sb.append(arr[i]);
        }

       return sb.toString();
    }

    public static String replaceSpaceUsingStringBuilder(String input) {
        input = input.trim();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                sb.append("%20");
            } else {
                sb.append(input.charAt(i));
            }

        }return sb.toString();
    }

    public static String replacespaceUsingReplace(String input){
        input = input.trim();
        for (int i = 0; i < input.length(); i++){
            if(input.charAt(i)==(' ')){
                input.replace(input.charAt(i),'%');
            }
        }return input;
    }

}
