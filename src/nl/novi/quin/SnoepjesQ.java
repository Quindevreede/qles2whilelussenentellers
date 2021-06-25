package nl.novi.quin;

public class SnoepjesQ {
    public static void main (String[] snoepjes) {
        System.out.println("ED-209: [menacingly] Please put down your weapon.");
        int aantalSnoepjes = 20;

        while(aantalSnoepjes > 0) { // Voeg hier de conditionele statement toe tussen de haakjes.
            System.out.println("You now have " + aantalSnoepjes + " seconds to comply.");

            // Zorg er hier voor dat het aantal snoepjes minder wordt.
            aantalSnoepjes--;
            if (aantalSnoepjes > 15) {
                aantalSnoepjes = aantalSnoepjes - 4;
                System.out.println("--GROWLS--");
            }

            if (aantalSnoepjes == 14) {
                aantalSnoepjes = aantalSnoepjes - 9;
                System.out.println("--You are in direct violation of Penal Code 1.13, Section 9.--");
            }

        }
        System.out.println("--I am now authorized to use physical force!-- [ED-209 opens fire]");
    }
}