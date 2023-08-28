package DivideAndConquer;

public class QuickSort {
    


    public static void quickSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        //pivot last element
        int pIdx= partition(arr, si, ei);
        quickSort(arr, si, pIdx);
        quickSort(arr, pIdx+1, ei);

    }

    public static int partition(int arr[], int si, int ei){

        int pivot=arr[ei];
        int i= si-1; // to make space for elements smller

        for(int j=si; j<ei;j++){
            if(arr[j]<=pivot){
                i++;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        i++;
        int temp=pivot;
        arr[ei]=arr[i]; //pivot var change ni krna woh index krna hai
        arr[i]=temp;

        return i;

    }

    public static void printArr(int arr[]){

        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }

    public static void main(String args[]){
        int arr[]={2,4,6,7,1,3};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
