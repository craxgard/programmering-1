package extraUppgifter;

import javax.swing.*;

public class uppgift3a {

    public static void main(String[] args) {
        int tal1 = Integer.parseInt(JOptionPane.showInputDialog("Vänligen mata in ett heltal."));
        String meddelande1 = "Du skrev in talet " + tal1 + ".";
        System.out.println(meddelande1);
    }

}
