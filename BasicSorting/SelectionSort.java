package BasicSorting;

public class SelectionSort {
    public static void Selection(int arr[]){
        for(int i=0;i<arr.length-1;i++){ //turnsss
            int minPos=i; //current position
            for(int j=i+1;j<arr.length;j++){
                if(arr[minPos]>arr[j]){ //find minimum position
                    minPos=j;
                }
            }
            //swap with min position
            int temp=arr[minPos];
            arr[minPos]=arr[i];
            arr[i]=temp;
        }
        printArr(arr);
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={1,7,3,6,5};
        Selection(arr);
    }
}
