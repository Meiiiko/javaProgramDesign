package Tasks;
import java.util.Scanner;
public class isPrimeNumber {
    public static void main(String[] args) {
        while (true){
        int number = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个整数:");
        while(true) {							//这里true替换成input.hasNext()也行
            try {
                number = input.nextInt();			//如果输入的不为整数，会抛出一个InputMismatchException异常
                break;								//如果是整数，则退出while循环
            }catch(Exception e) {				//这里用Exception来捕获这个异常
                System.out.println("您输入的不是整数!请继续输入一个整数:");
                input.next();						//继续输入
            }
        }
        if(isPrime(number)){
            System.out.println("这个数是质数！");
        }else{
            System.out.println("这个数不是质数！");
        };
        }
    }
    public static boolean isPrime(int num){
        if(num == 1){
            return false;
        }
        for(int i=2;i<Math.sqrt(num);i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
