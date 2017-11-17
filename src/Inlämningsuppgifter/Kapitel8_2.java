package Inlämningsuppgifter;

import javax.swing.*;

/**
 * This program converts temperatures from Celsius to Fahrenheit or vice versa.
 */
public class Kapitel8_2 {

    private static final int CELSIUS_TO_FAHRENHEIT = 0;
    private static final int FAHRENHEIT_TO_CELSIUS = 1;
    private static final int NOT_VALID = -1;

    private static boolean run = true;

    public static void main(String[] args) {

        double temperature;

        while (run) {
            Object[] conversionOptions = {"Celsius till Fahrenheit", "Fahrenheit till Celsius"};

            // Figure out if the user wants to convert from Celsius -> Fahrenheit or vice versa
            int selectedOption = JOptionPane.showOptionDialog(null, "Vill du omvandla en temperatur " +
                            "från Fahrenheit till Celsius eller från Celsius till Fahrenheit?", "Temperatur",
                    JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, conversionOptions,
                    conversionOptions[0]);

            // Ask the user to input a temperature to convert
            String inputTemperature = JOptionPane.showInputDialog("Mata in temperaturen.");

            try {
                // Try to parse the input temperature from a String to a double
                temperature = Double.parseDouble(inputTemperature);

                switch (selectedOption) {
                    case CELSIUS_TO_FAHRENHEIT: // User chose to convert from Celsius to Fahrenheit
                        temperature = convertCelsiusToFahrenheit(temperature);
                        if (temperature == NOT_VALID) { // If the temperature isn't valid, display an error message to the user
                            JOptionPane.showMessageDialog(null, "Du får endast mata in en temperatur " +
                                    "mellan 0-40 grader om du ska omvandla från Celsius.");
                        } else {
                            displayConvertedTemperature(inputTemperature, temperature, selectedOption);
                        }
                        break;
                    case FAHRENHEIT_TO_CELSIUS: // User chose to convert from Fahrenheit to Celsius
                        temperature = convertFahrenheitToCelsius(temperature);
                        if (temperature == NOT_VALID) { // If the temperature isn't valid, display an error message to the user
                            JOptionPane.showMessageDialog(null, "Du får endast mata in en temperatur " +
                                    "mellan 0-100 grader om du ska omvandla från Fahrenheit.");
                        } else {
                            displayConvertedTemperature(inputTemperature, temperature, selectedOption);
                        }
                        break;
                    default: // The user closed the option window
                        break;
                }
            } catch (NumberFormatException | NullPointerException e) { //If the parsing goes wrong, continue the loop
                JOptionPane.showMessageDialog(null, "Inläsningen misslyckades, försök igen!");
            }

            // Ask the user if they want to convert another temperature
            int continueOption = JOptionPane.showConfirmDialog(null, "Vill du beräkna en ny temperatur?",
                    "Välj", JOptionPane.YES_NO_OPTION);

            switch (continueOption) {
                case JOptionPane.YES_OPTION:
                    break;
                case JOptionPane.NO_OPTION:
                    run = false;
                    break;
                default: // The user closed the confirm window
                    run = false;
                    break;
            }
        }
        System.exit(0);
    }

    /**
     * Converts the temperature from Celsius to Fahrenheit.
     *
     * @param temperatureInCelsius is the temperature in Celsius
     * @return temperature in Fahrenheit
     */
    private static double convertCelsiusToFahrenheit(double temperatureInCelsius) {
        if (temperatureInCelsius >= 0 && temperatureInCelsius <= 40) {
            return 1.8 * temperatureInCelsius + 32;
        } else { // This code is executed if the input temperature isn't valid
            return NOT_VALID;
        }
    }

    /**
     * Converts the temperature from Fahrenheit to Celsius.
     *
     * @param temperatureInFahrenheit is the temperature in Fahrenheit
     * @return temperature in Celsius
     */
    private static double convertFahrenheitToCelsius(double temperatureInFahrenheit) {
        if (temperatureInFahrenheit >= 0 && temperatureInFahrenheit <= 100) {
            return (temperatureInFahrenheit - 32) / 1.8;
        } else { // This code is executed if the input temperature isn't valid
            return NOT_VALID;
        }
    }

    /**
     * Displays the converted temperature to the user.
     *
     * @param originalTemperature  is the original temperature input by the user
     * @param convertedTemperature is the converted temperature
     * @param conversionOption     is whether it was converted from Celsius to Fahrenheit or vice versa
     */
    private static void displayConvertedTemperature(String originalTemperature, double convertedTemperature, int conversionOption) {
        String message = "Temperaturen " + originalTemperature + " grader i ";
        if (conversionOption == CELSIUS_TO_FAHRENHEIT) {
            message += "Celsius är " + convertedTemperature + " grader i Fahrenheit.";
        } else {
            message += "Fahrenheit är " + convertedTemperature + " grader i Celsius.";
        }
        JOptionPane.showMessageDialog(null, message);
    }

}