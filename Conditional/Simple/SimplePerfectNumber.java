import java.util.Scanner;

public class SimplePerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();
        int sum = 0;

        // Find and sum the divisors
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i; // Add divisor to sum
            }
        }

        // Check if the sum of divisors equals the number
        if (sum == n) {
            System.out.println(n + " is a perfect number.");
        } else {
            System.out.println(n + " is not a perfect number.");
        }

        sc.close();
    }
}
