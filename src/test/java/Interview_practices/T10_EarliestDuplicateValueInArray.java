package Interview_practices;

import java.util.*;

public class T10_EarliestDuplicateValueInArray {
    public static void main(String[] args) {
        int[] nums = {2, 1, 3, 7, 3, 2, 0};
        System.out.println(findFirstDup(nums));
        System.out.println(findFirstDupWithLoop(nums));
    }
    //{2, 1, 3, 7, 3, 2, 0}
    public static int findFirstDup(int[] nums) {
        if (nums == null || nums.length < 2) {
            return -1;
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return nums[i];
            } else {
                set.add(nums[i]);
            }
        }

        return -1;
    }

    public static int findFirstDupWithLoop(int[] nums) {
        if (nums == null || nums.length < 2) {
            return -1;
        }
        int dupIndex = nums.length;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    if (j < dupIndex) {
                        dupIndex = j;
                    }
                }
            }
        }

        return nums[dupIndex];
    }
}
