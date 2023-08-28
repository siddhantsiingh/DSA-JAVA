package Array;

public class MaxMinSum {
    public static void Max_Min(int numbers[]){
        int tsa=0;
        int max_sum=Integer.MIN_VALUE;
        int min_sum=Integer.MAX_VALUE;

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
               if(sum>=max_sum){
                max_sum=sum;
               }
               if(sum<=min_sum){
                min_sum=sum;
               }
               tsa++;

               
            }
            System.out.println();
        }
        System.out.println("Total: "+ tsa);
        System.out.println("Max sum: "+ max_sum);
        System.out.println("Min sum: "+ min_sum);


    }

    public static void main(String args[]){
        int numbers[]={1,2,3,4,5};
        System.out.println("Original Array: ");
        for(int i=0; i<numbers.length;i++){
            System.out.print(numbers[i]+ " ");
        }
        System.out.println();
        Max_Min(numbers);
    }
}
