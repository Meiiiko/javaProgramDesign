package Thread;

public class JoinTest extends Thread{
    public static void main(String[] args) {
        JoinTest joinTest = new JoinTest();
        joinTest.start();
        try {
            joinTest.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main is over");
    }

    @Override
    public void run(){
        for (int i=0;i<100;i++){
            System.out.println(i);
        }
    }
}
