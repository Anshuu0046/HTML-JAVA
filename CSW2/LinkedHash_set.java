import java.util.*;
public class LinkedHash_set {
    public static void main(String[] args) {
        LinkedHashSet<Integer> is = new LinkedHashSet<Integer>();
        int[] a = {1,5,6,7,8,2,4};
        for (int j : a) {
            is.add(j);
        }

        System.out.println(is);

    }
}
