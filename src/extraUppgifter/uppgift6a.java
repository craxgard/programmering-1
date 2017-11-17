package extraUppgifter;

import javax.swing.*;

public class uppgift6a {
    public static void main(String[] args) {
        double tal = Double.parseDouble(JOptionPane.showInputDialog("Skriv in ett tal!"));
        double areaKvadrat = tal * tal;
        double omkretsKvadrat = tal * 4;

        System.out.println("En kvadrat med sidan " + tal + " får omkretsen " + omkretsKvadrat + " och arean " + areaKvadrat + ".");

        System.exit(0);
    }
}
