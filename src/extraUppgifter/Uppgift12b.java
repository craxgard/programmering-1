package extraUppgifter;

import javax.swing.*;

public class Uppgift12b {
    public static void main(String[] args) {
        int unicodeNummer = Integer.parseInt(JOptionPane.showInputDialog("Skriv in ett tal!"));
        int unicodeNummerFore = unicodeNummer - 1;
        int unicodeNummerEfter = unicodeNummer + 1;

        String symbol1 = new String(Character.toChars(unicodeNummer));
        String symbol2 = new String (Character.toChars(unicodeNummerFore));
        String symbol3 = new String(Character.toChars(unicodeNummerEfter));

        String meddelande = "Nummer " + unicodeNummer + " motsvarar tecknet " + symbol1 + " i UNICODE-tabellen.";
        meddelande += "\nNummer " + unicodeNummerFore + " motsvarar tecknet " + symbol2 + " i UNICODE-tabellen.";
        meddelande += "\nNummer " + unicodeNummerEfter + " motsvarar tecknet " + symbol3 + " i UNICODE-tabellen.";

        System.out.println(meddelande);
    }
}
