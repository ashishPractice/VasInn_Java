package day17;

import java.util.HashMap;
import java.util.Map;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<Integer, String> stdMap = new HashMap<>();

        stdMap.put(100, "Ashish");
        stdMap.put(101, "Roshnee");
        stdMap.put(102, "Kapil");
        stdMap.put(103, "Palistha");

        System.out.println(stdMap);

        for (Map.Entry<Integer, String> std : stdMap.entrySet()) {
            System.out.println(std.getKey() + " :: " + std.getValue());
        }
    }
}
