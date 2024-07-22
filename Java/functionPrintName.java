import java.util.*;;

public class functionPrintName {
    public static void printMyName(String name) {
        System.out.println("Hello, My name is " + name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        printMyName(name);
    }
}
