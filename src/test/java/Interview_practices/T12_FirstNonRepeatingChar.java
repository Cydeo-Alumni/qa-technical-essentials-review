package Interview_practices;

public class T12_FirstNonRepeatingChar {
    //aabccddj
    public static void main(String[] args) {
        System.out.println(firstNonRepeatingChar("aabccddj"));
        System.out.println(firstNonRepeatingCharV2("aabBccddj"));
    }
    public static char firstNonRepeatingChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            boolean uniqueFlag = true;

            for (int j = 0; j < str.length(); j++) {
                if (current == str.charAt(j) && i != j) {
                    uniqueFlag = false;
                    break;
                }
            }

            if (uniqueFlag) return current;
        }
        return 0;
    }

    public static char firstNonRepeatingCharV2(String str) {
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (str.indexOf(current) == str.lastIndexOf(current)) {
                return current;
            }
        }
        return 0;
    }
}
