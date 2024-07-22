import java.util.*;

public class factorial {
    public static void printFactorial(int n) {
        if (n < 0) {
            System.out.println("Factorial of negative number is not defined");
            return;
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFactorial(n);
    }
}
