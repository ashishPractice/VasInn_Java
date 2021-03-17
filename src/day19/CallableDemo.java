package day19;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallableDemo implements Callable {

    String name;

    public CallableDemo(String name){
        this.name = name;
    }
    @Override
    public Integer call() throws Exception {

        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {

        ExecutorService ex = Executors.newFixedThreadPool(3);
        ex.submit(new CallableDemo("Call1"));
        ex.submit(new CallableDemo("Call2"));
        ex.submit(new CallableDemo("Call3"));
        ex.shutdown();

    }
}
