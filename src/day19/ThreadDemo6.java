package day19;

public class ThreadDemo6 extends Thread{

    public void run(){
        System.out.println(Thread.currentThread().getName()+"  "+Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        ThreadDemo6 t1= new ThreadDemo6();
        ThreadDemo6 t2= new ThreadDemo6();
        ThreadDemo6 t3= new ThreadDemo6();

        t1.setName("First");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
    }


}
