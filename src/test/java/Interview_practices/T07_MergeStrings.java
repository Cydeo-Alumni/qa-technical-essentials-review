package Interview_practices;

public class T07_MergeStrings {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "xyz";
        String result = "" + str1.charAt(0) + str2.charAt(0) +
                            str1.charAt(1) + str2.charAt(1) +
                            str1.charAt(2) + str2.charAt(2);
        System.out.println("result = " + result);

        System.out.println(mergeStrings(str1, str2));
        System.out.println(mergeStrings("java", "code"));
        System.out.println(mergeStrings("java", "javascript"));
        System.out.println(mergeStrings("python", "ruby"));
    }

    public static String mergeStrings(String str1, String str2) {
        String result = "";
        //int minLength = Math.min(str1.length(), str2.length());
        for (int i = 0; i < Math.min(str1.length(), str2.length()); i++) {
            result += str1.charAt(i) +""+ str2.charAt(i);
            //if we reach end of str1-add remaining characters of str2
            if (i == str1.length()-1 && i < str2.length()-1) {
                result += str2.substring(i+1);
            //if we reach end of str2-add remaining characters of str1
            }else if (i < str1.length()-1 && i == str2.length()-1) {
                result += str1.substring(i+1);
            }
        }
        return result;
    }
}
