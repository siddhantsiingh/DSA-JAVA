package HashMap;

import java.util.*;

public class Hashmap {
    public static void main(String args[]) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        // System.out.println(hm.get("India"));
        // System.out.println(hm.containsKey("India"));
        // System.out.println(hm);
        // hm.put("India", 2000);
        // hm.put("Japan", 100);
        // System.out.println(hm);
        // hm.remove("India");
        // System.out.println(hm);

        // System.out.println(hm.size());
        // hm.clear();

        // System.out.println(hm.isEmpty());
        hm.put("Japan", 300);
        hm.put("Pak", 34);
        hm.put("Bang", 15400);

        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("key= " + k + ", " + "value=" + hm.get(k));
        }
    }
}
