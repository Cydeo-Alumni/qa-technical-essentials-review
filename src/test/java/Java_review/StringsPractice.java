package Java_review;

public class StringsPractice {
    public static void main(String[] args) {
        //1) declare a string with some value and print each character
        //separated by space : "hello" -> "h e l l o"

        String str = "hello";
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }

        System.out.println();
        System.out.println(addSpace("java"));
        String rs = addSpace("hello");
        System.out.println("rs = " + rs);

        //Print each character in reverse. apple -> elppa
        String word = "apple";
        for (int i = word.length()-1; i >= 0; i--) {
            System.out.print(word.charAt(i));
        }

        System.out.println();
        System.out.println(reverseString("banana"));

        System.out.println("Civic = " + isPalindrome("Civic"));
        System.out.println("Nurses Run = " + isPalindrome("Nurses Run"));
        System.out.println("Wooden spoon = " + isPalindrome("Wooden spoon"));
    }

    //method addSpace that accepts string and returns with spaces in between
    //addSpace("java") => "j a v a"
    public static String addSpace(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            result += str.charAt(i) + " ";
        }

        return result;
    }

    //method reverseString that accepts string and returns reversed String
    public static String reverseString(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    //method isPalindrome that accepts string and returns boolean
    //ignore case differences and spaces
    //Mom -> true. racecar -> true
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase().replace(" ", "");
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        return reversed.equals(str);
//        if (reversed.equals(str)) {
//            return true;
//        } else {
//            return false;
//        }
    }
}
