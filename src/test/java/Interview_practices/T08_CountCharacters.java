package Interview_practices;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class T08_CountCharacters {
    public static void main(String[] args) {
        String str = "cocacola";
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char each : str.toCharArray()) {
            if (map.containsKey(each)) {
                map.put(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }
        }
        System.out.println(map);
    }
}
