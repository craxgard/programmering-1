package extraUppgifter;

public class uppgift2b {
    public static void main(String[] args) {
        int alder1;
        int alder2;

        alder1 = 23;
        alder2 = 15;

        String meddelande1 = "Ingrid är " + alder1 + " år gammal.";
        meddelande1 += "\nSven är " + alder2 + " år gammal.";

        System.out.println(meddelande1);

        int summa;
        int skillnad;

        summa = alder1 + alder2;
        skillnad = alder1 - alder2;

        String meddelande2 = "Tillsammans är de " + summa + " år gamla";
        meddelande2 += "\nÅldersskillnaden är " + skillnad + " år.";

        System.out.println(meddelande2);

        System.exit(0);
    }
}