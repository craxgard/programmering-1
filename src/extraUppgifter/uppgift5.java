package extraUppgifter;

import javax.swing.*;

public class uppgift5 {
    public static void main(String[] args) {
        int antalKaffe = Integer.parseInt(JOptionPane.showInputDialog("Hur många kaffe vill du köpa?"));
        int antalRing = Integer.parseInt(JOptionPane.showInputDialog("Hur många ringar vill du köpa?"));
        int antalGodis = Integer.parseInt(JOptionPane.showInputDialog("Hur många godispåsar vill du köpa?"));

        int prisPerKaffe = 24;
        int prisPerRing = 949;
        int prisPerGodis = 10;

        int summaKaffe = antalKaffe * prisPerKaffe;
        int summaRing = antalRing * prisPerRing;
        int summaGodis = antalGodis * prisPerGodis;

        int totalsumma = summaKaffe + summaRing + summaGodis;

        String meddelande = "Kaffet kostar " + summaKaffe + " kr.";
        if (antalRing == 1) {
            meddelande += "\nRingen kostar " + summaRing + " kr.";
        }
        else {
            meddelande += "\nRingarna kostar " + summaRing + " kr.";
        }
        meddelande += "\nGodiset kostar " + summaGodis + " kr.";
        meddelande += "\n" + "\nTotalt gick allt på " + totalsumma + " kr.";

        System.out.println(meddelande);

        System.exit(0);
    }

}
