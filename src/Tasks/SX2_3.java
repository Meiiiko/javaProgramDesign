package Tasks;

import java.util.Calendar;
import java.util.Scanner;

class Person {
    private int id;
    private int age;
    private String sex;

    public Person() {
    }

    public Person(int id, int age, String sex) {
        this.id = id;
        this.age = age;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}

public class SX2_3 {
    public static void main(String[] args) {
        System.out.print("请您输入身份证号:");
        Scanner idcard = new Scanner(System.in);
        String id = idcard.nextLine();
        Person person = new Person();
        if (id.length() != 18) {
            System.out.println("长度错误，请输入正确的身份证号!");
        }
        int year = Integer.parseInt(id.substring(6, 10));
        int month = Integer.parseInt(id.substring(10, 12));
        int day = Integer.parseInt(id.substring(12, 14));
        int gender = Integer.parseInt(id.substring(16, 17));
        if (gender % 2 == 0) {
            String sex = "女";
            person.setSex(sex);
        } else {
            String sex = "男";
            person.setSex(sex);
        }
        int monthNow = Calendar.MONTH + 1;
        int dayNow = Calendar.DAY_OF_MONTH;
        if (monthNow > month) {
            int age = (Calendar.getInstance().get(Calendar.YEAR) - year);
            person.setAge(age);
        } else if (month == monthNow) {
            if (dayNow >= day) {
                int age = (Calendar.getInstance().get(Calendar.YEAR) - year);
                person.setAge(age);
            } else {
                int age = (Calendar.getInstance().get(Calendar.YEAR) - year) - 1;
                person.setAge(age);
            }
        } else {
            int age = (Calendar.getInstance().get(Calendar.YEAR) - year) - 1;
            person.setAge(age);
        }
        System.out.println("您的身份证号为:"+id);
        System.out.println("由此您的年龄为:"+person.getAge()+",性别:"+person.getSex());
    }
}
