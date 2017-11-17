package Inlämningsuppgifter;

import javax.swing.*;

public class Kapitel5 {

    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i < 100; i += 3) {
            sum += i;
        }

        JOptionPane.showMessageDialog(null, "Summan av serien 0, 3, 6, ..., 93, 96, 99: " + sum + ".");

        System.exit(0);
    }
}
