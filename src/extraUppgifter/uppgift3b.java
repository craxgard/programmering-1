package extraUppgifter;

import javax.swing.*;

public class uppgift3b {

    public static void main(String[] args) {
        int tal1 = Integer.parseInt(JOptionPane.showInputDialog("Vänligen mata in ett heltal."));
        int tal2 = Integer.parseInt(JOptionPane.showInputDialog("Mata gärna in ett till heltal."));
        int summa = tal1 + tal2;
        String meddelande = "Du skrev in talet " + tal1 + ".";
        meddelande += "\nDet andra talet du skrev var " + tal2 + ".";
        meddelande += "\nSumman av talen är " + summa + ".";

        System.out.println(meddelande);
    }

}
