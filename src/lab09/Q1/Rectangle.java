package lab09.Q1;

public class Rectangle extends Shape {
    private double sideLength1;
    private double sideLength2;

    public Rectangle(double sideLength1, double sideLength2) {
        this.sideLength1 = sideLength1;
        this.sideLength2 = sideLength2;
        computePerimeterAndArea();
    }

    public void computePerimeterAndArea() {
        setPerimeter(2 * (sideLength1 + sideLength2));
        setArea(sideLength1 * sideLength2);
    }
}
