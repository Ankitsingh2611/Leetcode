import java.util.*;

public class reverse4 {
    public static void main(String[] args) {
        int i, n, s = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        n = sc.nextInt();
        for (i = n; i > 0; i = i / 10)
            s = s * 10 + (i % 10);
        System.out.println("Reverse of the number is " + s);
    }
}