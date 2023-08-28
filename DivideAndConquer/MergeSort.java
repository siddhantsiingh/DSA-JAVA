package DivideAndConquer;

public class MergeSort {
    public static void merge(int arr[], int si, int mid, int ei){
        int temp[]= new int[ei-si+1]; //(0,3)=4  3-0+1=4
        int i=si;//for left part
        int j= mid+1; //right part
        int k=0; //temp array

        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
                k++;
            }
            else {
                temp[k]=arr[j];
                j++;
                k++;
            }
        }
        while(j<=ei){
            temp[k++]=arr[j++];
                // j++;
                // k++;
        }
        while(i<=mid){
            temp[k]=arr[i];
                i++;
                k++;
        }
        //copy to original array

        for(k=0, i=si; k<temp.length; k++,i++){
            arr[i]=temp[k];
        }

    }


    public static void mergeSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }

        int mid= (si+ei)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid +1, ei);
        merge(arr, si, mid,ei);
    }

    public static void printArr(int arr[]){

        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }

    public static void main(String args[]){
        int arr[]={2,4,6,7,1,3,-2};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
