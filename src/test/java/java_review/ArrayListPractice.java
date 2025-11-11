package java_review;

import java.util.*;

public class ArrayListPractice {
    public static void main(String[] args) {
        //create arraylist with values java, SDET, Test
        //iterate arraylist and print out separated by space:
        //Parent                Sub class
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("SDET");
        list.add("Test");
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        for (String each : list) {
            System.out.print(each + " ");
        }
        System.out.println();

        System.out.println(formatArrayList(list));
        List<String> words = new ArrayList<>(List.of("one", "two", "three", "four"));
        words.add("five");
        System.out.println(formatArrayList(words));

        System.out.println(reverseArrayList(words));

        Collections.reverse(list);
        System.out.println("list = " + list);
    }

    /*
    formatArrayList Method accepts arraylist and returns String with values separated by space
     */
    public static String formatArrayList(List<String> list) {
        String result = "";
        for (String each : list) {
            result += each + " ";
        }
        return result.trim();
    }

   /*
    reverseArrayList Method accepts List<String> returns List<String>
    */
    public static List<String> reverseArrayList(List<String> list) {
        List<String> reversed = new ArrayList<>();

        for (int i = list.size()-1; i >= 0; i--) {
            reversed.add(list.get(i));
        }

        return reversed;
    }
}
