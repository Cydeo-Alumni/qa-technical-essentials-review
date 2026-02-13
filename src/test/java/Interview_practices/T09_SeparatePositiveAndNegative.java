package Interview_practices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class T09_SeparatePositiveAndNegative {
    public static void main(String[] args) {
        int[] nums = {1, 4, -3, 10, -55, -1, 45, -7};
        //Stream: source -> intermediate operations -> output
        System.out.println(Arrays.toString(nums));
        int[] positive = Arrays.stream(nums).filter(n -> n > 0).toArray();
        System.out.println("Positive: " + Arrays.toString(positive));
        Arrays.stream(nums).forEach(n -> System.out.println("n = " + n));

        long negativeCount = Arrays.stream(nums).filter(each -> each < 0).count();
        System.out.println("negative = " + negativeCount);

        int[] negative = Arrays.stream(nums).filter(n -> n < 0).toArray();
        System.out.println(Arrays.toString(negative));

        int[] positiveNums = getPositiveNums(new int[]{ 0,3,2,1,4, -3, -9, -1});
        System.out.println(Arrays.toString(positiveNums));

        List<String> words = new ArrayList<>(List.of("hi", "java", "cava", "ana"));
        List<String> wordsA = words.stream().filter(word -> word.contains("a")).toList();
        System.out.println("wordsA = " + wordsA);
    }

    public static int[] getPositiveNums(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        int[] pos = Arrays.stream(nums).filter(n -> n > 0).toArray();
        return pos;
    }
}
