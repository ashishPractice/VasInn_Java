package day17;


import java.util.LinkedList;
import java.util.List;

public class LinkListDemo {
    public static void main(String[] args) {
        List<Integer> al = new LinkedList<>();
        al.add(10);
        al.add(20);
        al.add(30);

        System.out.println(al);
        al.set(2, 02);
        System.out.println(al);
        System.out.println(al.size());
        System.out.println(al.get(2));
        al.remove(4);
        System.out.println(al);
        System.out.println(al.indexOf(30));
        System.out.println(al.isEmpty());
        //  al.clear();
        System.out.println(al);

        System.out.println("=========================");
        List<Integer> all = new LinkedList<>();
        all.add(45);
        System.out.println(all);
        all.addAll(al);
        System.out.println(all);
        all.addAll(0,al);
        System.out.println(all);
        //  all.removeAll(al);
        // System.out.println(all);
        all.retainAll(al);
        System.out.println(all);
        System.out.println(all.contains(2));
    }
}
