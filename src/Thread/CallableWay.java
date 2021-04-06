package Thread;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

class MyThreadcall implements java.util.concurrent.Callable<String>{
    private int ticket = 5;
    @Override
    public String call() throws Exception {
        for(int x = 0;x<100;x++){
            if(this.ticket>0){
                System.out.println("卖票,ticket= "+this.ticket--);
            }
        }
        return "票已卖完";
    }

}
public class CallableWay {
    public static void main(String args[]) throws ExecutionException, InterruptedException {
        MyThreadcall mt1 = new MyThreadcall();
        MyThreadcall mt2 = new MyThreadcall();
        FutureTask<String> task1=new FutureTask<String>(mt1);
        FutureTask<String> task2=new FutureTask<String>(mt2);
        new Thread(task1).start();
        new Thread(task2).start();
        System.out.println("A线程返回结果:"+task1.get());
        System.out.println("B线程返回结果:"+task2.get());
    }
}
