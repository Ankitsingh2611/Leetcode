import java.util.*;

public class get {
    public static void main(String[] args) {
        int n = 5;
        int pas = 2;
        int bitMark = 1 << pas;
        if ((bitMark & n) == 0) {
            System.out.println("Bit was zero");
        } else {
            System.out.println("Bit was one");
        }
    }
}
