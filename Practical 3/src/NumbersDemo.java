import java.awt.*;

public class NumbersDemo {
    public static void main(String[] args){
        int valueOne = 5;
        int valueTwo = 10;
        displayTwiceTheNumber(valueOne, valueTwo);
        displayNumberPlusFive(valueOne, valueTwo);
        displayNumberSquared(valueOne, valueTwo);
    }

    static void displayTwiceTheNumber(int numOne, int numTwo){
        System.out.println("Display Number Twice ");
        System.out.println(numOne + " " + numOne);
        System.out.println(numTwo + " " + numTwo);
    }

    static void displayNumberPlusFive(int numOne, int numTwo){
        System.out.println("Display Number Plus Five ");
        System.out.println(numOne + 5);
        System.out.println(numTwo + 5);
    }

    static void displayNumberSquared(int numOne, int numTwo){
        System.out.println("Display Number Squared");
        System.out.println(numOne * numOne);
        System.out.println(numTwo * numTwo);
    }

}
