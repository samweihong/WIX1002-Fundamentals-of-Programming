package lab05;

import java.util.Random;

public class Q2Regeneration {
    public static void main(String[] args) {
        int[] nums = new int[10];
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            outer:
            while (true) {
                int number = random.nextInt(21);
                // Check if there exists duplicate of this number in the previous elements.
                for (int j = 0; j < i; j++)
                    if (nums[j] == number)
                        continue outer;
                nums[i] = number;
                break;
            }
        }

        for (int num : nums)
            System.out.print(num + " ");
        System.out.println();
    }
}
