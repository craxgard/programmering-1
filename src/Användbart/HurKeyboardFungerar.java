package Användbart;

public class HurKeyboardFungerar {

    public static void main(String[] args) {
        String enamn;
        System.out.println("Mata in ditt efternamn");
        enamn = Keyboard.readString();
        System.out.println("Du heter " + enamn);

        System.exit(0);
    }
}
