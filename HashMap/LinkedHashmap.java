package HashMap;

import java.util.*;

public class LinkedHashmap {
    public static void main(String args[]) {
        LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
        lhm.put(1, "Vaishali");
        lhm.put(2, "Sid");

        System.out.println(lhm);

        Set<Integer> keys = lhm.keySet();

        for (int k : keys) {
            System.out.println(lhm.get(k));
        }

        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "Vaishali");
        hm.put(2, "Sid");
        hm.put(3, "Sid");
        hm.put(4, "Sid");
        hm.put(5, "Sid");

        System.out.println(hm);


        //HASHMAP- LINKED LIST NODE DATA STORE
        //LINKEDHASHMAP- DOUBLY LINKED LIST
    }
}
