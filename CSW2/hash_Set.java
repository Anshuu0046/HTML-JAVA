import java.util.*;
public class hash_Set {

    public static void main(String[] args) {
        Set<Integer> i = new HashSet<>();
        int[] a = {1,2,5,2,7,8,5,6,2,7,3,2,1,5,2,6};
        for (int j : a) {
            i.add(j);
        }
        System.out.println(i);
    }
}
