package Array;

public class SumofSubarrays {
    public static void Sumofsubarrays(int numbers[]){
        int tsa=0;
        

        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i; j<numbers.length;j++){
                int end=j;
                int sum=0;
               for(int k=start; k<=end;k++){ //only for print ie.start to end
                //for sum of all sub arrays
                sum +=numbers[k];
                System.out.print(numbers[k]+" ");
               }
              
               System.out.println();
                System.out.println("Sum= "+ sum);
               tsa++;

               
            }
            System.out.println();
        }
        System.out.println("Total: "+ tsa);
        //tp=n*(n-1)/2
    }

    public static void main(String args[]){
        int numbers[]={1,2,3,4,5};
        System.out.println("Original Array: ");
        for(int i=0; i<numbers.length;i++){
            System.out.print(numbers[i]+ " ");
        }
        System.out.println();
        Sumofsubarrays(numbers);
    }
}
