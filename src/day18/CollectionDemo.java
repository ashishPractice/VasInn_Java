package day18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();

        l.add(10);
        l.add(5);
        l.add(7);
        l.add(1);

        System.out.println(l);

        // Method 1
        Collections.sort(l);
        System.out.println(l);


        // Method 2
   /*     l.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) {
                    return 1;
                } else {
                    return -1;
                }

            }
        });

        System.out.println(l); */


        Collections.reverse(l);
        System.out.println(l);

        System.out.println(Collections.max(l));

        System.out.println(Collections.min(l));


    }
}
