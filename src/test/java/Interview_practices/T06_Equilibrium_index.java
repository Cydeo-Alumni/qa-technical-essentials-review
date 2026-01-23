package Interview_practices;

public class T06_Equilibrium_index {
/*
[2, 3, 5, 1, 4] => 2
[10, 0, 3, 3, 3, 1] => 1
[2, 2, 6, 1, 5, 5] => 3
 */
    public static void main(String[] args) {
        int[] nums = {2, 3, 999, 1, 4};
        System.out.println(equilibriumIndex(nums));
    }

    public static int equilibriumIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int leftSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += nums[j];
            }

            int rightSum = 0;
            for (int j = i + 1; j < nums.length; j++) {
                rightSum += nums[j];
            }

            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }
}
