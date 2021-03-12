package day17;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo3 {
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

        System.out.println("====================================");

        Map<Integer, String> stdMap1 = new LinkedHashMap<>();

        stdMap1.put(100, "Ashish");
        stdMap1.put(101, "Roshnee");
        stdMap1.put(102, "Kapil");
        stdMap1.put(103, "Palistha");

        System.out.println(stdMap1);

        for (Map.Entry<Integer, String> std : stdMap1.entrySet()) {
            System.out.println(std.getKey() + " :: " + std.getValue());
        }

        System.out.println("====================================");
        Map<Integer, String> stdMap2 = new TreeMap<>();

        stdMap2.put(100, "Ashish");
        stdMap2.put(101, "Roshnee");
        stdMap2.put(10, "Kapil");
        stdMap2.put(103, "Palistha");

        System.out.println(stdMap2);

        for (Map.Entry<Integer, String> std : stdMap2.entrySet()) {
            System.out.println(std.getKey() + " :: " + std.getValue());
        }

    }
}
