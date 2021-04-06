package Tasks.function;

public class SX3_1B{
    public static void main(String[] args) {
        LinearEquation le = new LinearEquation(1,2,3,4,5,6);
        if(le.isSolvable()){
            System.out.println("方程有解:x="+le.getX()+",y="+le.getY());
        }else {
            System.out.println("方程无解");
        }
    }
}
