package Interview_practices;

import java.util.Arrays;

public class T04_SumOfDigits {
    public static void main(String[] args) {

        String str1 = "hell234o-jav-34a-cod45ers";
        String[] strArr = str1.split("[^0-9]");
        System.out.println(Arrays.toString(strArr));

        String str = "abc25hf5ll-10#$";
        String[] nums = str.split("[^0-9-]");
        System.out.println(Arrays.toString(nums));

        System.out.println(sumOfDigits(str));

        System.out.println(sumOfDigits("123dfkjs-10sdf99"));
    }

    public static int sumOfDigits(String str) {
        int sum = 0;
        String[] nums = str.split("[^0-9-]");
        for(String each : nums) {
            if (!each.isEmpty()) {
                sum += Integer.parseInt(each);
            }
        }
        return sum;
    }
}
