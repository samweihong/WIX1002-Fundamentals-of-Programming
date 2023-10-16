package tuto8;

public class Q3 {

    public static void main(String[] args) {
        new Coordinate2D(50, 2.5).displayXY();
    }
}

class Coordinate2D {

    private double x, y;

    public Coordinate2D() {
        x = 0;
        y = 0;
    }

    public Coordinate2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void displayXY() {
        System.out.println("x = " + x + "\n" +
                           "y = " + y);
    }
}
