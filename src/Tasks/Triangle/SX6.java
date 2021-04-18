package Tasks.Triangle;

import java.util.Scanner;

public class SX6 {
    public static void main(String[] args) {
        Scanner val = new Scanner(System.in);
        System.out.println("请输入三角形的三条边长:");
        while (true){
            double a = val.nextDouble();
            double b = val.nextDouble();
            double c = val.nextDouble();
            try {
                Triangle triangle = new Triangle(a,b,c);
                System.out.println("三角形面积为："+triangle.getArea());
                System.out.println("是等边直角三角形吗？"+triangle.isIsoscelesTriangle());
                System.out.println("是等边三角形吗？"+triangle.isEquilateralTriangle());
                System.out.println("是锐角三角形吗？"+triangle.isAcuteTriangle());
                System.out.println("是钝角三角形吗？"+triangle.isObtuseTriangle());
                break;
            }catch (illegalTriangleException exception){
                System.out.println(exception.toString());
                System.out.println("请重新输入:");
            }
        }
        val.close();
    }
}
