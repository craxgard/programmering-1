package extraUppgifter;

import javax.swing.*;

public class Uppgift13 {

    public static void main(String[] args) {
            String bokstavCheck = JOptionPane.showInputDialog("Mata in en bokstav");

            // kolla om bokstavCheck har mer än en bokstav
            if (bokstavCheck.length() != 1) {
                bokstavCheck = JOptionPane.showInputDialog("Kom ihåg att du bara får mata in en bokstav!");
            }

            System.out.println(hamtaPlatsIAlfabetet(bokstavCheck.charAt(0)));

            System.exit(0);
        }

    public static int hamtaPlatsIAlfabetet(char bokstav) {
        int bokstavNummer = (int) bokstav;
        int gemen = 96;
        int versal = 64;

        if (bokstavNummer <= 122 && bokstavNummer >= 97) {
            bokstavNummer -= gemen;
        } else if (bokstavNummer <= 90 && bokstavNummer >= 65) {
            bokstavNummer -= versal;
        }
        return bokstavNummer;
    }
}
