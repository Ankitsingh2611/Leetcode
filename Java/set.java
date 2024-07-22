import java.util.*;

public class set {
    public static void main(String[] args) {
        int n = 5;
        int pos = 1;
        int bitMark = 1 << pos;
        int newNumber = n | bitMark;
        System.out.println(newNumber);
    }
}
