import java.util.Map;
import java.util.TreeMap;


public class tree_Map {
    public static void main(String[] args) {
        Map<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("Nobita", 100);
        treeMap.put("Shizuka", 200);
        treeMap.put("Gian", 300);
        treeMap.put("Sunio", 400);

        int valueA = treeMap.get("Nobita");
        System.out.println("Value of A: " + valueA);

        System.out.println(treeMap);
    }
}
