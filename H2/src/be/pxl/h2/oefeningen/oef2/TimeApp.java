package be.pxl.h2.oefeningen.oef2;

public class TimeApp {
    public static void main(String[] args) {

        TimeMoment tijd = new TimeMoment(12, 45, 23);
        System.out.println("Tijd opgesomds in Europees model.");
        System.out.println(tijd.returnTimeString(false));
        System.out.println("Tijd opgesomd in Engels model.");
        System.out.println(tijd.returnTimeString(true));
        System.out.println(tijd.returnTimeStringTechnical());

        System.out.println("Start of section with array of TimeMoment.");
        TimeMoment[] timeArray = new TimeMoment[6];
        for (int i = 0; i < timeArray.length; i++) {
//            System.out.println(i);
//            System.out.println(21600 + i * 9360);
            timeArray[i] = new TimeMoment(21600 + i * 9360);
//            timeArray[i] = new TimeMoment(59 + i);
        }
        for ( TimeMoment timeObject : timeArray) {
            System.out.println(timeObject.returnTimeStringTechnical());
            System.out.println(timeObject.getHours() + ":" + timeObject.getMinutes() + ":" + timeObject.getSeconds());
        }
//        TimeMoment testTimeMoment = new TimeMoment(360);
//        System.out.println(testTimeMoment.hours + " " + testTimeMoment.minutes + " " + testTimeMoment.seconds);
//        System.out.println(testTimeMoment.returnTimeStringTechnical());

    }
}
/*
        21600 + i * 9360
        21600
        21600 + 9360
        21600 + 18720
        21600 + 28080
        21600 + 37440
        21600 + 46800
*/