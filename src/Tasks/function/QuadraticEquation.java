package Tasks.function;

public class QuadraticEquation {
    private int a, b, c;

    public QuadraticEquation(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getDiscriminan() {
        return b * b - 4 * a * c;
    }

    public double getRoot() {
        return (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    }

    public double getRootTwo() {
        return (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
    }
}
