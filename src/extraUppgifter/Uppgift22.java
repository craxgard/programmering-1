package extraUppgifter;

import Användbart.Keyboard;

import java.util.Arrays;

public class Uppgift22 {

    public static void main(String[] args) {
        // A list of decimal numbers
        double[] decimalNumbers = new double[3];

        System.out.println("Mata in tre decimaltal:");

        for (int i = 0; i < 3; i++) {
            decimalNumbers[i] = Keyboard.readDouble();
        }

        double sum = Arrays.stream(decimalNumbers).sum();
        double average = sum / decimalNumbers.length;

        String message = "Summan är " + sum + ".";
        message += "\nMedelvärdet är " + average + ".";

        System.out.println(message);

        System.exit(0);
    }
}
