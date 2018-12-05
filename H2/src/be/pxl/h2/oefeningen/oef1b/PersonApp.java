package be.pxl.h2.oefeningen.oef1b;

public class PersonApp {
    public static void main(String[] args) {
        Person personA = new Person();
        personA.setName("Anna");
        personA.setSurname("Belle");
        personA.setBirthYear(1985);
        personA.setWeight(62);
        personA.setLength(1.76);
//        System.out.printf("Deze persoon is %s %s.\n", personA.name, personA.surname);
//        System.out.printf("gewicht          : %7.2f kg\n", personA.weight);
//        System.out.printf("lengte           : %7.2f m\n", personA.length / 100);
//        System.out.printf("geboortejaar     : %7d\n", personA.birthYear);
        System.out.println(personA.outputToString());
        personA.grow();
        System.out.println(personA.outputToString());
        Person personB = new Person(personA);
        personB.grow(0.3);
        System.out.println(personA.outputToString());
        System.out.println(personB.outputToString());
    }
}
