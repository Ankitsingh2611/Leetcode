import java.util.Scanner;

public class fabonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no you want to add");
    int n = sc.nextInt();
    int a = 0, b = 1, c = 0;
    for (int i = 1; i <= n; i++) {
        System.out.println(c);
        c = a + b;
        a = b;
        b = c;
    }
    System.out.println(a+b);
    }
}
