package be.pxl.h1.opdracht10;

import java.util.Scanner;

public class opdracht10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Geef het inschrijvingsnummer van de renner in:");
        int numberRunner = input.nextInt();
        input.nextLine();

        int numberOfRunners = 0;
        int slowRunners = 0;
        int timeRunner = 0;
        /*System.out.println("Geef zijn tijd in seconden in:");
        int timeRunner = input.nextInt();
        input.nextLine();
        */

        int fastestRunner = 0;
        int fastestTime = -1;

        while (numberRunner >= 0) {
            numberOfRunners++;

            System.out.println("Geef zijn tijd in seconden in:");
            timeRunner = input.nextInt();
            input.nextLine();

            if (timeRunner > fastestTime && numberRunner >= 0)  {
                timeRunner = fastestTime;
                numberRunner = fastestRunner;
            }

            if (timeRunner > 3600)   {
                slowRunners++;
            }

            System.out.println(numberRunner + "\t" + timeRunner);
            fastestRunner = -1; // resetten van nummer.
            System.out.println("Geef het inschrijvingsnummer van de renner in:");
            fastestRunner = input.nextInt();
            input.nextLine();

            /*System.out.println("Geef zijn tijd in seconden in:");
            timeRunner = input.nextInt();
            input.nextLine();
            */

        }
        System.out.println("De snelste renner was #" + numberRunner + ".");
        double percentageSlowRunners = (double) slowRunners / (double) numberOfRunners * 100.0;
        System.out.printf("Het %.2f /% van renners die langer dan 1 uur erover deden: ", percentageSlowRunners);
    }
}