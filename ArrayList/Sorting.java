package ArrayList;

import java.util.ArrayList;
import java.util.*;

public class Sorting {
    public static void main(String args[]){

        ArrayList<Integer> list= new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(1);
        list.add(5);
        list.add(4);
        System.out.println(list);

        //Array-- Arrays.sort(arr)
        Collections.sort(list);
        System.out.println(list);

        //decreasing order

        Collections.sort(list, Collections.reverseOrder()); //this is a comparator
        //comparator is a function which decides the logic
        System.out.println(list);
        
    }
}
