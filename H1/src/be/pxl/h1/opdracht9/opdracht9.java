package be.pxl.h1.opdracht9;

import java.util.Scanner;

/* Schrijf een programma dat toelaat de leeftijd en het aansluitingsjaar van een lid
van een tennisclub in te voeren en dat op basis hiervan zijn bijdrage berekent en afdrukt.
Volgende regels worden hierbij gerespecteerd:
    - Basisbedrag: 100 euro
    - Reductie: 14.5 euro indien lid nog geen 21 is of ouder is dan 60
    - Reductie: 2.5 euro per aangesloten jaar
    - minimum te betalen bedrage is 62.5 euro.
 */
public class opdracht9 {
    public static void main(String[] args) {
        int leeftijd;
        int aansluitingsjaar;
        int huidigJaar = 2018;
        double basisLidgeld = 100;
        double leeftijdReductie = 14.5;
        double lidjaarReductie = 2.5;
        double minimumLidgeld = 62.5;
        double lidgeld = basisLidgeld;
        Scanner input = new Scanner(System.in);
        System.out.println("Wat is het lid zijn leeftijd?");
        leeftijd = input.nextInt();
        input.nextLine();
        System.out.println("Welk jaar is hij aangesloten?");
        aansluitingsjaar = input.nextInt();
        input.nextLine();
        if (leeftijd <= 21 || leeftijd > 60) {
            lidgeld = basisLidgeld - leeftijdReductie;
        }
        lidgeld = lidgeld - ((huidigJaar - aansluitingsjaar) * lidjaarReductie);
        lidgeld = Math.max( lidgeld, 62.5);
        System.out.println(lidgeld);

    }
}
