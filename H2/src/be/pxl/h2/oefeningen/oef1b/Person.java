package be.pxl.h2.oefeningen.oef1b;

import java.util.Scanner;

public class Person {

    //  Constructors
    public Person() {
        this("unknown", "unknown");
    }

    public Person(String name, String surname) {
        this(name, surname, 2018, 0.0, 0.0);
    }

    public Person(String name, String surname, int birthYear, double length, double weight) {
        this.setName(name);
        this.setSurname(surname);
        this.setBirthYear(birthYear);
        this.setLength(length);
        this.setWeight(weight);
    }
    public Person(Person personDuplicate) {
        this(personDuplicate.name, personDuplicate.surname, personDuplicate.birthYear, personDuplicate.length, personDuplicate.weight);
    }
    //  Fields
    private double length;
    private double weight;
    private int birthYear;
    private String name;
    private String surname;
    Scanner input = new Scanner(System.in);

    //  Methods
    //  GETS
    public double getLength() {
        return this.length;
    }

    public double getWeight() {
        return this.weight;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getAge() {
        return 2018 - this.birthYear;
    }

    //  SETS
    public void setLength(double length) {
        if (length > 2.4) {
            length = 2.4;
        }
        this.length = length;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void grow() {
        grow(0.01);
    }

    public void grow(double delta) {
        this.setLength(this.length + delta);
    }


    public void addMultipleNames() {
        // DO NOTHING FIX DIS!
//        System.out.println("Geef voornamen in gescheiden door een spatie:");
//        this.setName(input.nextLine());
//        String inputString = input.next();
    }

    public String outputToString() {
        return String.format("Deze persoon is %1$s %2$s.\n" +
                        "gewicht          : %3$7.2f kg\n" +
                        "lengte           : %4$7.2f m\n" +
                        "geboortejaar     : %5$7d\n" +
                        "leeftijd         : %6$7d\n" +
                        "BMI van %1$s %1$s is %7$2.2f | %8$s\n",
                this.getName(), this.getSurname(),    // 1$ 2$
                this.getWeight(),                // 3$
                this.getLength(),                // 4$
                this.getBirthYear(),             // 5$
                this.getAge(),              // 6$
                this.calculateBMI(),        // 7$
                this.getBMIQuality());      // 8$

    }

    public double calculateBMI() {
        return this.weight / Math.pow(this.length, 2.0);
    }

    public String getBMIQuality() {
        double tempBMI = this.calculateBMI();
        if (tempBMI < 18) {
            return "ondergewicht";
        } else if (tempBMI < 25) {
            return "normaal";
        } else if (tempBMI < 30) {
            return "overgewicht";
        } else if (tempBMI < 40) {
            return "obesitas";
        } else {
            return "morbide obesitas";
        }
    }
}

/*
    BMI lager dan 18  ondergewicht
    BMI vanaf 18 tot 25  normaal
    BMI vanaf 25 tot 30  overgewicht
    BMI vanaf 30 tot 40  obesitas
    BMI vanaf 40  morbide obesitas
 */
