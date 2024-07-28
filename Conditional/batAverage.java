import java.util.Scanner;

public class batAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of matches");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
        System.out.println("Enter score of " +i +"match");
        int score = sc.nextInt();
        sum = sum + score;
        
        }
        n = sum/2;
        System.out.println("Average score is " + n);
    }
}
