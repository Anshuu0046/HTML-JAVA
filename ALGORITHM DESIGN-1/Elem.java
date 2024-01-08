package java_prog;

import java.util.Scanner;

public class Elem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        System.out.print("Enter the elements of the array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the size of the window (k): ");
        int k = scanner.nextInt();

        if (k > n || k <= 0) {
            System.out.println("Invalid window size");
            return;
        }

        System.out.println("Sum of elements in the initial window of size " + k + ": " + calculateWindowSum(arr, k));

        // Shift the window and calculate the sum for each position
        for (int i = 1; i <= n - k; i++) {
            int newWindowSum = calculateWindowSum(arr, k, i);
            System.out.println("Sum of elements in the window starting at position " + (i + 1) + ": " + newWindowSum);
        }
    }

    // Function to calculate the sum of elements in a window of size k
    static int calculateWindowSum(int[] arr, int k) {
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        return windowSum;
    }

    // Function to calculate the sum of elements in a window starting at a given position
    static int calculateWindowSum(int[] arr, int k, int sp) {
        int windowSum = 0;
        for (int i = sp; i < sp + k; i++) {
            windowSum += arr[i];
        }
        return windowSum;
    }
}
