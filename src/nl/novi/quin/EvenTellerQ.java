package nl.novi.quin;

public class EvenTellerQ {
    public static void main(String[] even) {
        /*
        Maak een while-lus.
        Deze while-lus moet net zo lang lopen tot en met de teller op 10 staat.
        Print alleen de even getallen uit!
         */
        int teller = 0;
        while(teller != 11) {
            if(teller % 2 == 0) {
                System.out.println(teller);
            }
            teller ++;
        }

        // of :
        System.out.println("--");

        int tellerQ = 0;
        while (tellerQ < 11) {
            System.out.println(tellerQ);
            tellerQ = tellerQ + 2;
        }
    }
}