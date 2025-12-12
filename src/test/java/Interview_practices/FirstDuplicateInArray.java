package Interview_practices;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicateInArray {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 0, 3, 8, 8 };
        System.out.println(findDuplicate(nums));

        System.out.println(findDuplicateV2(nums));
    }
    //[1, 3, 0, 3, 8, 8]
    //bruteforce approach - O(n2)
    public static int findDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return nums[i];
                }
            }
        }
        throw new RuntimeException("Duplicate number not found");
    }

    //O(n) time complexity
    public static int findDuplicateV2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int each : nums) {
            if (set.contains(each)) {
                return each;
            } else {
                set.add(each);
            }
        }
        throw new RuntimeException("Duplicate number not found");
    }
}
