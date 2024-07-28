import java.util.Scanner;

public class FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt for the principal amount
        System.out.print("Enter the principal amount (initial investment): ");
        double principal = sc.nextDouble();
        
        // Prompt for the annual interest rate
        System.out.print("Enter the annual interest rate (in percentage): ");
        double interestRate = sc.nextDouble();
        
        // Convert interest rate from percentage to decimal
        double rate = interestRate / 100;
        
        // Prompt for the number of years
        System.out.print("Enter the number of years: ");
        int years = sc.nextInt();
        
        // Calculate future value
        double futureValue = principal * Math.pow(1 + rate, years);
        
        // Output the result
        System.out.printf("Future value of the investment: %.2f\n", futureValue);
        
        sc.close();
    }
}
