package extraUppgifter;

import javax.swing.*;

public class Uppgift18c {
    public static void main(String[] args) {
        String word1 = JOptionPane.showInputDialog("Skriv in ett ord");
        String word2 = JOptionPane.showInputDialog("Skriv in ett ord till");
        String sentence = JOptionPane.showInputDialog("Skriv en mening med orden \"" + word1 + "\" och \""
                + word2 + "\" i");

        String newSentence;
        if (sentence.indexOf(word1) < sentence.indexOf(word2)) {
            String[] parts = sentence.split(word1);
            newSentence = parts[0] + word2 + parts[1];
            parts = newSentence.split(word2);
            newSentence = parts[0] + word1 + parts[1];
        } else {
            String[] parts = sentence.split(word2);
            newSentence = parts[0] + word1 + parts[1];
            parts = newSentence.split(word1);
            newSentence = parts[0] + word2 + parts[1];
        }
        System.out.println(newSentence);
    }
}
