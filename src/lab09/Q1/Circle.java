package lab09.Q1;

public class Circle extends Shape {
    private double diameter;

    public Circle(double diameter) {
        this.diameter = diameter;
        computePerimeterAndArea();
    }

    public void computePerimeterAndArea() {
        setPerimeter(Math.PI * diameter);
        setArea(Math.PI * diameter * diameter / 4);
    }
}
