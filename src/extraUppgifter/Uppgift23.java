package extraUppgifter;

import javax.swing.*;
import javax.swing.plaf.synth.SynthEditorPaneUI;

public class Uppgift23 {

    public static void main(String[] args) {

        boolean run = true;

        while (run) {

            int number = Integer.parseInt(JOptionPane.showInputDialog("Mata in ett heltal"));

            if (number == 13) {
                System.out.println("Talet är tretton.");
            }

            if (number < 5) {
                System.out.println("Talet är mindre än fem");
            }

            if (number < 0) {
                System.out.println("Talet är negativit.");
            }

            if (number >= 8) {
                System.out.println("Talet är större än eller lika med åtta.");
            }

            if (number == 10 || number == 20) {
                System.out.println("Talet är tio eller tjugo.");
            }

            if (number > 0 && number < 7) {
                System.out.println("Talet är positivt, men inte större än sex.");
            }

            if (number != 11) {
                System.out.println("Talet är inte elva.");
            }

            if (number != 2 && number != 4) {
                System.out.println("Talet är inte två eller fyra.");
            }

            if (number > 9 && number < 21) {
                System.out.println("Talet ligger mellan tio och tjugo.");
            }

            if (number > 19 && number != 25 && number < 31) {
                System.out.println("Talet ligger mellan tjugo och trettio, men är inte tjugofem.");
            }

            if (number > 9 && number < 21 && (number % 2) != 0) {
                System.out.println("Talet är ett udda tal mellan tio och tjugo.");
            }

            if (number * number == 100) {
                System.out.println("Talet gånger sig självt är hundra.");
            }

            int selectedOption = JOptionPane.showConfirmDialog(null, "Vill du mata in fler tal?", "Välj",
                    JOptionPane.YES_NO_OPTION);

            if (selectedOption == JOptionPane.NO_OPTION) {
                run = false;
            }

        }
        System.exit(0);
    }
}