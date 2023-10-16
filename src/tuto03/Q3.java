package tuto3;

public class Q3 {

    public static void main(String[] args) {
        int x = 9, y = 10;

        // a
        // The output is
        // #####
        // $$$$$
        //
        // ##### is printed because x = 9 < 10 is true and y = 10 > 10 is false.
        // $$$$$ is printed because the last statement will always be executed.
        if (x < 10)
        if (y > 10)
        System.out.println("*****");
        else // This else statement is for the if (y > 10) statement.
        System.out.println("#####");
        System.out.println("$$$$$"); // This statement is not included in the if clause.

        System.out.println();
        // b
        // The output is
        // #####
        // $$$$$
        //
        // As x = 9 < 10 is true and y = 10 < 10 is false,
        // only the statements in the else clause of y < 10 are executed.
        if (x < 10) {
        if (y < 10)
        System.out.println("*****");
        else{
        System.out.println("#####");
        System.out.println("$$$$$");
        }}

        System.out.println();
        // c
        // The output is
        // #####
        //
        // Because x = 9 < 10 is true and y = 10 < 10 is false.
        if (x < 10) {
        if (y < 10)
        System.out.println("*****"); // This statement is in the if (y < 10) clause.
        System.out.println("#####"); // This statement is in the if (x < 10) clause.
        }
        else {
        System.out.println("$$$$$");
        }

        System.out.println();
        // d
        // No output.
        //
        // As x = 9 > 10 is false,
        // all the statements in the if (x > 10) clause will not be executed.
        if (x > 10) {
        if (y > 10) {
        System.out.println("*****");
        System.out.println("#####"); }
        else
        System.out.println("$$$$$");
        } // The closing bracket of the if (x > 10) statement.
    }
}
