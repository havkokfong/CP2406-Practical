public class Percentages {
    public static void main(String[] agrs){
        Double valueOne = 8.00;
        Double valueTwo = 3.00;
        computePercent(valueOne, valueTwo);
    }

    static void computePercent(Double numOne, Double numTwo){
        Double percentages = (numOne * numTwo)/100;
        System.out.println(numOne + " is " + percentages + " percent of " + numTwo);
    }
}
