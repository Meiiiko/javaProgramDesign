package Thread;

class MyThread extends Thread{
    private String name;
    public MyThread(String name){
        this.name=name;
    }
    public void run(){
        for(int i = 0;i<10000;i++){
            System.out.println(name+"运行，i="+i);
        }
    }
}
public class Extend {
    public static void main(String args[]){
        MyThread threadOne = new MyThread("线程A");
        MyThread threadTwo = new MyThread("线程B");
        threadOne.start();
        threadTwo.start();
    }
}
