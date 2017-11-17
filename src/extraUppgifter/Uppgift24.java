package extraUppgifter;

import javax.swing.*;

public class Uppgift24 {

    public static void main(String[] args) {

        int numberOne = Integer.parseInt(JOptionPane.showInputDialog("Mata in ett heltal."));
        int numberTwo = Integer.parseInt(JOptionPane.showInputDialog("Mata in ett heltal."));
        int numberThree = Integer.parseInt(JOptionPane.showInputDialog("Mata in ett heltal."));

        if (numberOne == numberThree) {
            System.out.println("Det första och det tredje talet är samma tal.");
        }

        if (numberOne == numberTwo && numberOne == numberThree) {
            System.out.println("Alla talen är samma tal.");
        } else if (numberOne != numberTwo && numberTwo != numberThree && numberThree != numberOne){
            System.out.println("Alla talen är olika tal.");
        }

        if (numberOne > 0 && numberTwo > 0 && numberThree > 0) {

        }
    }
}
