import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        int sum = 0;

        // Calculate the sum of digits
        while (number != 0) {
            sum += number % 10; // Add the last digit to the sum
            number /= 10; // Remove the last digit
        }

        // Output the result
        System.out.println("Sum of digits: " + sum);
        
        sc.close();
    }
}
