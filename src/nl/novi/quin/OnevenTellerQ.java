package nl.novi.quin;

public class OnevenTellerQ {
    public static void main(String[] oneven) {
        /*
        Maak een while-lus.
        Deze while-lus moet net zo lang lopen tot en met de teller op 10 staat.
        Print alleen de oneven getallen uit!
         */
        int teller = 0;
        while(teller < 11) {
            if(teller % 2 == 1) {
                System.out.println(teller);
            }
            teller++;
        }
    //of :
        System.out.println("--");

        int tellerQ = 1;
        while (tellerQ < 11) {
            System.out.println(tellerQ);
            tellerQ = tellerQ + 2;
        }
    }
}



