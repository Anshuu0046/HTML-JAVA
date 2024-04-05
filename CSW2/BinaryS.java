import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class BinaryS {
    public static void main(String[] args) {
        int [] a = {1,6,8,2,6,9};

        Arrays.sort(a);

        int intKey = 6;

        System.out.println(intKey + " Found at index: " + Arrays.binarySearch(a , intKey));

    }
}
