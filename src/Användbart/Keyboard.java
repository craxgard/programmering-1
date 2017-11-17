// Keyboard.java
package Användbart;
import java.io.*;
import java.util.*;

public class Keyboard{
        private static String lastToken = null;
        private static StringTokenizer input;
        private static BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        // Unders�ker om token finns
        private static String getToken(boolean readDelimiters){
                String token;
                if (lastToken == null){
                        token = getNextToken(readDelimiters);
                }
                else{
                        token = lastToken;
                        lastToken = null;
                }
                return token;
        }

        // H�mtar n�sta token
        private static String getNextToken(boolean readDelimiters){
                final String delimiters = " \t\n\r\f";
                String token = null;
                try{
                        if (input == null){


                            input = new StringTokenizer
                                        (br.readLine(), delimiters, true);
                        }
                        while (token == null || (delimiters.indexOf(token) >= 0 &&
                                                                !readDelimiters)){
                                while (!input.hasMoreTokens()){

                                    input = new StringTokenizer
                                                (br.readLine(), delimiters,true);
                                }
                                token = input.nextToken();
                        }
                }
                catch(Exception e){
                        token = null;
                }
                return token;
        }

        // Returnerar en str�ng.
        public static String readString(){
                String str;
                try{
                        str = getToken(true);
                        while (input.hasMoreTokens()){
                                str = str + getToken(true);
                        }
                }
                catch(Exception e){
                        System.out.println("Fel vid str�ngl�sning.");
                        str = null;
                }
                return str;
        }

        // Returnerar ett ord.
        public static String readWord(){
                String token;
                try{
                        token = getToken(false);
                }
                catch(Exception e){
                        System.out.println("Fel vid l�sning av ord.");
                        token = null;
                }
                return token;
        }

        // Returnerar ett tecken.
        public static char readChar(){
                String token = getToken(true);
                char value;
                try{
                        if (token.length() > 1){
                                lastToken = token.substring (1, token.length());
                        }
                        else{
                                lastToken = null;
                        }
                        value = token.charAt (0);
                }
                catch(Exception e){
                        System.out.println("Fel vid l�sning av tecken");
                        value = Character.MIN_VALUE;
                }
                return value;
        }

        // Returnerar en int.
        public static int readInt(){
                String token = getToken(false);
                int value;
                try{
                        value = Integer.parseInt(token);
                }
                catch(Exception e){
                        System.out.println("Fel vid l�sning av int");
                        value = Integer.MIN_VALUE;
                }
                return value;
        }

        // Returnerar en long.
        public static long readLong(){
                String token = getToken(false);
                long value;
                try{
                        value = Long.parseLong(token);
                }
                catch(Exception e){
                        System.out.println("Fel vid l�sning av long");
                        value = Long.MIN_VALUE;
                }
                return value;
        }

        // Returnerar en float.
        public static float readFloat(){
                String token = getToken(false);
                float value;
                try{
                        value = (new Float(token)).floatValue();
                }
                catch(Exception e){
                        System.out.println("Fel vid l�sning av float");
                        value = Float.NaN;
                }
                return value;
        }

        // Returnerar en double.
        public static double readDouble(){
                String token = getToken(false);
                double value;
                try{
                        value = (new Double(token)).doubleValue();
                }
                catch(Exception e){
                        System.out.println("Fel vid l�sning av double");
                        value = Double.NaN;
                }
                return value;
        }
}
