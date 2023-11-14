
package ad1;
import java.util.Arrays;
public class q7 {

	public static void main(String[] args) {
        // Input array
        int[] array = {10, 20, 30, 40, 50, 60, 70};
        System.out.println("Input Array :" + Arrays.toString(array));

        // In-place reversal of array
     
        
        for(int i = 0; i < array.length / 2; i++) {
            // Swapping the elements
            int j = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = j;
        }

        // Output
        System.out.println("Reversed Array :" + Arrays.toString(array));
    }
}