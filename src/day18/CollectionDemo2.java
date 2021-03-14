package day18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionDemo2 {

    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();

        l.add(10);
        l.add(5);
        l.add(7);
        l.add(1);

        System.out.println(l);

        // In unmodifiableList we cannot modified the list
        List<Integer> ll = Collections.unmodifiableList(l);
        System.out.println(ll);
        ll.add(40);
    }
}
