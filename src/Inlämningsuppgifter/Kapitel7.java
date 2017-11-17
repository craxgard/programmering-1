package Inlämningsuppgifter;
import javax.swing.*;
import java.text.*;

public class Kapitel7 {
    public static void main(String[] args) {
        boolean run = true;
        double sideOfSquare = 0;



        while (run){
            try{
                String input = JOptionPane.showInputDialog("Ange sida som måste vara >0");
                sideOfSquare = Double.parseDouble(input);
                if (sideOfSquare > 0)
                    run = false; // inläsningen ok, bryt while-satsen
                else
                    JOptionPane.showMessageDialog(null, "Sidan är ej positiv \nSlå in ny sida");
            }

            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Inläsningen misslyckades, försök igen!");
                run = true; // fortsätt inläsningen
            }
        }

        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2); // max 2 decimaler
        nf.setMinimumFractionDigits(2); // min 2 decimaler

        JOptionPane.showMessageDialog(null, "Arean är " + nf.format(Math.pow(sideOfSquare, 2))
                + " kvm\nOmkretsen är " + nf.format(sideOfSquare * 4) + " m");

        System.exit(0);
    }
}

