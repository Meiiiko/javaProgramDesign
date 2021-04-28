package Thread;

import java.util.Date;

public class SleepTest extends Thread{
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            System.out.println("Time by now:"+new Date());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
