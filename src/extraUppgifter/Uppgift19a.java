package extraUppgifter;

import javax.swing.*;

public class Uppgift19a {

    public static void main(String[] args) {
        // An array that contains the weights of 14 cows
        int[] weightsOfCows = {
                378, 638, 548, 462, 523, 414, 715,
                635, 537, 549, 550, 456, 610, 647
        };

        // Allow the user to input the index for the cow that they want info on
        int chosenCow = Integer.parseInt(JOptionPane.showInputDialog("Ange ko-index, 0 till 13"));

        // Display the cow's weight to the user
        JOptionPane.showMessageDialog(null, "Ko med index " + chosenCow + " väger " +
                weightsOfCows[chosenCow] + " kg.");

        System.exit(0);
    }
}
