import java.util.*;

public class printMarks1 {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 99;
        for (int i = 0; i < 3; i++) {
            System.out.println("Marks of student " + (i + 1) + " is " + marks[i]);
        }
    }
}
