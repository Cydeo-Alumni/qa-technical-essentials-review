package Java_review;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        //Declare int array with values 1 to 5
        //print each one with space in between
        int[] nums = {1, 2, 3, 4, 5};
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        for (int n : nums) {
            System.out.print(n + " ");
        }

        System.out.println();

        System.out.println(formatArray(nums));
        System.out.println(formatArray(new int[] {4,2,2,4,6,6}));

        //print array in reverse order
        int[] arr = {10, 20, 40, 12, 40};
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(reverseArray(nums)));
        System.out.println(Arrays.toString(reverseArray(new int[] {4,2,2,4,6,6})));
    }

    //Method formatArray that accepts int[] and returns values separated by space as a String
    public static String formatArray(int[] nums) {
        String result = "";
        for (int i = 0; i < nums.length; i++) {
            result += nums[i] + " ";
        }
        return result.trim();
    }

    //reverseArray method - accepts int[] and returns reversed int[]
    public static int[] reverseArray(int[] nums) {
        //declare empty array with same size
        int[] reversed = new int[nums.length];

        for (int i = nums.length-1, j = 0; i >= 0; i--, j++) {
            reversed[j] = nums[i];
        }

        return reversed;
    }
}
