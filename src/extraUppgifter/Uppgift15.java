package extraUppgifter;

import javax.swing.*;

public class Uppgift15 {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Skriv in ditt namn");
        String[] names = name.split("\\s");

        String message = "Du heter " + name + ".";
        message += "\nDitt förnamn är " + names[0] + ".";
        message += "\nDitt efternamn är " + names[1] + ".";
        message += "\nDitt förnamn börjar på " + names[0].charAt(0) + ".";
        message += "\nDitt efternamn börjar på " + names[1].charAt(0) + ".";

        System.out.println(message);

        System.exit(0);
    }
}
