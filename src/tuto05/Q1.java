package tuto5;

public class Q1 {

    public static void main(String[] args) {
        // a
        double[] a1 = new double[12];

        // b
        char[] a2 = new char[5];
        for (int i = 0; i < a2.length; i++)
            a2[i] = (char) ('A' + i);

        // c
        String[] a3 = new String[100];

        // d
        int[][] a4 = new int[6][2];

        // e
        int[][] a5 = {{6, 9}, {2, 5}, {4, 6}};

        // f
        a5[1][1] = 4;
        a5[2][0] = 3;
        a5[2][1] = 7;

        // g
        String[] contact = {"Obama", "Trump", "Biden"};
        for (String c : contact)
            System.out.println(c);
    }
}
