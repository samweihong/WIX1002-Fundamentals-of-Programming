package lab05;

import java.util.Random;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        int N = 20;
        int[] nums = new int[N];
        Random random = new Random();
        for (int i = 0; i < N; i++)
            nums[i] = random.nextInt(101);

        nums = new int[]{57, 53, 46, 83, 74, 99, 30, 75, 61, 89,
                28, 30, 56, 41, 27, 32, 79, 48, 46, 88};

        System.out.println("A list of 20 random integer within 0 to 100");
        for (int i = 0; i < N - 1; i++)
            System.out.print(nums[i] + ", ");
        System.out.println(nums[N - 1]);

        // Bubble Sort
        for (int pass = 1; pass < N; pass++)
            for (int i = 0; i < N - pass; i++)
                if (nums[i] < nums[i + 1]) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }

        System.out.println("Array in descending order");
        for (int i = 0; i < N - 1; i++)
            System.out.print(nums[i] + ", ");
        System.out.println(nums[N - 1]);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to search: ");
        int searchNum = scanner.nextInt();

        // Linear Search
        int loop = 0;
        boolean isFound = false;
        for (int num : nums) {
            loop++;
            if (num == searchNum) {
                isFound = true;
                System.out.println(searchNum + " found");
                break;
            }
        }
        if (!isFound) System.out.println("Not found.");
        System.out.printf("Linear Search - %d loop(s)\n", loop);

        // Binary Search;
        loop = 0;
        isFound = false;
        int lo = 0;
        int hi = N - 1;

        while (lo <= hi) {
            loop++;
            int mid = lo + (hi - lo) / 2;

            if (searchNum == nums[mid]) {
                isFound = true;
                System.out.println(searchNum + " found");
                break;
            } else if (searchNum < nums[mid])
                lo = mid + 1;
            else
                hi = mid - 1;
        }
        if (!isFound) System.out.println("Not found.");
        System.out.printf("Binary Search - %d loop(s)\n", loop);
    }
}
