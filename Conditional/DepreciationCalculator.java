import java.util.Scanner;

public class DepreciationCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the initial cost of the asset: ");
        double cost = sc.nextDouble();
        
        System.out.print("Enter the salvage value of the asset: ");
        double salvageValue = sc.nextDouble();
        
        System.out.print("Enter the useful life of the asset (in years): ");
        int usefulLife = sc.nextInt();
        
        double annualDepreciation = calculateDepreciation(cost, salvageValue, usefulLife);
        
        System.out.println("The annual depreciation expense is: $" + annualDepreciation);
        
        sc.close();
    }
    
    public static double calculateDepreciation(double cost, double salvageValue, int usefulLife) {
        return (cost - salvageValue) / usefulLife;
    }
}
