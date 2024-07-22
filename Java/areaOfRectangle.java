import java.util.*;

class areaOfRectangle {
    public static void main(String args[]) {
        int l, b, a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle: ");
        l = sc.nextInt();
        System.out.println("Enter the breadth of rectangle: ");
        b = sc.nextInt();
        a = l * b;
        System.out.println("The area of rectangle is: " + a);
    }
}