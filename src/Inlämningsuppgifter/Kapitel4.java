package Inlämningsuppgifter;

import javax.swing.*;

/**
 * This program calculates the ticket price for a bus ride.
 */
public class Kapitel4 {

    // The price for people between 15 & 65 years old
    private final static int PRICE = 10;
    // The price for people of any other age
    private final static int REDUCED_PRICE = 5;

    public static void main(String[] args) {

        // Ask for the customer's age
        int age = Integer.parseInt(JOptionPane.showInputDialog("Ange din ålder:"));

        // Ask the user whether they want to run the code using the &&-operator or ||-operator
        int answer = JOptionPane.showConfirmDialog(null, "Vill du använda &&-operatorn för att räkna" +
                " ut priset? (Vid svar nej används ||-operatorn.)");

        // The message displayed to the customer
        String priceMessage = "Din bussresa kostar ";

        switch (answer) {
            // If the customer wanted to use the &&-operator, then this block gets executed
            case 0:
                // Calculates the price based on the customer's age, and adds it to the price message
                priceMessage += useAndOperator(age) + " kr.";
                break;
            // If the customer wanted to use the ||-operator, then this block gets executed
            case 1:
                // Calculates the price based on the customer's age, and adds it to the price message
                priceMessage += useOrOperator(age) + " kr.";
                break;
            // Otherwise, quit the program
            default:
                System.exit(0);
        }

        // Displays the price message
        System.out.println(priceMessage);

        // Quit running the program once we've run all the code
        System.exit(0);
    }

    /**
     * Calculates the ticket price using the &&-operator
     *
     * @param age is the age of the customer
     * @return ticket price
     */
    private static int useAndOperator(int age) {
        if (age > 14 && age < 66) {
            // If the customer is between 15 and 65 years old, the return the normal price
            return PRICE;
        } else {
            // Otherwise, return the reduced price
            return REDUCED_PRICE;
        }

    }

    /**
     * Calculates the ticket price using the ||-operator
     *
     * @param age is the age of the customer
     * @return ticket price
     */
    private static int useOrOperator(int age) {
        if (age < 15 || age > 65) {
            // If the customer is either less than 15 years old or older than 65 years old, then return the reduced price
            return REDUCED_PRICE;
        } else {
            // Otherwise, return the normal price
            return PRICE;
        }
    }
}
