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
    }

    /*
    formatArrayList Method accepts arraylist and returns String with values separated by space
     */
}
