import javax.swing.text.Style;
import java.util.ArrayList;
import java.util.Scanner;

public class Billing {
    private static int bill;
    private static int value;
    private static double price;
    private static double total;
    private static double tax;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of your bill: ");
        bill = input.nextInt();
        value = 0;
        ArrayList<Double> billlist = new ArrayList<Double>();
        while (value < bill){
            System.out.println("Please enter the price of your item: ");
            price = input.nextInt();
            value += 1;
            billlist.add(price);
        }
        if (bill == 1)
        computingBill(billlist.get(0));
        computingBill(billlist.get(0), billlist.get(1));
        computingBill(billlist.get(0), billlist.get(1), billlist.get(2));

    }

    public static double computingBill(double A){
        tax = (A * 8) / 100;
        total = A + tax;
        System.out.println("The total bill is: " + total);
        return total;
    }

    public static int computingBill(double A, double B){

    }

    public static int computingBill(double A, double B, double C){

    }*/
}
