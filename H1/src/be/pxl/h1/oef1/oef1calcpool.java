package be.pxl.h1.oef1;

import java.util.Scanner;

public class oef1calcpool {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double poolLength = 0;
        double poolWidth = 0;
        double poolDepth = 0;
        double poolVolume = 0;
        double waterSolutionRatio = 0.98;

        System.out.println("Wat is de diepte(m) van het zwembad?");
        poolDepth = input.nextDouble();
        input.nextLine();
        System.out.println("Wat is de breedte(m) van het zwembad?");
        poolWidth = input.nextDouble();
        input.nextLine();
        System.out.println("Wat is de lengte(m) van het zwembad?");
        poolLength = input.nextDouble();
        input.nextLine();

        // 1 m^3 is 1000 liters.
        // Convert poolVolume to liters => * 1000
        poolVolume = poolLength * poolWidth * poolDepth * 1000.0;
        System.out.println("Er is " + (int) (poolVolume * waterSolutionRatio) + " liter water nodig en \n" +
                (int) (poolVolume  * (1-waterSolutionRatio)) +
                " liter ontsmettingsmidel nodig om het zwembad te vullen.");
        input.close();
    }
}
