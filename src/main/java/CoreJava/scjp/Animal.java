package CoreJava.scjp;

/**
 * Created by mital on 4/1/15.
 */
public class Animal {
    Apple myapple = new Apple();

    public void something(){
        myapple.printme();
    }

    public static void main (String[] args){
        Animal a = new Animal();
        a.something();
    }
}
