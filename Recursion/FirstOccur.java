package Recursion;

public class FirstOccur {
    public static int FirstOccurence(int arr[] , int i, int key){
        if(i==arr.length){
            System.out.println("Not in array");
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        
       
       return FirstOccurence(arr, i+1, key);

       
    }
    public static void main(String args[]){

        int arr[]={1,2,6,4,5};
        int key=8;
        System.out.println(FirstOccurence(arr, 0, key));
    }
}
