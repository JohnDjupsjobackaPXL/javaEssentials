package be.pxl.h2.cursusopdracht;

public class Rectangle {
    //  Properties
    private int height;
    private int width;
    private int x;
    private int y;

    //  Methods

    public Rectangle() { // Default constructor is needed to keep this kind of construction valid if another constructor is defined.
        this(100, 100); // Refers to constructor that takes these values.
    }

    public Rectangle(int height, int width) {
        this(0, 0, height, width);
    }

    public Rectangle(Rectangle duplicateRectangle) {
        this(duplicateRectangle.x,duplicateRectangle.y, duplicateRectangle.height, duplicateRectangle.width);
    }


    public Rectangle(int x, int y, int height, int width) {
        setX(x);
        setY(y);
        setHeight(height);
        setWidth(width);
    }

    public int getArea() {
        return height * width;
    }

    public int getCircumference() {
        return 2 * height + 2 * width;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public String getPosition_S() {
//        ! Returns a string can not use to calculate stuff use getX and getY in that case.
        return String.format("(%d, %d)", this.x, this.y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setPosition(int x, int y) {
//        Prevent assigning position in negative "screenspace"
        this.x = Math.abs(x);
        this.y = Math.abs(y);
    }

    public void setX(int x) {
        this.x = Math.abs(x);
    }

    public void setY(int y) {
        this.y = Math.abs(y);
    }

    public void setWidth(int width) {
        this.width = Math.abs(width);
    }

    public void setHeight(int height) {
        this.height = Math.abs(height);
    }

    public void grow(int deltaHeight, int deltaWidth) {
        setHeight(this.height + deltaHeight);
        setWidth(this.width + deltaWidth);
    }

    //    Method overloading
    public void grow(int delta) {
        grow(delta, delta);
    }

    public void shrink(int deltaHeight, int deltaWidth) {
        if ((this.height - deltaHeight) > 0) {
            this.height = 0;
        } else {
            setHeight(this.height - deltaHeight);
        }
        if ((this.width - deltaWidth) > 0) {
            this.width = 0;
        } else {
            setWidth(this.width - deltaWidth);
        }
    }
}
