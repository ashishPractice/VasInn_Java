package day19;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskTest {

    public static void main(String[] args) {
        //Pool
        ExecutorService ex = Executors.newFixedThreadPool(3);
        ex.execute(new Task("Task1"));
        ex.execute(new Task("Task2"));
        ex.execute(new Task("Task3"));
        ex.execute(new Task("Task4"));
        ex.execute(new Task("Task5"));
        ex.shutdown();

    }
}
