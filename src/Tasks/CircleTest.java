package Tasks;

abstract class Shape {
    abstract double getArea();

    abstract double getPrimeter();
}

class Circle extends Shape {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getArea() {
        return Math.PI * r * r;
    }

    public double getPrimeter() {
        return 2 * Math.PI * r;
    }
}

public class CircleTest {
    public static void main(String[] args) {
        Shape s = new Circle(3);
        System.out.println(s.getArea());
        System.out.println(s.getPrimeter());
    }
}
