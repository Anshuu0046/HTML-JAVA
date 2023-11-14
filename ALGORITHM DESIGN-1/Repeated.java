package ad1;

public class Repeated {
	public static int firstRepeatingElement(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    return i;
                }
            }
        }

        return -1;
    }
 
    public static void main(String[] args) {
        int[] arr = { 11, 7, 3, 5, 3, 5, 7 };
        int n = arr.length;
        int index = firstRepeatingElement(arr, n);
        if (index == -1) {
            System.out.println("No repeating element found!");
        }
        else {
            System.out.println("First repeating element is " + arr[index]);
        }
    }
}

