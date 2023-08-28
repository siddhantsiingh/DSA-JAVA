package ArrayList;
import java.util.*;


public class PairSumtwo {
    public static boolean pairSumTWO(ArrayList<Integer> list, int target){
        
        int bp=-1;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                bp=i;
                break;
            }

        }
        int lp=bp+1;
        int rp=bp;

        while(lp!=rp){
            int sum= list.get(lp)+list.get(rp);
            if(sum==target){
                return true;
            }
            //FOR ROTATION IN AN ARRAY - USING MOD PROPERTIES - LP=(lp+1)%n  RP=(n+rp-1)%n
            if(sum<target){
                lp=(lp+1)%list.size();
            }
            else{
                rp=(list.size()+rp-1)%list.size();
            }

        }
        return false;
    }

    //O(n)
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(3);
        int target=7;
        //SORTED AND ROTATED ARRAY
        System.out.println(pairSumTWO(list, target));
    }
}
