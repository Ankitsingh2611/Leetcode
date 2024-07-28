import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        
        double sum = 0.0;
        
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter number " + i + ": ");
            double number = sc.nextDouble();
            sum += number;
        }
        
        double average = sum / n;
        
        System.out.println("The average of the entered numbers is: " + average);
        
        sc.close();
    }
}
