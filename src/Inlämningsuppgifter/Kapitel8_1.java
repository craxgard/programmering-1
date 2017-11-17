package Inlämningsuppgifter;

import javax.swing.*;
import java.text.NumberFormat;

public class Kapitel8_1 {

    public static void main(String[] args) {

        boolean run = true;
        // The radius of the half circle
        double radius = 0;

        while (run) {
            // Ask the user to input a radius
            String input = JOptionPane.showInputDialog("Skriv in en radie för att beräkna arean av en halvcirkel." +
                    "\nRadien måste vara positiv.");

            try {
                // Parse the input into a double
                radius = Double.parseDouble(input);

                // If the radius is valid, break the while loop
                if (radius > 0) {
                    run = false;
                } else { // Continue the loop
                    JOptionPane.showMessageDialog(null, "Radien var inte positiv. Skriv in en ny radie.");
                }
            } catch (NumberFormatException|NullPointerException e) { //If the parsing goes wrong, continue the loop
                JOptionPane.showMessageDialog(null, "Inläsningen misslyckades, försök igen!");
            }
        }

        // Create an {@link NumberFormat} formatter
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2); // maximum 2 decimals
        nf.setMinimumFractionDigits(0); // minimum 0 decimals

        // Create the message that will be displayed to the user
        String message = "Halvcirkelns area är " + nf.format(AreaOfHalfCircle.calculateAreaOfHalfCircle(radius)) + ".";

        // Display the message to the user
        JOptionPane.showMessageDialog(null, message);

        System.exit(0);
    }
}