import java.util.Scanner;

public class SimpleLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for the two numbers
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        // Calculate LCM
        int lcm = (a > b) ? a : b; // Start with the greater of the two numbers

        while (true) {
            // Check if lcm is divisible by both a and b
            if (lcm % a == 0 && lcm % b == 0) {
                break; // Found the LCM
            }
            lcm++; // Increment LCM candidate
        }

        // Output the result
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
        
        sc.close();
    }
}
