package Inlämningsuppgifter;

import javax.swing.*;
import java.util.Scanner;

/**
 * This program checks if a number input by the user is in a series of numbers input by the user.
 */
public class Kapitel9 {

    public static void main(String[] args) {

        // Ask the user to input a series of numbers. The series needs to have at least one whitespace character between
        // each number.
        String inputNumbers = JOptionPane.showInputDialog("Ange ett valfritt antal heltal. " +
                "Ange minst ett mellanslag mellan varje tal.");

        int chosenNumber = 0;
        boolean cont = false;

        while (!cont) {
            try {
                // Ask the user to input a number to check against the series, and try to parse it into an integer.
                chosenNumber = Integer.parseInt(JOptionPane.showInputDialog("Ange ytterligare ett heltal."));
                // If succesful, set the continue variable to true.
                cont = true;
            } catch (NumberFormatException e) {
                // If the parsing went wrong, display an error message to the user and continue the loop.
                JOptionPane.showMessageDialog(null, "Du får endast ange ett heltal.");
            }
        }

        // Check if the chosen number is in the series of numbers
        boolean hasChosenNumber = findNumber(inputNumbers, chosenNumber);

        String message = "Talet " + chosenNumber + " finns ";

        // If the chosen number doesn't match against the series of numbers, add that to the message displayed
        // to the user.
        if (!hasChosenNumber) {
            message += "inte ";
        }

        message += "med bland de inlästa talen.";

        // Display a message telling the user whether the chosen number matched against the series of numbers or not.
        JOptionPane.showMessageDialog(null, message);

        System.exit(0);
    }

    /**
     * Checks if a number is in a series of numbers
     *
     * @param numbers is the series of numbers
     * @param chosenNumber is the number to check against the series
     * @return whether the number is in the series or not
     */
    private static boolean findNumber(String numbers, int chosenNumber) {
        // Create a {@Scanner} object to check the series of numbers
        Scanner scanner = new Scanner(numbers);

        // While there are still numbers in the series, check if the current number in the series matches the
        // chosen number.
        while(scanner.hasNextInt()) {
            int currentNumber = scanner.nextInt();
            if (currentNumber == chosenNumber) {
                // if the chosen number match, return true.
                return true;
            }
        }
        // If the chosen number doesn't match, return false.
        return false;
    }
}
