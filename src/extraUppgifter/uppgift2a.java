package extraUppgifter;

public class uppgift2a {
    public static void main(String[] args) {
        int alder1;
        int alder2;

        alder1 = 23;
        alder2 = 15;

        String meddelande = "Ingrid är " + alder1 + " år gammal.";
        meddelande += "\nSven är " + alder2 + " år gammal.";

        System.out.println(meddelande);

        System.exit(0);
    }
}
