public class pattern7 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

// 1 2 3 4 5
// 1 2 3 4
// 1 2 3
// 1 2
// 1