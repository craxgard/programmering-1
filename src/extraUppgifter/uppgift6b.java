package extraUppgifter;

import javax.swing.*;

public class uppgift6b {
    public static void main(String[] args) {
        double tal = Double.parseDouble(JOptionPane.showInputDialog("Skriv in ett tal!"));
        double areaKvadrat = tal * tal;
        double omkretsKvadrat = tal * 4;

        System.out.println("En kvadrat med sidan " + tal + " får omkretsen " + omkretsKvadrat + " och arean " + areaKvadrat + ".");

        double areaCirkel = tal * tal * 3.14;
        double omkretsCirkel = (tal + tal) * 3.14;

        System.out.println("En cirkel med radien " + tal + " får omkretsen " + omkretsCirkel + " och arean " + areaCirkel + ".");

        System.exit(0);
    }
}
