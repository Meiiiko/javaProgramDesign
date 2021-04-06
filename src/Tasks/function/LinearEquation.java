package Tasks.function;

public class LinearEquation {
    private int a, b, c, d, e, f;

    LinearEquation(int a, int b, int c, int d, int e, int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public int getD() {
        return d;
    }

    public int getE() {
        return e;
    }

    public int getF() {
        return f;
    }

    public boolean isSolvable() {
        return a * d - b * c != 0;
    }

    public double getX() {
        return (double) (c * e - b * f) / (double) (a * e - b * d);
    }

    public double getY() {
        return (double) (a * f - c * d) / (double) (a * e - b * d);
    }
}
