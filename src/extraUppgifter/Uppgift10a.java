package extraUppgifter;

import javax.swing.*;

public class Uppgift10a {

    public static void main(String[] args) {
        int sekunder = Integer.parseInt(JOptionPane.showInputDialog("Ange antal sekunder"));
        double minuter = sekunder / 60.0;
        int minuterHeltal = (int) minuter;
        double timmar = minuter / 60;
        int timmarHeltal = (int) timmar;
        double dagar = timmar / 24;
        int dagarHeltal = (int) dagar;

        String meddelande = "Det är " + minuter + " minuter (" + minuterHeltal + " hela).";
        meddelande += "\nDet är " + timmar + " timmar (" + timmarHeltal + " hela).";
        meddelande += "\nDet är " + dagar + " dagar (" + dagarHeltal + " hela).";

        System.out.println(meddelande);

        System.exit(0);
    }
}
