package extraUppgifter;

import javax.swing.*;

public class Uppgift17 {
    // A variable which contains the entire alphabet
    private final static String ALPHABET = "abcdefghijklmnopqrstuvxyzåäö";

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Skriv in en bokstav").toLowerCase();
        int charNumber = ALPHABET.indexOf(input.charAt(0));

        String message = "Bokstaven " + input.charAt(0) + " har plats " + charNumber + ". Den " +
                "ligger mellan " + ALPHABET.charAt(charNumber - 1) + " och " + ALPHABET.charAt(charNumber + 1) + ".";

        System.out.println(message);

        System.exit(0);

    }

}
