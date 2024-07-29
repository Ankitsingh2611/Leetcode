import java.util.Scanner;

public class SimpleHCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for the two numbers
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        // Calculate HCF using the Euclidean algorithm
        while (b != 0) {
            int temp = b;
            b = a % b; // Update b to the remainder of a divided by b
            a = temp; // Update a to the previous value of b
        }

        // Output the result
        System.out.println("HCF (GCD) is: " + a);
        
        sc.close();
    }
}
