package extraUppgifter;

import Användbart.Keyboard;

import javax.swing.*;

public class Uppgift20 {

    public static void main(String[] args) {
        int[] array = new int[4];

        JOptionPane.showMessageDialog(null, "Var god och fyll i värden i ett fält i konsolen");

        for (int i = 0; i < 3; i++) {
            System.out.println("Vilket index, 0 till 3:");
            int currentIndex = Keyboard.readInt();
            System.out.println("Vilket värde:");
            array[currentIndex] = Keyboard.readInt();
            System.out.println("Fältet innehåller nu värdena " + array[0] + ", " + array[1] + ", " + array[2] + " och "
                    + array[3]);
        }

        System.exit(0);
    }
}
