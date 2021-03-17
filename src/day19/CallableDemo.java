package day19;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallableDemo implements Callable {

    @Override
    public Integer call() throws Exception {
        int a = 5;
        int b = 10;
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        CallableDemo c = new CallableDemo();

        try {
           Integer sum=  c.call();
            System.out.println(sum);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
