package be.pxl.h1.opdracht11.driehoek;

import java.util.Scanner;

public class driehoek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Beginnen vanaf welke letter?");
        char letter = input.nextLine().charAt(0);
        System.out.println("Hoe veel rijen aan de driehoek?");
        int rows = input.nextInt();
        input.nextLine();
        for (int i = 0;i < rows; i++){
            for ( int j = 0; j < i + 1; j++) {
                System.out.print(letter + " ");
                letter++;
                if (letter >= 'Z') {
                    letter = 'A';
                }
            }
            System.out.println();
        }
    }
}
