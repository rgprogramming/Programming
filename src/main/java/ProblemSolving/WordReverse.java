package ProblemSolving;

import java.util.Stack;

/**
 * Created by mital on 3/31/15.
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
        String[] arr = input.split(" ");
        for (int i = arr.length - 1; i >= 0; i--){
            sb.append(" " + arr[i]);
        }
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
