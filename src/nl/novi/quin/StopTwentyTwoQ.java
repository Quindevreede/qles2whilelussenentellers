package nl.novi.quin;

public class StopTwentyTwoQ {
    public static void main(String[] tt) {

        int teller = 0;
        while(teller < 100) { // Deze regel mag niet aangepast worden.
            System.out.println("Getal: " + teller);
            if(teller == 22) {
                break;
            }
            teller = teller + 1;
        }
        // Of met continue:
        System.out.println("--");

        int tellerQ = 0;
        while(tellerQ < 100) {
            if(tellerQ == 22) {
                tellerQ++;
                continue;
            }
            System.out.println("Number = " + tellerQ);
            tellerQ++;
        }

        // Of met for lus:
        System.out.println("--");

        for (int tellerQQ = 0; tellerQQ < 100; tellerQQ++){
            System.out.println(tellerQQ);
            if (tellerQQ == 22) {
                break;
            }
        }
    }
}
