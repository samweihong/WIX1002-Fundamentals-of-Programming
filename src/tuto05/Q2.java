package tuto5;

public class Q2 {

    public static void main(String[] args) {

        // a.
        // A string should be enclosed in double quotes.
        String[] code = {"AAA", "AAB", "AAC", "AAD"};

        // b.
        int sum = 0;
        // Data type should be specified after the new keyword.
        // num.length should be used to access the length of num.
        // k cannot be equal to num.length due to ArrayIndexOutOfBoundsException.
        // sum should be incremented with the value of array.
        int[] num = new int[10];
        for(int k=0; k<num.length; k++)
            sum+=num[k];

        // c.
        // The inner array is not declared before assigning values.
        int [][]t = new int[3][];
        t[1] = new int[3];
        t[1][2] = 5;

        // d.
        // There is no score[5], which leads to ArrayIndexOutOfBoundsException.
        int i=4;
        int []score = new int[5];
        score [1] = 78;
        score[i++] = 100;
    }
}
