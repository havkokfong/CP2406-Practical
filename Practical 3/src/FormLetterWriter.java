import java.util.Scanner;

public class FormLetterWriter {

    private static String firstName;
    private static String lastName;

    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your First Name: ");
        firstName = input.next();
        System.out.println("Please enter your Last Name: ");
        lastName = input.next();
        displaySalution(firstName);
        displaySalution(firstName, lastName);
    }

    public static void displaySalution(String A) {
        System.out.println("Dear Mr. or Ms. " + A);
        System.out.println("Thank you for your recent order.");
    }

    public static void displaySalution(String A, String B) {
        System.out.println("Dear " + A + " " + B);
        System.out.println("Thank you for your recent order.");
    }
}
