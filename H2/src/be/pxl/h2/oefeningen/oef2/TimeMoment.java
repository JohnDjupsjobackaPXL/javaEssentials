package be.pxl.h2.oefeningen.oef2;

public class TimeMoment {
    // Fields
    public int days;
    public int hours;
    public int minutes;
    public int seconds;

    // Constructors
    public TimeMoment() {
    }

    public TimeMoment(int seconds) {
        this(0,0, seconds);
    }

    public TimeMoment(TimeMoment timemomentToDuplicate) {
        this(timemomentToDuplicate.getHours(),timemomentToDuplicate.getMinutes(),timemomentToDuplicate.getSeconds());
//        this.seconds = timemomentToDuplicate.getSeconds();
//        this.minutes = timemomentToDuplicate.getMinutes();
//        this.hours = timemomentToDuplicate.getHours();
//        this.days = timemomentToDuplicate.getDays();
    }

    public TimeMoment(int hours, int minutes, int seconds) {
        this.addSeconds(seconds); // Making the assumption this object start initialized with 0,0,0
        this.addMinutes(minutes);
        this.addHours(hours);
    }

    // Getters
    public int getDays() {
        return this.days;
    }

    public int getHours() {
        return this.hours;
    }

    public int getMinutes() {
        return this.minutes;
    }

    public int getSeconds() {
        return this.seconds;
    }

    // Setters
    public void setDays(int days) {
        this.days = days;
    }

    public void setHours(int hours) {
        if (hours > 23) {
            //addDays(hours / 24);
            this.hours = hours % 24;
        } else {
            this.hours = hours;
        }
    }

    public void setMinutes(int minutes) {
        //System.out.println(minutes + "FROM setMinutes");
        if (minutes > 59) {
            this.addHours(minutes / 60);
            this.minutes = minutes % 60;
        } else {
            this.minutes = minutes % 60;
        }
    }

    public void setSeconds(int seconds) {
        if (seconds > 59) { // Found the bug was using this.seconds instead of seconds, preventing the check from working.
            this.addMinutes(seconds / 60);
            this.seconds = seconds % 60;
        } else {
            this.seconds = seconds % 60;
        }
    }
    // Methods

    public void addDays(int days) {
        setDays(this.days + days);
    }

    public void addHours() { //Just adds one hour to the time
        this.addHours(1);
    }

    public void addHours(int hours) {
        this.setHours(this.hours + hours);
    }

    public void addMinutes(int minutes) {
        this.setMinutes(this.minutes + minutes);
    }

    public void addSeconds(int seconds) {
        this.setSeconds(this.seconds + seconds);
    }

    public String returnTimeString(boolean altNotation) {
        if (altNotation) {
            int convertedHours = getHours();
            if (getHours() == 0) {
                convertedHours = 12;
            } else if (getHours() == 12) {
                convertedHours = 24;
            }
            if (getHours() >= 12) {
                return String.format("%d:%d PM", convertedHours - 12, getMinutes());
            } else {
                return String.format("%d:%d AM", convertedHours, getMinutes());
            }
        }
        return String.format("%d:%2d u", getHours(), getMinutes());
    }

    public String returnTimeStringTechnical() {
        return String.format("%02d:%02d:%02d", getHours(), getMinutes(), getSeconds());
    }
}

