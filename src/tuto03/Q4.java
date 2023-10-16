package tuto3;

public class Q4 {

    public static void main(String[] args) {
        int x = 1, y = 100, z = 1;

        if (x >= y && x >= z)
            System.out.println(x + " is the largest.");
        else if (y >= x && y >= z)
            System.out.println(y + " is the largest.");
        else
            System.out.println(z + " is the largest.");

        // Alternative solution
        int max = x;
        if (y > max) max = y;
        if (z > max) max = z;
        System.out.println(max + " is the largest.");
    }
}
