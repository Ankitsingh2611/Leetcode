import java.util.Scanner;

public class electricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of units consumed: ");
        int units = sc.nextInt();
        double bill = 0.0;
        if (units <= 100) {
            bill = units * 1.20;
            }
            else if (units <= 200) {
                bill = 100 * 1.20 + (units - 100) * 2.0;
            } else {
                bill = 100 * 1.20 + 100 * 2.0 + (units - 200) * 3.0;
            }
    
            System.out.println("The electricity bill for " + units + " units is: $" + bill);
            
            sc.close();
        }
    }
    