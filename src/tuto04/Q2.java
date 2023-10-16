package tuto4;

public class Q2 {

    public static void main(String[] args) {
        // a
        int sum = 0;
        // Missing data type for x.
        // x should be decremented to prevent infinite loops.
        for (int x = 10; x > 0; x--)
            sum += x;

        // b
        int x = 0, y = 0;
        // Missing curly brackets for do clause.
        // Missing semicolon after while statement.
        do {
            x += 2;
            y += x;
            System.out.println(x + " and " + y);
        } while (x < 100);

        // c
        // Missing data type for x and y.
        // Single equal sign should be used for assigning values to x and y.
        // Semicolon should be used after the comparison statement.
        // Plus sign should be used for concatenate the string.
        // Semicolon should not be used after the for statement.

        // Comment out to prevent conflicts with b.
//        for (int x = 1, y = 20; x < y; x++, y-=2)
//            System.out.println(x + " " + y);

        // d
        // Missing data type for i.
        // i should be updated in the loop to prevent infinite loops.
        // With i<10 as comparison statement, the if statement will never be executed.
        int i = 1;
        while(i<=10) {
            if (i==10)
                System.out.println("Program End");
            i++;
        }
    }
}
