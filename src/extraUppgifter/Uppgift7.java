package extraUppgifter;

import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class Uppgift7 {

    public static void main (String[] args) {
        String namn = JOptionPane.showInputDialog("Välkommen!", "Skriv in ditt namn");
        int alder = Integer.parseInt(JOptionPane.showInputDialog(namn + ", var vänlig ange din ålder"));
        double langd = Double.parseDouble(JOptionPane.showInputDialog("Hur lång är du i cm?"));
        double vikt = Double.parseDouble(JOptionPane.showInputDialog("Hur mycket väger du, " + namn + "?"));
        int skostorlek = Integer.parseInt(JOptionPane.showInputDialog("Och din skostorlek?"));
        int lyckotal = Integer.parseInt(JOptionPane.showInputDialog("Mata in ditt lyckotal också!"));
        int telefonnummer = Integer.parseInt(JOptionPane.showInputDialog(null, "Och telefonnummer, tack!", "Inget bindesstreck eller mellanslag, bara siffror", JOptionPane.WARNING_MESSAGE));

        String sammanfattning = "Ditt namn är " + namn + ".";
        sammanfattning += "\nDu är " + alder + " år gammal.";
        sammanfattning += "\nDu är " + langd + " cm lång.";
        sammanfattning += "\nDu väger " + vikt + " kg.";
        sammanfattning += "\nDin skostorlek är " + skostorlek + ".";
        sammanfattning += "\nDitt lyckotal är " + lyckotal + ".";
        sammanfattning += "\nDitt telefonnummer är " + telefonnummer + ".";
        sammanfattning += "\nHa en bra dag, " + namn + "!";

        System.out.println(sammanfattning);

        System.exit(0);
    }
}
