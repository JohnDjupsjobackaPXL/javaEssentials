package inputTestApp;

import java.util.Scanner;

public class inputTest {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Word???");
        String output = "";
        String input = inputScanner.nextLine();
        input = input.trim();
        while( inputScanner.hasNextLine() && !input.equals("")){
            System.out.println("Word?");
            input = inputScanner.nextLine();
            input = input.trim();
            output = output.concat(input);
            System.out.println(output);
        }
        System.out.println(output);
    }
}
