package Användbart;

import java.text.*;

public class Formatering {
    public static void main(String[] args) {
        double x, y, z;
        String utskrift;    //sträng för utskrift
        x = 17.5;
        y = 3.7;

        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2); // max 2 decimaler
        nf.setMinimumFractionDigits(2); // min 2 decimaler
        z = x / y;
        utskrift = nf.format(z);    // resultat måste vara en sträng
        System.out.println("Divisionen blir " + utskrift);
    }
}
