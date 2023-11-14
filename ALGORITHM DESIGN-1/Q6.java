import java.io.*;

class Q6
{
	int findFirstMissing(int array[], int n, int m)
	{
		if (n > m)
			return m + 1;

		if (n != array[n])
			return n;

		int mid = (n + m) / 2;
		if (array[mid] == mid)
			return findFirstMissing(array, mid+1, m);

		return findFirstMissing(array, n, mid);
	}
	public static void main(String[] args)
	{
		Q6 small = new Q6();
		int arr[] = {0, 1, 2, 3, 4, 5, 6, 7, 10};
		int n = arr.length;
		System.out.println("First Missing element is : "
				+ small.findFirstMissing(arr, 0, n - 1));
	}
}
