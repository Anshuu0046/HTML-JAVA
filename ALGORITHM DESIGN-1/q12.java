package ad1;

import java.util.Scanner;
public class q12 {
	public static int rsum(int a[],int k) {

		if(k==1) {
			return a[0];
		}
		else {
			return(rsum(a,k-1)+a[k-1]);
		}
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size array");
		int  n=sc.nextInt();
		int a[]= new int[n];
		System.out.println("Enter the elements of array");
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		int j=rsum(a,n);
		System.out.println(j);
		
	}

}
