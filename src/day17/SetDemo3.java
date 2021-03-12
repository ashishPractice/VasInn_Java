package day17;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo3 {

    public static void main(String[] args) {

        // display is random and duplicate is ignored
        Set<Integer> s =  new HashSet<>();
        s.add(20);
        s.add(5);
        s.add(10);
        s.add(20);
        System.out.println("Hash set is:: "+ s);

        System.out.println("===================");

        // duplicate is ignored and insertion order is maintained
        Set<Integer> s1 =  new LinkedHashSet<>();
        s1.add(20);
        s1.add(5);
        s1.add(10);
        s1.add(20);
        System.out.println("LinkedHash set is:: "+ s1);

        System.out.println("===================");

        // Duplicated is ignored and displayed in natural order(ascending order)
        Set<Integer> s2 =  new TreeSet<>();
        s2.add(20);
        s2.add(5);
        s2.add(10);
        s2.add(20);
        System.out.println("TreeHash set is:: "+ s2);

    }
}
