import java.util.Scanner;

public class Percentages2 {
    public static void main(String[] agrs){
        Scanner inputOne = new Scanner(System.in);
        Scanner inputTwo = new Scanner(System.in);
        System.out.println("Please Enter Your First Number: ");
        Double valueOne = inputOne.nextDouble();
        System.out.println("PLease Enter Your Second Number: ");
        Double valueTwo = inputTwo.nextDouble();
        computePercent(valueOne, valueTwo);
    }

    static void computePercent(Double numOne, Double numTwo){
        Double percentages = (numOne * numTwo)/100;
        System.out.println(numOne + " is " + percentages + " percent of " + numTwo);
    }
}
