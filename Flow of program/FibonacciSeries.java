import java.util.Scanner;

public class FibonacciSeries {
    public static void printFibonacciSeries(int n) {
        int num1 = 0, num2 = 1;
        System.out.print("Fibonacci Series of " + n + " numbers: ");

        for (int i = 1; i <= n; ++i) {
            System.out.print(num1 + " ");

            // Compute the next term
            int nextTerm = num1 + num2;
            num1 = num2;
            num2 = nextTerm;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms for the Fibonacci series: ");
        int n = scanner.nextInt();

        printFibonacciSeries(n);
    }
}
