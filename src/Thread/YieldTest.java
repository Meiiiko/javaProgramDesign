package Thread;

public class YieldTest extends Thread{
    public static void main(String[] args) {
        YieldTest hlt = new YieldTest();
        YieldTest llt = new YieldTest();
        hlt.start();
        llt.start();
    }

    @Override
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName());
            if (i == 5) {
                Thread.yield();
            }
        }
    }
}
