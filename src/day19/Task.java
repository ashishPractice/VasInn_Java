package day19;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task implements Runnable{

    private String name;
    public Task(String name){
        this.name= name;
    }


    @Override
    public void run() {
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss a");
        for (int i = 0; i <= 5; i++) {
            if(i==0){
                System.out.println("Initilaizing time for "+name+" "+sd.format(new Date()));
            }else{
                System.out.println("Running time for "+name+" "+sd.format(new Date()));
            }
        }

        System.out.println(name+" Completed");

    }
}
