import java.util.*;

public class clear {
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        int bitMark = 1 << pos;
        int notBitMark = ~(bitMark);
        int newNumber = n & notBitMark;
        System.out.println(newNumber);
    }
}
