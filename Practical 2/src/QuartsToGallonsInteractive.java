import javax.swing.*;
import java.util.Scanner;

public class QuartsToGallonsInteractive {
    public static void main(String[] args){
        int NUMBEROFQUART = 5;
        String userinput;
        int NUMBEROFQUARTPERJOB;
        userinput = JOptionPane.showInputDialog(null,"Please enter the amount of " +
                "quarts:","Purchase", JOptionPane.INFORMATION_MESSAGE);
        NUMBEROFQUARTPERJOB = Integer.parseInt(userinput);
        int totalGallon = NUMBEROFQUARTPERJOB / NUMBEROFQUART;
        int totalGuarts = NUMBEROFQUARTPERJOB % NUMBEROFQUART;
        JOptionPane.showMessageDialog(null,"This job needs" + totalGallon + " gallons " + totalGuarts + " quarts to finish");
    }
}
