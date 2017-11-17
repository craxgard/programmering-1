package extraUppgifter;

import javax.swing.*;

public class Uppgift12a {
    public static void main(String[] args) {
        int unicodeNummer = Integer.parseInt(JOptionPane.showInputDialog("Skriv in ett tal!"));
        String symbol1 = new String(Character.toChars(unicodeNummer));

        String meddelande = "Nummer " + unicodeNummer + " motsvarar tecknet " + symbol1 + " i UNICODE-tabellen.";

        System.out.println(meddelande);
    }
}
