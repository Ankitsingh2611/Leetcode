import java.util.Scanner;

public class isoscelesTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter height");
        int n = sc.nextInt();
        System.out.println("Enter base");
        int m = sc.nextInt();
        int area = (n*m) *1/2 ;
        System.out.println("Area of isosceles triangle is " + area);
    }
}
