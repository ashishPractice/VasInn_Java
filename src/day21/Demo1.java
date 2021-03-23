// USe of lambda expression
// can be cdone in functional Interface i.e. which have only one function
package day21;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Demo1 {

    public static void main(String[] args) {
//        Thread t = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Hello from Thread");
//            }
//        });

//        This whole process can be done using lamdba expression

        new Thread(() -> System.out.println("Hello from Thread")).start();

        // More than two line of code
        new Thread(() -> {
            System.out.println("Line 1");
            System.out.println("Line 2");
        }).start();


        List<Integer> l = Arrays.asList(2,5,4,1,6);

        for(int a: l){
            System.out.println(a);
        }

        l.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer i) {
                System.out.println(i);
            }
        });

        // Using lamdba expression
        l.forEach(i -> System.out.println(i));


        l.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1>o2){
                    return 1;
                }

                else{
                    return -1;
                }
            }
        });
        System.out.println(l);

        List<Integer> l1 = Arrays.asList(2,5,4,1,6);

        // Using lambda express
        l1.sort((o1,o2) ->{

                if(o1>o2){
                    return 1;
                }
                else {
                    return -1;
                }
        });
        System.out.println(l1);
    }
}
