package day17;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo1 {
    public static void main(String[] args) {

        /*
        Does not mantains insertion order, its random
        Ignore the duplicate
        Index base operation cannot be done
         */
        Set<Integer> s =  new HashSet<>();
        s.add(10);
        s.add(20);
        s.add(10);
        s.add(40);
        System.out.println(s);


        System.out.println("=================");
        List<Integer> lst = new ArrayList<>();
        lst.add(10);
        lst.add(20);
        lst.add(10);
        lst.add(40);
        System.out.println(lst);

    }
}
