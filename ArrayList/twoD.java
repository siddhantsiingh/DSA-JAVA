package ArrayList;

import java.util.ArrayList;

public class twoD {
    public static void main(String args[]){

        ArrayList<ArrayList<Integer>> main = new ArrayList<>();
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        main.add(list);
        
        ArrayList<Integer> list1= new ArrayList<>();
        list1.add(2);
        list1.add(4);
        list1.add(6);
        list1.add(8);
        list1.add(10);

        main.add(list1);
        System.out.println(main);


        //print
        for(int i=0;i<main.size();i++){
            //list 1 then list 2
            ArrayList<Integer> curr= main.get(i);
            for(int j=0; j<curr.size();j++){
                System.out.print(curr.get(j)+ " ");
            }
        }
        System.out.println();
        System.out.println();

        ///REAL

        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> l1= new ArrayList<>();
        ArrayList<Integer> l2= new ArrayList<>();
        ArrayList<Integer> l3= new ArrayList<>();

        for(int i=1; i<=5;i++){
            l1.add(i*1);
            l2.add(i*2);
            l3.add(i*3);

        }
        mainList.add(l1);
        mainList.add(l2);
        mainList.add(l3);
        System.out.println(mainList);
        System.out.println();

        for(int i=0;i<mainList.size();i++){
            ArrayList<Integer> currList= mainList.get(i);
            for(int j=0; j<currList.size();j++){
                System.out.print(currList.get(j)+ " ");
            }
            System.out.println();
        }

        


        
    }
}
