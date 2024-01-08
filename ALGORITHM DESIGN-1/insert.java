package java_prog;
import java.util.Scanner;
public class insert {

	public static void main(String[] args) {
		int n, pos, x;
		Scanner ab = new Scanner(System.in);
		System.out.print("Enter no.of elements: ");
		
		n = ab.nextInt();
		int a[] = new int[n+1];
		System.out.print("Enter the elements: ");
		for (int i = 0; i < n; i++) {
			a[i] = ab.nextInt();
			ab.close();
		}
		
		System.out.print("Enter the position: ");
		pos = ab.nextInt();
		
		System.out.println("Enter the element you want to add: ");
		x = ab.nextInt();
		for (int i = (n-1); i >= (pos-1); i--) {
			a[i+1] = a[i];
		}
		
		a[pos-1] = x;
		System.out.print("After inserting: ");
		for (int i = 0; 1 < n; i++) {
			System.out.print(a[i]+",");
		}
		System.out.print(a[n]);
	}

}
