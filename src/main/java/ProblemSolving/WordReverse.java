package ProblemSolving;

import java.util.Stack;

/**
 * Created by mital on 4/16/15.
 * Program will reverse word.
 * Consider case- sensitive
 * Input--> Hello World
 * Output--> World Hello
 *
 */
public class WordReverse {
    public String reverseUsingStringBuilder (String input){
        if (input.length() == 0 || input == null){
            return input;
        }
        StringBuilder sb = new StringBuilder();
        // Using split method to remove space.
        //Split method will return an array of string computed by splitting this string around matches of the given regular expression
        String[] arr = input.split(" ");
        for (int i = arr.length - 1; i >= 0; i--){
            sb.append(" " + arr[i]);
        }
        //trim method will return a copy of the string, with leading and trailing whitespace omitted.
        return sb.toString().trim();
    }

    public String reverseUsingStack (String input){
        StringBuilder reverse =  new StringBuilder();
        Stack myStack = new Stack();
        String[] arr = input.split(" ");
        for (int i = 0; i < arr.length; i++){
            myStack.push(arr[i]);
        }
        while (!(myStack.isEmpty())){

            reverse.append(" " + myStack.pop());
        }

        return reverse.toString().trim();
        }


}
