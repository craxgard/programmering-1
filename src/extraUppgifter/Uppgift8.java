package extraUppgifter;

import javax.swing.*;

public class Uppgift8 {

    public static void main(String[] args) {
        int alder = Integer.parseInt(JOptionPane.showInputDialog("Ange din ålder i hela år."));
        String namn = JOptionPane.showInputDialog("Ange ditt namn.");
        double langd = Double.parseDouble(JOptionPane.showInputDialog("Ange din längd i meter med decimaler, och punkt istället för komma."));
        String konString = JOptionPane.showInputDialog("Ange ditt kön, m, k eller a för annan.");
        char kon = konString.charAt(0);

        String sammanfattning = "Ditt namn är " + namn + "";
        sammanfattning += "\nKön: " + kon;
        sammanfattning += "\nÅlder: " + alder + " år";
        sammanfattning += "\nLängd: " + langd + " m";

        System.out.println(sammanfattning);

        System.exit(0);

    }
}
