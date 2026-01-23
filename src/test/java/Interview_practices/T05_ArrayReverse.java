package Interview_practices;

import java.util.ArrayList;
import java.util.Arrays;

public class T05_ArrayReverse {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40 , 50};
        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(nums));

        for (int i = 0, j = nums.length-1; i < nums.length / 2; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        System.out.println(Arrays.toString(nums));

        int[] nums2 = {44, 55, 66, 77 , 100, 88};
        int[] reversed = reverseArray(nums2);
        System.out.println(Arrays.toString(reversed));
    }

    public static int[] reverseArray(int[] nums) {
        for (int i = 0; i < nums.length/2; i++) {
            int temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }
        return nums;
    }
}
