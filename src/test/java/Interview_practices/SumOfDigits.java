package Interview_practices;

/*
 "123" -> 6
 "abc12dc-4" -> -1
 "@#2+3_ab" -> 5
 -> another way : "abc12dc4" -> 16
 */
public class SumOfDigits {

    public static void main(String[] args) {
        System.out.println(sumOfDigits("abc12dc4"));
        System.out.println(sumOfDigits("123"));
        System.out.println(sumOfDigits("@#2+3_ab"));
    }

    public static int sumOfDigits(String str) {
        int sum = 0;
//        for (char each : str.toCharArray()) {
//        }
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (Character.isDigit(each)) {
                 sum += Character.getNumericValue(each);
            }
        }

        return sum;
    }
}
