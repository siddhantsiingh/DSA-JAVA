package BasicSorting;

public class BubbleSort {
/*Outerloop-turns--- 0 to n-2 index 
 * innerLoop- 0 to n-1-turn
 */

    public static void Bubble(int arr[]){
        for(int turn=0; turn<arr.length-1;turn++){ //0 to n-2
            int swap=0;
            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j]>arr[j+1]){
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
                
            }
            // no swapping means the array is already sorted
      // so no need for further comparison
            if(swap==0){
                break;
            }
            
         }
        printArr(arr);
    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        Bubble(arr);
    }
}
