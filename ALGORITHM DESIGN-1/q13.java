package ad1;

public class q13 {

	static int max(int[]n,int s) {
		if (s==0)
			return n[0];
		else
			return(Math.max(max(n,s-1),n[s-1]));
	}
		static int min(int []n,int s)
		{
		if(s==0)
			return n[0];
		else
			return(Math.min(min(n,s-1),n[s-1]));
		}
	public static void main(String[] args) {
		int a[]= {3,8,4,22};
		System.out.println("Max:"+max(a,4));
		System.out.println("Min:"+min(a,4));
	}
}