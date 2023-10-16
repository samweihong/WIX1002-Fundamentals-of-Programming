package lab05;

import java.util.Random;

public class Q2 {
    public static void main(String[] args) {
        int[] nums = new int[21];
        for (int i = 0; i < nums.length; i++)
            nums[i] = i;

        // Use Fisher–Yates shuffle to shuffle the array.
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            // Exchange a[i] with random element in a[i..20].
            int r = random.nextInt(nums.length - i) + i;
            int temp = nums[i];
            nums[i] = nums[r];
            nums[r] = temp;
        }

        for (int i = 0; i < 10; i++)
            System.out.print(nums[i] + " ");
        System.out.println();
    }
}
