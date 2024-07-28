import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Area of triangle");
        System.out.println("Enter the base of the triangle");
        double base = sc.nextDouble();
        System.out.println("Enter the height of the triangle");
        double height = sc.nextDouble();
        double area = (base * height) / 2;
        System.out.println("The area of the triangle is " + area);
    }
}
