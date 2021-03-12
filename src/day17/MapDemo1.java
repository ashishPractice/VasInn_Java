package day17;

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        Map<Integer, String> stdMap = new HashMap<>();

        stdMap.put(100, "Ashish");
        stdMap.put(101, "Roshnee");
        stdMap.put(102, "Kapil");
        stdMap.put(103, "Palistha");

        System.out.println(stdMap);

        System.out.println(stdMap.get(101));

        System.out.println(stdMap.containsKey(101));

        System.out.println(stdMap.containsValue("Ashish"));

        System.out.println(stdMap.size());

        System.out.println(stdMap.isEmpty());

        System.out.println(stdMap.replace(102, "YV"));

        System.out.println(stdMap);

        stdMap.clear();

        System.out.println(stdMap.isEmpty());

    }
}
