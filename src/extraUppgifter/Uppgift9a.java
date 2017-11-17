package extraUppgifter;

import javax.swing.*;

public class Uppgift9a {

    public static void main(String[] args) {
        String name1 = JOptionPane.showInputDialog("Skriv in ett namn");
        String name2 = JOptionPane.showInputDialog("Och ett till");
        String name3 = JOptionPane.showInputDialog("Det här är det sista namnet, jag lovar");

        String story = "Det var en gån en person, som hette " + name1 + ".";
        story += "\nDenna person hade en hund som hette " + name2 + "och hundens favoritleksak kallades för " + name3 + ".";

        System.out.println(story);

        System.exit(0);
    }
}
