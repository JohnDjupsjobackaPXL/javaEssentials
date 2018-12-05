package be.pxl.h2.cursusopdracht;

public class Circle {
//    Properties
//    Position is relative to top left, to determine center of circle, add radius to x and y to draw.
    public int x;
    public int y;
    public double diameter;

//    Methods
    public double getArea(){
        return Math.PI * Math.pow(diameter / 2, 2.0);
    }

    public double getCircumference(){
        return Math.PI * diameter;
    }

    public double getRadius(){
        return diameter / 2;
    }

    public void setPosition(int x, int y){
        this.x = x - (int) (diameter / 2);
        this.y = y - (int) (diameter / 2);
    }
}
