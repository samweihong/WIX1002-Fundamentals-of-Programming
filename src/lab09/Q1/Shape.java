package lab09.Q1;

public class Shape {
    private String name;
    private double perimeter;
    private double area;

    public void setName(String name) {
        this.name = name;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return String.format("Name: %s\nPerimeter: %.2f\nArea: %.2f", name, perimeter, area);
    }
}
