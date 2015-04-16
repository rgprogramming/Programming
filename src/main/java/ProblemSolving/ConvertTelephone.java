package ProblemSolving;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mital on 4/16/15.
 * Convert characters from Telephone number to actual numbers.
 * Output will not contain any special character like - , * , #
 * Input : 1800 - COMCAST
 * Output: 18002662278
 */
public class ConvertTelephone {
    public static String numberTel (String input){
        //Storing numbers in Map
        Map<Character, Integer> myMap = new HashMap<Character, Integer>();
            myMap.put('A',2);
            myMap.put('B',2);
            myMap.put('C',2);
            myMap.put('D',3);
            myMap.put('E',3);
            myMap.put('F',3);
            myMap.put('G',4);
            myMap.put('H',4);
            myMap.put('I',4);
            myMap.put('J',5);
            myMap.put('K',5);
            myMap.put('L',5);
            myMap.put('M',6);
            myMap.put('N',6);
            myMap.put('O',6);
            myMap.put('P',7);
            myMap.put('Q',7);
            myMap.put('R',7);
            myMap.put('S',7);
            myMap.put('T',8);
            myMap.put('U',8);
            myMap.put('V',8);
            myMap.put('W',9);
            myMap.put('X',9);
            myMap.put('Y',9);
            myMap.put('Z', 9);

        // Converting String to Character Array
        char[] charArray = input.toCharArray();
        StringBuilder sb = new StringBuilder();

        // If not digit then will fetch from Map and append number.
        for (int i = 0; i < charArray.length; i++){
            if(!(Character.isDigit(charArray[i]))){
                if(myMap.get(charArray[i])!=null){
               sb.append(myMap.get(charArray[i]));
            }
            }else{
                sb.append(charArray[i]);
            }
        }  return sb.toString();
    }
    public static void main (String[] args){
        System.out.println (numberTel("1800-COMCAST"));
    }
    }

