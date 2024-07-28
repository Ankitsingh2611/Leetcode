import java.util.Scanner;

public class DistanceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the x-coordinate of the first point: ");
        double x1 = sc.nextDouble();
        
        System.out.print("Enter the y-coordinate of the first point: ");
        double y1 = sc.nextDouble();
        
        System.out.print("Enter the x-coordinate of the second point: ");
        double x2 = sc.nextDouble();
        
        System.out.print("Enter the y-coordinate of the second point: ");
        double y2 = sc.nextDouble();
        
        double distance = calculateDistance(x1, y1, x2, y2);
        
        System.out.println("The distance between the two points is: " + distance);
        
        sc.close();
    }
    
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
}
