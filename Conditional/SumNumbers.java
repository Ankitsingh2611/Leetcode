import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Initialize sums
        int sumNegative = 0;
        int sumPositiveEven = 0;
        int sumPositiveOdd = 0;

        System.out.println("Enter numbers (0 to terminate):");

        while (true) {
            int number = sc.nextInt(); // Read a number
            
            // Check if the number is zero to terminate the loop
            if (number == 0) {
                break;
            }

            // Calculate sums based on the value of the number
            if (number < 0) {
                sumNegative += number; // Sum of negative numbers
            } else if (number > 0) {
                if (number % 2 == 0) {
                    sumPositiveEven += number; // Sum of positive even numbers
                } else {
                    sumPositiveOdd += number; // Sum of positive odd numbers
                }
            }
        }

        // Output the results
        System.out.println("Sum of negative numbers: " + sumNegative);
        System.out.println("Sum of positive even numbers: " + sumPositiveEven);
        System.out.println("Sum of positive odd numbers: " + sumPositiveOdd);
        
        sc.close();
    }
}
