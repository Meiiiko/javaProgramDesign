package Tasks.Triangle;

public class Triangle {
    private double a,b,c;
    public Triangle(double a,double b,double c)throws illegalTriangleException{
        if(a+b>c&&b+c>a&&c+a>b){
            this.a = a;
            this.b = b;
            this.c = c;
        }else {
            throw new illegalTriangleException(a,b,c);
        }
    }
    public double getArea(){
        double p = (a + b + c)/2.0;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    public boolean isEquilateralTriangle(){
        return a == b && b == c;
    }
    public boolean isIsoscelesTriangle(){
        double minOne=0,minTwo=0,minThree=0;
        double max= Math.max((Math.max(a, b)), c);
        if(a<max){
            minOne = a;
        }if(b<max){
            minTwo = b;
        }if(c<max){
            minThree = c;
        }
        if(minOne*minOne+minTwo*minTwo+minThree*minThree==max*max){
            return a==b||c==a||b==c;
        }
        return false;
    }
    public boolean isObtuseTriangle(){
        return a*a>b*b+c*c||b*b>a*a+c*c||c*c>a*a+b*b;
    }
    public boolean isAcuteTriangle(){
        return a*a<b*b+c*c||b*b<a*a+c*c||c*c<a*a+b*b;
    }
}
