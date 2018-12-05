package be.pxl.h1.stringcompare;

// Vragen waarom dit niet false teruggeeft waar ik het verwacht. Iets vergeten?

public class compare {
    public static void main(String[] args) {
        String one = "String";
        String two = new String("String");

        boolean result = one == two;
        // Werkt niet omdat string two aangemaakt is als een nieuwe string, maw een nieuw object in het geheugen.
        System.out.println("String one compared to String two with == returns: " + result);

        System.out.println("String one compared to String two with .equals returns:" + one.equals(two));

        // Bij de volgende vergelijking geeft hij wel waar omdat het nieuw "object" naar dezelfde locatie in het geheugen verwijst.
        System.out.println("String one compared to new string with String: " + (one == "String"));
    }
}
