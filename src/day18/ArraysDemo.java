package day18;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] arr = {10, 20, 80, 40, 50};

        System.out.println(arr);

        for (int i: arr){
            System.out.println(i);
        }

        //Next Method
        System.out.println(Arrays.toString(arr));

        //to sort
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //Array to list
        List<Integer> l = Arrays.asList(10, 20, 30, 40);
        System.out.println(l);


    }
}
