package day17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        System.out.println(al);
        al.add(1, 15);

        System.out.println(al.get(0));
        System.out.println(al.get(1));
        System.out.println(al.get(2));

        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }
        System.out.println("===============");

        for (int i : al) {
            System.out.println(i);
        }

        System.out.println("==================");

        Iterator<Integer> it = al.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("=================");

        ListIterator<Integer> li = al.listIterator();
        while(li.hasNext()){
            System.out.println(li.next());
        }

        System.out.println("====================");

        while(li.hasPrevious()){
            System.out.println(li.previous());
        }

        System.out.println("============");

        al.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.println(i);
            }
        });

    }
}
