package java_prog;

import java.util.Scanner;

class shift {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a number");
	 int a = sc.nextInt();
	 System.out.println("Enter the shift");
	 int shift = sc.nextInt();
		a = a >> shift;
	System.out.println("The Shifted bit is: " + shift);	

	}

}
