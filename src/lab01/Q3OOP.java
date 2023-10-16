package lab01;

public class Q3OOP {
    private static final String S = "*";

    public static void main(String[] args) {
        // Create the Shape objects and store them in an array.
        Shape[] shapes = new Shape[]{new Rectangle(), new Ellipse(), new Arrow(), new Diamond()};
        // For each row, print the characters of each shape in that row with spacing.
        for (int row = 1; row <= 9; row++) {
            for (Shape shape : shapes) printShape(shape, row);
            System.out.println();
        }
    }

    // Print the characters of the shape in the given row followed by spaces.
    public static void printShape(Shape shape, int row) {
        System.out.print(shape.getRowCharacters(row));
        System.out.print(" ".repeat(7));
    }

    public static abstract class Shape {
        // An array that store the characters in each row
        protected String[] rowCharacters = new String[10];

        // Get the characters in given row
        public String getRowCharacters(int row) {
            return rowCharacters[row];
        }
    }

    public static class Rectangle extends Shape {
        public Rectangle() {
            for (int row = 1; row <= 9; row++) {
                switch (row) {
                    case 1, 9 -> rowCharacters[row] = S.repeat(9);
                    default -> rowCharacters[row] = S + " ".repeat(7) + S;
                }
            }
        }
    }

    public static class Ellipse extends Shape {
        public Ellipse() {
            for (int row = 1; row <= 9; row++) {
                switch (row) {
                    case 1, 9 -> rowCharacters[row] = " ".repeat(3) + S.repeat(3) + " ".repeat(3);
                    case 2, 8 -> rowCharacters[row] = " " + S + " ".repeat(5) + S + " ";
                    default -> rowCharacters[row] = S + " ".repeat(7) + S;
                }
            }
        }
    }

    public static class Arrow extends Shape {
        public Arrow() {
            for (int row = 1; row <= 9; row++) {
                switch (row) {
                    case 2 -> rowCharacters[row] = " " + S.repeat(3) + " ";
                    case 3 -> rowCharacters[row] = S.repeat(5);
                    default -> rowCharacters[row] = "  " + S + "  ";
                }
            }
        }
    }

    public static class Diamond extends Shape {
        public Diamond() {
            for (int row = 1; row <= 9; row++) {
                // top bottom symmetry
                int y = Math.min(row, 10 - row);

                // left right symmetry
                String line = " ".repeat(5 - y) + S + " ".repeat(y - 1);
                for (int x = 3; x >= 0; x--) line += line.charAt(x);
                rowCharacters[row] = line;
            }
        }
    }
}
