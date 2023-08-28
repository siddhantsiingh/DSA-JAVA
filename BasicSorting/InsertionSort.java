package BasicSorting;

public class InsertionSort {
    public static void Insertion(int arr[]){
        for(int i=0;i<arr.length;i++){
            int cur=arr[i];
            int prev=i-1;
            //finding out the correct position insert
            while(prev>=0 && arr[prev]>cur){

                arr[prev+1]=arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1]=cur;
        }
        printArr(arr);
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,6,4,5};
        Insertion(arr);
    }
}
