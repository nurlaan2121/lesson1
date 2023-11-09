import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setPI(3.14);
        circle.setRadius(5);
        System.out.println("Ploshad : " + Circle.circumference(9));
        System.out.println("Okrujnost: " + Circle.area(7));
    }
}
