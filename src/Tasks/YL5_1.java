package Tasks;

import java.util.Scanner;

public class YL5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一堆数据元素个数：");
        int num = scanner.nextInt();
        scanner.close();
        int[] myArray = new int[num];
        myArray = getArray(num);
        System.out.println("生成数组为：");
        for (int i = 0; i < num; i++) {
            System.out.println(myArray[i] + " ");
        }
        System.out.println();
        System.out.println("最大值为：" + getMax(myArray));
    }

    public static int[] getArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = 1 + (int) (Math.random() * 100);
        }
        return a;
    }

    public static int getMax(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
