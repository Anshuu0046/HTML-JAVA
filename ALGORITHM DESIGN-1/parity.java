package java_prog;

import java.util.Scanner;

class parity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("ENter a number:");
        // int par = sc.nextInt();
        // int parity = par & 1;
        System.out.println("enter your name: ");
        String a = sc.nextLine();
        String b = "";
        for(int i=a.length()-1; i >= 0; --i)
        {
            int[] ar = new int[10];
            char ch = a.charAt(i);
            b += ch;
            a += ch;
        }
        System.out.println("The parity bit is: " + b);
    }
}
