package nl.novi.quin;

public class Snoepjes {
    public static void main (String[] snoepjes) {
        int aantalSnoepjes = 22;

        while(aantalSnoepjes > 0) { // Voeg hier de conditionele statement toe tussen de haakjes.
            System.out.println("Er zijn nog " + aantalSnoepjes + " snoepjes over. Tijd om er nog een op te eten.");

            // Zorg er hier voor dat het aantal snoepjes minder wordt.
            aantalSnoepjes--;

        }
        System.out.println("De snoepjes zijn op.");
    }
}
