package be.pxl.h1.oef6;

import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        char[] resistorColor = new char[]{'z', 'b', 'r', 'o', 'g', 'G', 'B', 'V', 'L', 'W'};
        String resistorValue = new String(resistorColor); // array converteren naar string om indexOf methode te kunnen gebruiken voor de waarde van de kleuren.
        Scanner input = new Scanner(System.in);
        boolean resistorExists = true;
//        char[] charInput = {'a', 'b', 'c'};
        int[] resistorOutput = new int[3];
        for (int i = 0; i < 3; i++) {
            char[] charInput = {'a', 'b', 'c'};
            System.out.printf("Kleurcode van lijn %c: ", charInput[i]);
            charInput[i] = input.next().charAt(0);
            if (resistorValue.indexOf(charInput[i]) >= 0) {
                for (char c : resistorColor) {
                    if (c == charInput[i]) {
                        resistorOutput[i] = resistorValue.indexOf(c);
                        System.out.println("in resistor checking loop" + charInput[i]);
                    }
                }
            } else {
                System.out.println("ERROR. Onbestaande kleurcode.");
                resistorExists = false;
                break;
            }
        }
//                if (c == charInput[i]) {
//                    resistorOutput[i] = resistorValue.indexOf(c);
////                    System.out.println("in resistor checking loop" + charInput[i]);
//                } else if (resistorValue.indexOf(c) < 0) {
//                    System.out.println("ERROR. Onbestaande kleurcode.");
//                    break;

//        System.out.println("Index of o in array: " + resistorColor);
//        String test = new String(resistorColor);
//        System.out.println(new String(resistorColor).indexOf('r'));
//        System.out.println(resistorOutput[0]);
//        System.out.println(resistorOutput[1]);
//        System.out.println(resistorOutput[2]);
        if (resistorExists) {
            long resistance = (long) ((10 * resistorOutput[0] + resistorOutput[1]) * Math.pow(10, resistorOutput[2]));
            System.out.printf("De resistor heeft een weerstand van %d Ohm.", resistance);
        }
    }
}
