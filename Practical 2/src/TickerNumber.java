import javax.swing.*;

public class TickerNumber {
    public static void main(String[] agrs){

        String tickInput;
        int tickNumber;
        tickInput = JOptionPane.showInputDialog(null, "Please enter your ticket number:",
                "Ticker Number", JOptionPane.INFORMATION_MESSAGE);

        tickNumber = Integer.parseInt(tickInput);
        int checkNum1 = tickNumber / 10;
        int muCheckNum1 = tickNumber % 10;
        int checkNum2 = checkNum1 % 7;
        if (checkNum2 == muCheckNum1){
            JOptionPane.showMessageDialog(null, "This ticket is valid");
        }
        else{
            JOptionPane.showMessageDialog(null,"This is invalid");
        }
    }
}
