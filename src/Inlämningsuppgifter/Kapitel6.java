package Inlämningsuppgifter;

import javax.swing.*;
import java.text.DecimalFormat;

public class Kapitel6 {

    public static void main(String[] args) {

        boolean run = true;

        DecimalFormat formatter = new DecimalFormat("#.##");
        formatter.setMaximumFractionDigits(2);
        formatter.setMinimumFractionDigits(0);

        while(run) {
            // Ask the user to input a temperature
            String input = JOptionPane.showInputDialog("Mata in en temperatur i Fahrenheit mellan 1-100 grader");

            try {
                double temperatureInFahrenheit = Double.parseDouble(input);

                if(temperatureInFahrenheit > 0 && temperatureInFahrenheit < 101) {
                    // If the temperature is valid, then calculate and display the temperature to the user
                    double temperatureInCelsius = ((temperatureInFahrenheit - 32) * 5) / 9;
                    JOptionPane.showMessageDialog(null, "Temperaturen " + formatter.format(temperatureInFahrenheit) +
                            " grader Fahrenheit är lika med " + formatter.format(temperatureInCelsius) + " grader Celsius.");
                } else {
                    // Else, tell the user to input a valid temperature
                    JOptionPane.showMessageDialog(null, "Skriv in en giltig temperatur!" +
                            "\n Tänk på att den endast får vara mellan 1-100 grader");
                }

            } catch(NumberFormatException e) {
                // Tell the user to input a valid temperature
                JOptionPane.showMessageDialog(null, "Skriv in en giltig temperatur!" +
                        "\n Tänk på att den endast får vara mellan 1-100 grader");

            } finally {
                // Ask the user if they want to calculate another temperature
                int selectedOption = JOptionPane.showConfirmDialog(null, "Vill du beräkna en ny temperatur?",
                        "Välj", JOptionPane.YES_NO_OPTION);
                // If not, quit the program
                if(selectedOption == JOptionPane.NO_OPTION) {
                    System.exit(0);
                }
            }

        }
    }
}
