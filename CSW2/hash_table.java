import java.util.Hashtable;
public class hash_table {
    public static void main(String[] args) {
        Hashtable<String, Integer> ht = new Hashtable<>();

        ht.put("Anshuman" , 67);
        ht.put("Naina" , 69);
        ht.put("adi" , 66);
        ht.put("Dhriti" , 25);

        ht.remove("Dhriti");


        System.out.println(ht);


    }
}
