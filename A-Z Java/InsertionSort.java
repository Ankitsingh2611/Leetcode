import java.util.Arrays;

public class InsertionSort {
    public static void printArray(int[] arr) {
        System.out.println("Array is: " + Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
        printArray(arr);
    }

    public static void main(String[] args) {
        int[] arr = { 7, 8, 3, 2, 1 };
        System.out.println("Original array is: ");
        printArray(arr);
        insertionSort(arr);
    }
}