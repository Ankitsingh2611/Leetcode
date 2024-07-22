import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class addThroughBuffer {
    public static void main(String[] args) throws IOException {
        int a, b;
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter value of a:");
        a = Integer.parseInt(obj.readLine());
        System.out.println("Enter value of b:");
        b = Integer.parseInt(obj.readLine());
        System.out.println("Add=" + (a + b));
    }
}