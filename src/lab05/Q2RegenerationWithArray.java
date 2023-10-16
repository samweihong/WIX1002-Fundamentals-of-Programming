package lab05;

import java.util.Random;

public class Q2RegenerationWithArray {
    public static void main(String[] args) {
        int[] nums = new int[10];
        boolean[] generated = new boolean[21];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            while (true) {
                int number = random.nextInt(21);
                // Check if there exists duplicate of this number in the previous elements.
                if (generated[number]) continue;
                
                nums[i] = number;
                generated[number] = true;
                break;
            }
        }

        for (int num : nums)
            System.out.print(num + " ");
        System.out.println();
    }
}
