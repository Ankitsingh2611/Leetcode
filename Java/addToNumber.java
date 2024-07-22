import java.util.*;

class addTwoNumber {

    public static void main(String args[]) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        a = sc.nextInt();
        System.out.println("Enter the second number");
        b = sc.nextInt();
        c = a + b;
        System.out.println("The sum of two numbers is " + c);
    }
}