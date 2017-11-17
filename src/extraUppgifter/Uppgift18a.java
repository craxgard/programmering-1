package extraUppgifter;

import javax.swing.*;

public class Uppgift18a {
    public static void main(String[] args) {
        String word = JOptionPane.showInputDialog("Skriv in ett ord");
        String sentence = JOptionPane.showInputDialog("Skriv en mening med ordet \"" + word + "\" i");

        String[] parts = sentence.split(word);
        String newSentence = parts[0] + "ost" + parts[1];

        System.out.println(newSentence);
    }
}
