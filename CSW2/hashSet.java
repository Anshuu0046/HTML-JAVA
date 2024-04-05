import java.util.*;
public class hashSet {
    public static void main(String[] args) {
        Set<String> s = new HashSet<>();

        s.add("Banana");
        s.add("goat");
        s.add("ball");
        s.add("mango");

        System.out.println(s.add("grapes"));
        System.out.println(s.add("Baseball"));

        System.out.println(s);

    }
}
