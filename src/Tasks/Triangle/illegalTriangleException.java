package Tasks.Triangle;

public class illegalTriangleException extends Exception{
    private double a,b,c;

    public illegalTriangleException(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return "illegalTriangleException{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                "无法组成有效的三角形";
    }
}
