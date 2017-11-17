package extraUppgifter;

import javax.swing.*;

public class Uppgift10b {

    public static void main(String[] args) {
        int sekunder = Integer.parseInt(JOptionPane.showInputDialog("Ange antal sekunder"));
        double minuter = sekunder / 60.0;
        int minuterHeltal = (int) minuter;
        double timmar = minuter / 60;
        int timmarHeltal = (int) timmar;
        double dagar = timmar / 24;
        int dagarHeltal = (int) dagar;
        double veckor = dagar / 7;
        int veckorHeltal = (int) veckor;
        double ar = veckor / 52;
        int arHeltal = (int) ar;


        String meddelande = "Det är " + minuter + " minuter (" + minuterHeltal + " hela).";
        meddelande += "\nDet är " + timmar + " timmar (" + timmarHeltal + " hela).";
        meddelande += "\nDet är " + dagar + " dagar (" + dagarHeltal + " hela).";
        meddelande += "\nDet är " + veckor + " veckor (" + veckorHeltal + " hela).";
        meddelande += "\nDet är " + ar + " år (" + arHeltal + " hela).";

        System.out.println(meddelande);

        System.exit(0);
    }
}
