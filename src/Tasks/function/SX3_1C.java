package Tasks.function;

import java.util.Scanner;

public class SX3_1C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请选择要处理的方程：");
            System.out.println("一元一次方程——1  二元一次方程——2 退出——3");
            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("请输入一元二次方程的3个系数(空格隔开)");
                    QuadraticEquation quadraticEquation = new QuadraticEquation(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                    if (quadraticEquation.getDiscriminan() >= 0) {
                        System.out.println("x1=" + quadraticEquation.getRoot() + ",x2=" + quadraticEquation.getRootTwo());
                    } else {
                        System.out.println("方程无实根!");
                    }
                    break;
                case 2:
                    System.out.println("请输入二元一次方程的六个系数(空格隔开)");
                    LinearEquation linearEquation = new LinearEquation(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                    if (linearEquation.isSolvable()) {
                        System.out.println("X=" + linearEquation.getX() + ",Y=" + linearEquation.getY());
                    } else {
                        System.out.println("方程无解");
                        break;
                    }
                case 3:
                    System.out.println("再见！");
                    return;
            }
        }
    }
}
