public class Circle {
    private static double PI;
    private int radius;

    public Circle() {
    }

    public Circle(int PI, int radius) {
        Circle.PI = PI;
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }

    public void setPI(double PI) {
        Circle.PI = PI;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public static int area(int radius){
        return (int) (PI * (radius * radius));


    }

    public  static  int circumference(int radius){
        return (int) ((radius * 2) * PI);
    }

}
