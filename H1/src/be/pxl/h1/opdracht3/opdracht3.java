package be.pxl.h1.opdracht3;

public class opdracht3 {
    public static void main(String[] args) {
        boolean theTruth = true;
        int bigNum = Integer.MAX_VALUE;
        long biggerNum = Long.MAX_VALUE;
        char charDemonstration = 'D';
        double floatyNum = Double.MAX_VALUE;
        System.out.println(theTruth);
        System.out.println(bigNum);
        System.out.println(biggerNum);
        System.out.println(charDemonstration);
        System.out.println(floatyNum);
        /* reassign to custom numbers on int, long and double */
        bigNum = 60000000;
        biggerNum = 300000000000000000L;
        floatyNum = 445.87933;
        System.out.println(bigNum);
        System.out.println(biggerNum);
        System.out.println(floatyNum);
        System.out.println("bewerkingen");
        int a = 5;
        int b = 3;
        System.out.println(a / b);
    }
}
