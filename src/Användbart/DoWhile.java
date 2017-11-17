package Användbart;

import javax.swing.*;

/**
 * The program calculates the sum of two given numbers
 */
public class DoWhile {

    public static void main(String[] args) {
        int dialogButton;

        do {
            // Ask the user for two numbers
            int number1 = Integer.parseInt(JOptionPane.showInputDialog("Ange ett tal"));
            int number2 = Integer.parseInt(JOptionPane.showInputDialog("Ange ytterligare ett tal"));

            // Calculate the sum of the given numbers
            int sum = number1 + number2;

            // Display the sum to the user
            JOptionPane.showMessageDialog(null, "Summan är " + sum + ".");

            // Ask the user whether they want to calculate another sum or not
            dialogButton = JOptionPane.showConfirmDialog(null, "Vill du göra en till beräkning?",
                    "Välj", JOptionPane.YES_NO_OPTION);
        }
        // If yes, continue the program
        while(dialogButton == 0);

        // If no, exit the program
        System.exit(0);
    }
}