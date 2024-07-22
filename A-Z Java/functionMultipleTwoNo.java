import java.util.*;

public class functionMultipleTwoNo {
    public static int calculateProduct(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = calculateProduct(a, b);
        System.out.println("The product of two numbers is " + product);
    }

}
