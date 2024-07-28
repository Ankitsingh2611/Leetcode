import java.util.Scanner;

public class fab {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms: ");
        int n = sc.nextInt();
        int a=0,b=1,c=0;
        System.out.println("Fibonacci Series: ");
        for(int i=0;i<n;i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);

    }
}}
