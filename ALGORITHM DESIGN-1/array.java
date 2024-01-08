package java_prog;
import java.util.Scanner;

public class array {

	static void reverse(int a[], int n) {
		int j = n;
	int [] b =new int[n];
		for (int i = 0; i < n; i++) {
			b[j-1] = a[i];
			j = j-1;
		}
		 
		System.out.println("Reversed array is: ");
		for (int k = 0; k < n; k++) {
			System.out.println(b[k]);
		}
	}

	public static void main(String[] args) {
        Scanner ab = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = ab.nextInt();
        
        int[] a = new int[n];
        
        System.out.println("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            a[i] = ab.nextInt();
        }
        
        reverse(a, n);
    }
}