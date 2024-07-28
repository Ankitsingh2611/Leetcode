import java.util.Scanner;

public class NcrNprCalculator {

    // Method to calculate factorial
    public static long factorial(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to calculate nCr
    public static long nCr(int n, int r) {
        if (r > n) {
            return 0; // nCr is not defined for r > n
        }
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    // Method to calculate nPr
    public static long nPr(int n, int r) {
        if (r > n) {
            return 0; // nPr is not defined for r > n
        }
        return factorial(n) / factorial(n - r);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for n and r
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of r: ");
        int r = sc.nextInt();

        // Calculate nCr and nPr
        long combinations = nCr(n, r);
        long permutations = nPr(n, r);

        // Display the results
        System.out.println("nCr (Combinations): " + combinations);
        System.out.println("nPr (Permutations): " + permutations);

        sc.close();
    }
}
