package ArrayList;
import java.util.*;
public class Define {
    public static void main(String args[]){

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Boolean> list1= new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Character> list3= new ArrayList<>();

        //ADD
        list.add(3);//O(1)
        list.add(4);
        list.add(5);
        list.add(1,8); //O(n)- shift other

        System.out.println(list);

        //GET
        System.out.println(list.get(1)); //O(1)

        //REMOVE
        list.remove(1);
        System.out.println(list);

        //UPDATE
        list.set(1,6);
        System.out.println(list);

        //CONTAINS-true or false
        System.out.println(list.contains(3));
        System.out.println(list.contains(7));

        //ACCESS - .get(index)


       

    }
}
