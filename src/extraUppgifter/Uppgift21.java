package extraUppgifter;

import Användbart.Keyboard;

public class Uppgift21 {

    public static void main(String[] args) {
        // A list of names
        String[] names = {
                "Hanna", "Lisette", "Elin"
        };

        // A list of ages
        int[] ages = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Hur gammal är " + names[i] + "?");
            ages[i] = Keyboard.readInt();
        }

        System.out.println(names[0] + " är " + ages[0] + ", " + names[1] + " är " + ages[1] + " och " + names[2]
                + " är " + ages[2] + ".");

    }
}
