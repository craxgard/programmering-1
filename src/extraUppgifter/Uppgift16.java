package extraUppgifter;

import javax.swing.*;

public class Uppgift16 {
    public static void main(String[] args) {
        String text = JOptionPane.showInputDialog("Skriv in en text");
        String characterInput = JOptionPane.showInputDialog("Skriv in ett tecken");

        // Check if characterInput has more than one character
        if (characterInput.length() != 1) {
            characterInput = JOptionPane.showInputDialog("Kom ihåg att du bara får mata in en bokstav!");
        }

        char character = characterInput.charAt(0);

        System.out.println(character + " finns på position " + text.indexOf(character) + ".");

        System.exit(0);
    }
}
