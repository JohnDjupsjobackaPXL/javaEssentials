package be.pxl.h2.cursusopdracht;

public class rectangleApp {
    public static void main(String[] args) {
        Rectangle rectangleA = new Rectangle(10,10, 50,50);
        Rectangle rectangleDuplicateA = new Rectangle(rectangleA);
        System.out.println("Rechthoek A");
        showRectangle_S(rectangleA);
        System.out.println("Rechthoek Duplicaat van A");
        showRectangle_S(rectangleDuplicateA);
        System.out.println("groei duplicaat met 20");
        rectangleDuplicateA.grow(20);
        System.out.println("Rechthoek A");
        showRectangle_S(rectangleA);
        System.out.println("Rechthoek Duplicaat van A");
        showRectangle_S(rectangleDuplicateA);

/*
        Rectangle rectangleB = new Rectangle();
        Rectangle rectangleC = new Rectangle(20,60);
        Rectangle rectangleCDuplicate = new Rectangle(rectangleC);

        Rectangle rectangleA = new Rectangle();
        rectangleA.setWidth(50);
        rectangleA.setHeight(90);
        rectangleA.setPosition( 0, 0);

        showRectangle_S(rectangleA);
        showRectangle_S(rectangleB);
        showRectangle_S(rectangleC);
        rectangleA.setPosition(49, 51);
        rectangleA.setWidth(640);
        rectangleA.grow(50, 40);
        System.out.println("Na groei...");
        showRectangle_S(rectangleA);
        rectangleA.grow(20);
        showRectangle_S(rectangleA);
        */
    }

    public static void showRectangle_S(Rectangle rec_Object) {
        System.out.printf("1ste punt van rechthoek is op " + rec_Object.getPosition_S() + ". \n");
        System.out.printf("Hoogte van rechthoek is %d.\nBreedte van rechthoek is %d.\n", rec_Object.getHeight(), rec_Object.getWidth());
        System.out.printf("De rechthoek heeft een oppervlakte van %d.\n", rec_Object.getArea());
        System.out.printf("De rechthoek heeft een omtrek van %d.\n", rec_Object.getCircumference());
    }
}
