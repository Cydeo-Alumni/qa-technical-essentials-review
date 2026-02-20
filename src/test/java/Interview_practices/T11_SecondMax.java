package Interview_practices;

public class T11_SecondMax {
    public static void main(String[] args) {
        int[] nums = {32,54,65,23,90, 95, 11, 98};
        System.out.println(findSecondMax(nums));
        System.out.println(findSecondMaxV2(nums));
    }

    public static int findSecondMax(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int each: nums) {
            if (each > largest) {
                secondLargest = largest;
                largest = each;
            } else if (each > secondLargest) {
                secondLargest = each;
            }
        }

        return secondLargest;
    }

    public static int findSecondMaxV2(int[] nums) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                secondLargest = largest;
                largest = nums[i];
            }
        }

        return secondLargest;
    }
}
