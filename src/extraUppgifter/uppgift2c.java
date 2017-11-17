package extraUppgifter;

public class uppgift2c {
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

        int pension1 = 65 - alder1;
        int pension2 = 65 - alder2;

        String meddelande3 = "Ingrid har " + pension1 + " år kvar till pensionen.";
        meddelande3 += "\nSven har " + pension2 + " år kvar.";

        System.out.println(meddelande3);

        System.exit(0);
    }
}