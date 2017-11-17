package extraUppgifter;

import javax.swing.*;

public class Uppgift14a {

        public static void main(String[] args) {

            String input = JOptionPane.showInputDialog("Mata in en sträng.");
            int length = input.length();

            String message = "Strängens längd är " + length + " tecken.";
            message += "\nDet första tecknet i strängen är " + input.charAt(0) + ".";
            message += "\nDet sista tecknet är " + input.charAt(length - 1) + ".";

            System.out.println(message);

            System.exit(0);
        }
}
