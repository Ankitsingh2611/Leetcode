import java.util.*;

public class stringDelete {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Ankit");
        System.out.println(sb);
        sb.insert(2, 'n');
        sb.delete(2, 3);
        System.out.println(sb);
    }
}
