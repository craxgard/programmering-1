package extraUppgifter;

import javax.swing.*;

public class Uppgift28 {

    private static final int MALE = 0;
    private static final int FEMALE = 1;

    public static void main(String[] args) {

        Object[] genderOptions = {"Man", "Kvinna"};

        int age = Integer.parseInt(JOptionPane.showInputDialog("Hur gammal är du?"));
        int gender = JOptionPane.showOptionDialog(null, "Är du man eller kvinna", "Kön",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, genderOptions, genderOptions[0]);
        String name = JOptionPane.showInputDialog("Vad heter du?");
        int salary = Integer.parseInt(JOptionPane.showInputDialog("Hur mycket begär du i lön i kr?"));

        if (age < 15) {
            JOptionPane.showMessageDialog(null, "Du fick tyvärr inte jobbet.");
        } else if (salary > 35000) {
            JOptionPane.showMessageDialog(null, "Du fick tyvärr inte jobbet.");
        } else if ("Yngve".equals(name) || "Ola".equals(name)) {
            JOptionPane.showMessageDialog(null, "Du får jobbet med en lön på 30 000 kr.");
        } else if (gender == MALE && salary < 13000) {
            JOptionPane.showMessageDialog(null, "Du får jobbet med begärd lön på " + salary + " kr.");
        } else if (gender == FEMALE && age > 24 && age < 36 && salary > 16000) {
            JOptionPane.showMessageDialog(null, "Du fick tyvärr inte jobbet.");
        } else if (age < 40 && salary > 28000) {
            if (gender == MALE) {
                JOptionPane.showMessageDialog(null, "Du får jobbet med en lön på 12 000 kr.");
            } else {
                JOptionPane.showMessageDialog(null, "Du får jobbet med en lön på 13 000 kr.");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Du får jobbet med en lön på " + salary * 0.80 + " kr.");
        }
        System.exit(0);
    }
}
