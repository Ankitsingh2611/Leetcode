import java.util.*;

class simple {
    public static void main(String args[]) {
        int si, p, r, t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principal amount");
        p = sc.nextInt();
        System.out.println("Enter the time");
        t = sc.nextInt();
        System.out.println("Enter the rate");
        r = sc.nextInt();
        si = (p * r * t) / 100;
        System.out.println("Simple Interest is " + si);
    }
}
