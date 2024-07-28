import java.util.Scanner;

public class LCMHCF {
    
    // Method to calculate GCD using Euclidean algorithm
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to calculate LCM
    public static int lcm(int a, int b) {
        return Math.abs(a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input for the two numbers
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        // Calculate GCD and LCM
        int hcf = gcd(a, b);
        int lcm = lcm(a, b);

        // Display the results
        System.out.println("HCF (GCD): " + hcf);
        System.out.println("LCM: " + lcm);
        
        sc.close();
    }
}
