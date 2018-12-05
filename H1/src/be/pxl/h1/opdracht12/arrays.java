package be.pxl.h1.opdracht12;

public class arrays {
    public static void main(String[] args) {
        int[] numberarray = new int[20];

        for (int i = 0; i < numberarray.length; i++) {
            numberarray[i] = (i + 1) * 7;
            //System.out.println(numberarray[i]);
        }
        System.out.println("Met \"gewone\" loop.");
        for (int i = 0; i < numberarray.length; i++) {
            System.out.printf("%2d. %5d \n", i + 1, numberarray[i]);
        }
        System.out.println("Met for each loop.");
        for (int number : numberarray) {
            System.out.printf(" %3d ", number);
        }

        int[] unevenNumbers = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        System.out.println("lijst oneven nummers in volgorde");
        for (int number : unevenNumbers) {
            System.out.printf("%3d ", number);
        }

        System.out.println("lijst oneven nummers in omgekeerde volgorde.");
        for (int i = unevenNumbers.length; i >= 0; i--){
            System.out.printf("3d ",unevenNumbers[i]);
        }
    }
}
