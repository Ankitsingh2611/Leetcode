import java.util.Scanner;

public class Large {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        if (a > b) {
            System.out.println("The first number is larger than the second number");
            } else if (a < b) {
                System.out.println("The second number is larger than the first number");
                } else {
                    System.out.println("The numbers are equal");
                    }
    }
}
