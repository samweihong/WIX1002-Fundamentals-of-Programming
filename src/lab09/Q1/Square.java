package lab09.Q1;

public class Square extends Shape {
    private double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
        computePerimeterAndArea();
    }

    public void computePerimeterAndArea() {
        setPerimeter(4 * sideLength);
        setArea(sideLength * sideLength);
    }
}
