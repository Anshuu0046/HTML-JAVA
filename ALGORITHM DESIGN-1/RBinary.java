package ad1;
import java.util.Scanner;
public class RBinary {

	
	
		public static int b_search(int a[],int start,int end, int x)
		{
			int m=0;
			if (start<=end)
			{
				 m = (start+(end-start))/2;
			}
			if (a[m]==x)
			{
				return m;
			}
			if (a[m]<x)
			{
				return b_search(a,m+1,end,x);
			}
			else
				return b_search(a,start,m-1,x);
				
		}
		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the array length: ");
			int n=sc.nextInt();
			int a[]=new int [n];
			System.out.println("Enter the array: ");
			for(int i=0; i<a.length; i++)
				a[i]=sc.nextInt();
			int start=0, end=a.length-1;
			System.out.println("Enter the element to be searched: ");
			int x=sc.nextInt();
			int result=b_search(a,start,end, x);
			if(result!=-1)
				System.out.println("The searched element is at position: "+result);
			else
				System.out.println("The searched element is not present in the array.");
				

		}

	}


