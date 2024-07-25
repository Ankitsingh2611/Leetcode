import java.util.Scanner;

public class currency {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter rupee");
        int rupee = scan.nextInt();
        int dollar = rupee / 70;
        System.out.println("Dollar is " + dollar);
    }
}
