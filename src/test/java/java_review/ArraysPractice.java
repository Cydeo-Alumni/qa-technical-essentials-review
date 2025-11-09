package java_review;

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
    }
}
