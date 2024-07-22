import java.util.*;

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello ");
        System.out.println(sb);
        // System.out.println(sb.chartAt(0));
        sb.setCharAt(0, 'p');
        System.out.println(sb);
    }
}
