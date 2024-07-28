import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        
        char[] charArray = str.toCharArray(); // Convert the string to a character array
        int n = charArray.length;
        int i = 0;
        int j = n - 1;

        // Reverse the string using two-pointer technique
        while (i < j) {
            // Swap characters
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            i++;
            j--;
        }

        // Convert the character array back to a string
        String reversedStr = new String(charArray);
        
        // Output the reversed string
        System.out.println("Reversed string: " + reversedStr);
        
        sc.close();
    }
}





















// public class Main {
//     public static void main(String[] args) {
//         String str = "Hello World!";
//         System.out.println("Original String: " + str);
//         System.out.println("Reversed String: " + reverseString(str));
//     }

//     public static String reverseString(String str) {
//         char[] arr = str.toCharArray();
//         int left = 0;
//         int right = arr.length - 1;
//         while (left < right) {
//             char temp = arr[left];
//             arr[left] = arr[right];
//             arr[right] = temp;
//             left++;
//             right--;
//         }
//         return new String(arr);
//     }
// }



//          concatination
// public class Main {
//     public static void main(String[] args) {
//         String str = "Hello World!";
//         System.out.println("Original String: " + str);
//         System.out.println("Reversed String: " + reverseString(str));
//     }

//     public static String reverseString(String str) {
//         String reversed = "";
//         for (int i = str.length() - 1; i >= 0; i--) {
//             reversed += str.charAt(i);
//         }
//         return reversed;
//     }
// }