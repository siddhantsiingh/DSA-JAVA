package BasicSorting;
import java.util.*;
public class Inbuilt {

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void printArr(Integer arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={5,3,7,2,8};
        //Arrays.sort(arr,0,2); from index 0 to index 2
        Arrays.sort(arr);
        printArr(arr);


        //FOR DECRESING ORDER
        Integer array[]={5,3,7,2,8};  //works only with object 
        Arrays.sort(array,Collections.reverseOrder());
        //Arrays.sort(array,0,3,Collections.reverseOrder())
        printArr(array);
    }
}
