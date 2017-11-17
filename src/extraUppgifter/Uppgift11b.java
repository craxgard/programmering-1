package extraUppgifter;

import javax.swing.*;

public class Uppgift11b {

    public static void main(String[] args) {
        double ar = Double.parseDouble(JOptionPane.showInputDialog("Ange antal år"));
        int dagar = (int) ar * 365;
        int timmar = dagar * 24;
        int minuter = timmar * 60;
        double sekel = ar / 100;
        int sekelHela = (int) sekel;
        double millenium = sekel / 10;
        int milleniumHela = (int) millenium;

        String meddelande = "Det är " + dagar + " dagar.";
        meddelande += "\nDet är " + timmar + " timmar.";
        meddelande += "\nDet är " + minuter + " minuter.";
        meddelande += "\nDet är " + sekel + " sekel. (" + sekelHela + " hela).";
        meddelande += "\nDet är " + millenium + " millenium (" + milleniumHela + " hela).";

        System.out.println(meddelande);

        System.exit(0);
    }
}
