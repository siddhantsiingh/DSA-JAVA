package ArrayList;
import java.util.*;


public class PairSum {
    public static boolean pairSum(ArrayList<Integer> list, int target){
        int lp=0;
        int rp=list.size()-1;

        while(lp<rp){
            int sum= list.get(lp)+list.get(rp);
            if(sum==target){
                return true;
            }
            if(sum<target){
                lp++;
            }
            else{
                rp--;
            }

        }
        return false;
    }

    //O(n)
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int target=10;
        System.out.println(pairSum(list, target));
    }
}
