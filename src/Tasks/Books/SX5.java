package Tasks.Books;

import java.util.Scanner;
public class SX5 {
    public static void main(String[] args) {
        Scanner val = new Scanner(System.in);
        boolean t = true;
        while (t) {
            System.out.print("1-—添加 2——删除 3——查询 4——显示全部 5——退出 请选择：");
            switch (val.nextInt()) {
                case 1:
                Books books = new Books();
                String id = val.next();
                if (books.chkID(id)) {
                    books.id = id;
                    books.name = val.next();
                    books.author = val.next();
                    books.num = val.nextInt();
                } else {
                    System.out.println("编号输入错误");
                    val.next();
                    val.next();
                    val.next();
                    continue;
                }
                System.out.println(books.add());
                break;
                case 2:
                    System.out.println("输入要删除的编号：");
                    System.out.println(Books.del(val.next()));
                    break;
                case 3:
                    System.out.println("输入要查询的编号：");
                    Books.show(val.next());
                    break;
                case 4:
                    Books.showAll();
                    break;
                case 5:
                    t = false;
                    System.out.println("bye");
                    break;
            }
        }
        val.close();
    }
}
