package CoreJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by mital on 3/31/15.
 * Demonstrating Map and how to iterate Map using for each loop and Iterator
 */
public class UsingMap {
    public static void printMap (){
        Map<Character,Integer> mymap = new HashMap<Character, Integer>();
        // Adding key and value to map
        mymap.put('a',5);
        mymap.put('b',7);
        mymap.put('c',8);
        mymap.put('d',9);
        mymap.put('e', 10);
        mymap.put('a', 7);
        mymap.put('b', 8);

        //Printing out size of map.
        //Map will contain only unique keys. a and b are repeated.

        System.out.println(mymap.size());

        //It will print the latest value of a. It will have effect like we are modifying value of a.

        System.out.println(mymap.get('a'));

        //Iterating Map using for each loop

        for (Character c : mymap.keySet()){
            System.out.println (c + " " + mymap.get(c));
        }

        //Iterating Map using Iterator

        Iterator<Character> iterator = mymap.keySet().iterator();
        while (iterator.hasNext()){
           Character c = iterator.next();
           System.out.println ( c + " " + mymap.get(c));
        }

        }
    public static void main (String[] args){
        printMap();
    }
}
