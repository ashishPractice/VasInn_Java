package day20;

import java.util.Random;
import java.util.concurrent.*;

public class CallableDemo2 implements Callable {

    private String name;

    public CallableDemo2(String name){
        this.name= name;
    }


    @Override
    public Integer call() throws Exception {
        Random random = new Random();
        Integer randomNumber = random.nextInt();
        return randomNumber;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService ex = Executors.newSingleThreadExecutor();
        Future<Integer> future = ex.submit(new CallableDemo2("Task"));
        System.out.println(future.isDone());
        Integer n= future.get();
        System.out.println(n);
        ex.shutdown();
        System.out.println(future.isDone());
        System.out.println(future.isCancelled());

    }
}
