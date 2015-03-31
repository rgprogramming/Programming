package ProblemSolving;

/**
 * Created by mital on 3/30/15.
 * Will Find fibonnaci number at specific position and will return fibonnaci number at that position.
 * Fibonnaci number is sum of the number of last two numbers from that specific position.
 * Input --> 6 (6th position)
 * 1,1,2,3,5,8,13,21....
 * Output --> 8
 * Showing 2 different ways to solve using Recursive and Iteration.
 *
 */
public class FibonacciNumber {

    public int fibonnaciUsingRecurvise (int position){
        if(position == 1 || position == 2){
            return 1;
        }
        return fibonnaciUsingRecurvise(position -1) + fibonnaciUsingRecurvise(position -2);

    }

    public int fibonnaciUsingIteration(int position){
        if(position == 1 || position == 2){
            return 1;
        }
        int x = 0;
        int y = 1;
        int z = 1;
        for (int i = 0; i < position; i++){
            x = y;
            y = z;
            z = x+y;
        }
        return x;
    }

    public static void main (String[] args){
        FibonacciNumber fn = new FibonacciNumber();
        System.out.println (fn.fibonnaciUsingIteration(6));
        System.out.println (fn.fibonnaciUsingRecurvise(6));


    }
}
