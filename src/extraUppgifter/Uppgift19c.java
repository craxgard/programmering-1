package extraUppgifter;

import javax.swing.*;
import java.util.ArrayList;

public class Uppgift19c {

    public static void main(String[] args) {
        // Create a list of cows
        ArrayList<Cow> cows = new ArrayList<Cow>();
        cows.add(new Cow(378, "Maja"));
        cows.add(new Cow(638, "Stjärna"));
        cows.add(new Cow(548, "Krona"));
        cows.add(new Cow(462, "Sara"));
        cows.add(new Cow(523, "Lilja"));
        cows.add(new Cow(414, "Linda"));
        cows.add(new Cow(715, "Majros"));
        cows.add(new Cow(635, "Lisa"));
        cows.add(new Cow(537, "Stina"));
        cows.add(new Cow(549, "Kajsa"));
        cows.add(new Cow(550, "Docka"));
        cows.add(new Cow(456, "Malin"));
        cows.add(new Cow(610, "Rosa"));
        cows.add(new Cow(647, "Sagor"));

        // Allow the user to input the index for the cow that they want info on
        Cow currentCow = cows.get(Integer.parseInt(JOptionPane.showInputDialog("Ange ko-index, 0 till " +
                (cows.size() - 1) )));

        // Display the cow's weight to the user
        JOptionPane.showMessageDialog(null, "Ko med index " + cows.indexOf(currentCow) + " heter "
                        + currentCow.getName() + " och  väger " + currentCow.getWeight() + " kg.");

        System.exit(0);
    }
}
