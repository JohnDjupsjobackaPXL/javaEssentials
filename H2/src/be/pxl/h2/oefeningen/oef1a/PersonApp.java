package be.pxl.h2.oefeningen.oef1a;

public class PersonApp {
    public static void main(String[] args) {
        Person personA = new Person();
        personA.name = "Anna";
        personA.surname = "Belle";
        personA.birthYear = 1923;
        personA.weight = 62;
        personA.length = 176;
        System.out.printf("Deze persoon is %s %s.\n", personA.name, personA.surname);
        System.out.printf("gewicht          : %7.2f kg\n", personA.weight);
        System.out.printf("lengte           : %7.2f m\n", personA.length / 100);
        System.out.printf("geboortejaar     : %7d\n", personA.birthYear);
    }
}
