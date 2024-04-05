import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Hash_m {

    public static void main(String[] args) {
        HashMap<Integer , String> hs = new HashMap<>();

        hs.put(67 , "Anshuman");
        hs.put(40 , "Shayan" );
        hs.put(25 , "Adi");
        hs.put(66, "Dhriti");
        hs.put(64, "john");
        hs.put(68, "Doe");
        hs.put(62, "nobita");
        hs.put(60, "gian");

        hs.remove(25);
        hs.remove(68);


        Set<Map.Entry<Integer, String>> st = hs.entrySet();
        for(Map.Entry<Integer, String> entry : st) {
            System.out.println("Key = " + entry.getKey());
            System.out.println("Value = " + entry.getValue());
            System.out.println();
        }
        System.out.println(hs.containsValue("Dhriti"));
        System.out.println(hs);
        System.out.println(hs.size());

    }
}
