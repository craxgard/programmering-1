package extraUppgifter;

import javax.swing.*;

public class Uppgift11a {

    public static void main(String[] args) {
        double ar = Double.parseDouble(JOptionPane.showInputDialog("Ange antal år"));
        int dagar = (int) ar * 365;
        int timmar = dagar * 24;
        int minuter = timmar * 60;

        String meddelande = "Det är " + dagar + " dagar.";
        meddelande += "\nDet är " + timmar + " timmar.";
        meddelande += "\nDet är " + minuter + " minuter.";

        System.out.println(meddelande);

        System.exit(0);
    }
}
