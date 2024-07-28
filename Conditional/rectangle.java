import java.util.*;
public class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lenght of rectangle");
        double l = sc.nextDouble();
        System.out.println("Enter breadth of rectangle");
        double b = sc.nextDouble();
        double area = l * b;
        System.out.println("Area of rectangle is " + area);
    }
}
