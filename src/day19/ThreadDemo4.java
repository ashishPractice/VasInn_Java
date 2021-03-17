package day19;

public class ThreadDemo4 extends Thread{

    public void run(){
        for (int i = 0; i < 5; i++) {

            try {
                System.out.println(i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }


    public static void main(String[] args) {
        ThreadDemo4 t1 = new ThreadDemo4();
        ThreadDemo4 t2 = new ThreadDemo4();
        ThreadDemo4 t3 = new ThreadDemo4();

        t1.start();
        t2.start();
        t3.start();

    }
}
