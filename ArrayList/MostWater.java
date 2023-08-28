package ArrayList;
import java.util.*;
public class MostWater {
    public static int maxWater(ArrayList<Integer> height){
        int curWater=0;
        int maxWater=Integer.MIN_VALUE;
        //Brute Force --)O(n^2)
        for(int i=0; i<height.size();i++){
            int h=0;
            int w=0;
           
            for(int j=i+1; j<height.size();j++){
                h=Math.min(height.get(i),height.get(j));
                w=j-i;
                curWater= h*w;
                if(curWater>maxWater){
                    maxWater=curWater;
                }


            }

        }
        return maxWater;
    
    }
    public static void main(String args[]){
        ArrayList<Integer> height= new ArrayList<>(); 
     
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println("Max Water: "+ maxWater(height));  

    
    
    }
}
