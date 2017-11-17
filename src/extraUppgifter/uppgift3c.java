package extraUppgifter;

import javax.swing.*;

public class uppgift3c {

    public static void main(String[] args) {
        int tal1 = Integer.parseInt(JOptionPane.showInputDialog("Vänligen mata in ett heltal."));
        int tal2 = Integer.parseInt(JOptionPane.showInputDialog("Mata gärna in ett till heltal."));
        int summa = tal1 + tal2;
        int produkt = tal1 * tal2;
        int medelvarde = (tal1 + tal2) / 2;
        double kvot = (double) tal1 / (double) tal2;

        String meddelande = "Du skrev in talet " + tal1 + ".";
        meddelande += "\nDet andra talet du skrev var " + tal2 + ".";
        meddelande += "\nSumman av talen är " + summa + ".";
        meddelande += "\nProdukten av talen är lika med " + produkt + ".";
        meddelande += "\nMedelvärdet av talen är lika med " + medelvarde + ".";
        meddelande += "\n" + tal1 + " dividerat med " + tal2 + " är lika med " + kvot + ".";

        System.out.println(meddelande);

        System.exit(0);
    }

}
