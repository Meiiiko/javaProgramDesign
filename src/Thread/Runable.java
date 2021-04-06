package Thread;

class MyThreadTwo implements Runnable{
    private String name;
    public MyThreadTwo(String name) {
        this.name = name;
    }
    public void run(){
        for(int i = 0;i<10000;i++){
            System.out.println(name+"运行，i="+i);
        }
    }
}
public class Runable {
    public static void main(String args[]){
        MyThreadTwo threadOne = new MyThreadTwo("线程A");
        MyThreadTwo threadTwo = new MyThreadTwo("线程B");
        Thread threadone = new Thread(threadOne);
        Thread threadtwo = new Thread(threadTwo);
        threadone.start();
        threadtwo.start();
    }
}
