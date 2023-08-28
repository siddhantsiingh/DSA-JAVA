package Recursion;

public class LastOccur {
    public static int FirstOccurence(int arr[] , int i, int key){
        if(i==-1){
            System.out.println("Not in array");
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        
       
       return FirstOccurence(arr, i-1, key);

       
    }
    public static void main(String args[]){

        int arr[]={5,5,5,5};
        int key=5;
        System.out.println(FirstOccurence(arr, arr.length-1, key));
    }
}
