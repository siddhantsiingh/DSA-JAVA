package ArrayList;

import java.util.ArrayList;

public class Size {
    public static void main(String args[]){

        ArrayList<Integer> list = new ArrayList<>();
       
        list.add(1);//O(1)
        list.add(2);
        list.add(3);

        System.out.println(list.size());


        //print

        //iterate
        for(int i=0; i<list.size();i++){
            System.out.print(list.get(i)+ " ");
        }
    }
}
