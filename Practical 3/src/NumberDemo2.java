import java.util.Scanner;

public class NumberDemo2 {
    public static void main(String[] args){
        Scanner inputOne = new Scanner(System.in);
        Scanner inputTwo = new Scanner(System.in);
        System.out.println("Please enter your first number: ");
        int valueOne = inputOne.nextInt();
        System.out.println("Please enter you second number");
        int valueTwo = inputTwo.nextInt();
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
