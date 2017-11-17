package extraUppgifter;

import javax.swing.*;

public class uppgift6c {
    public static void main(String[] args) {
        double tal1 = Double.parseDouble(JOptionPane.showInputDialog("Skriv in ett tal!"));
        double areaKvadrat = Math.pow(tal1, 2);
        double omkretsKvadrat = tal1 * 4;

        System.out.println("En kvadrat med sidan " + tal1 + " får omkretsen " + omkretsKvadrat + " och arean "
                + areaKvadrat + ".");

        double areaCirkel = Math.pow(tal1, 2) * Math.PI;
        double omkretsCirkel = tal1 * 2 * Math.PI;

        System.out.println("En cirkel med radien " + tal1 + " får omkretsen " + omkretsCirkel + " och arean " +
                areaCirkel + ".");

        double tal2 = Double.parseDouble(JOptionPane.showInputDialog("Skriv gärna in ett till tal!"));
        double tal3 = Double.parseDouble(JOptionPane.showInputDialog("Och ännu ett till!"));

        double areaRektangel = tal2 * tal3;
        double omkretsRektangel = tal2 * 2 + tal3 * 2;

        System.out.println("En rektangel med sidorna " + tal2 + " cm och " + tal3 + " cm får omkretsen " +
                omkretsRektangel + " cm samt arean " + areaRektangel + " cm.");

        System.exit(0);
    }
}
