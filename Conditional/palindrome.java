import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0;
        while (temp != 0) {
            int rem = temp % 10;
            sum = sum * 10 + rem;
            temp /= 10;
        }
        if (n == sum) {
            System.out.println(n + " is a palindrome number");
            } else {
                System.out.println(n + " is not a palindrome number");
                }
    }
}
