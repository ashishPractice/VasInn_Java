package day21;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Demo2 {
    public static void main(String[] args) {

        List<Integer> l1 = Arrays.asList(2, 5, 4, 1, 6);

        l1.stream().forEach(i -> System.out.println(i));

        List<Integer> l2 = l1.stream().map(i ->
        {
            i = i * 2;
            return i;
        }).collect(Collectors.toList());
        System.out.println(l2);

        List<Integer> even = l1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println(even);

        List<Integer> odd = l1.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
        System.out.println(odd);

        int sum = l1.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);

        int min = l1.stream().min((a, b) -> a.compareTo(b)).get();
        System.out.println(min);

        int max = l1.stream().max((a, b) -> a.compareTo(b)).get();
        System.out.println(max);


    }
}
