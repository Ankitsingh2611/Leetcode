import java.util.Scanner;

public class sfactorial {
    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to find its factorial: ");
        int number = scanner.nextInt();
        
        long fact = factorial(number);
        System.out.println("The factorial of " + number + " is: " + fact);
    }
}
