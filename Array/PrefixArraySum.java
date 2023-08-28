package Array;

public class PrefixArraySum {
    public static void Prefix(int numbers[]){
        int sum=0;
        int max_sum=Integer.MIN_VALUE;
        int Prefix[]= new int[numbers.length];
        Prefix[0]=numbers[0];
        //prefix array
        for(int i=1;i<numbers.length;i++){
            Prefix[i]=Prefix[i-1]+numbers[i];
        }

        //logic for sub array and sum of sub arrays
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                sum= start==0? Prefix[end]: Prefix[end]-Prefix[start-1]; //Optimised solution
                if(sum>max_sum){
                    max_sum=sum;
                }

            }
        }
        System.out.println("Max sum= "+max_sum);


    }

    public static void main(String args[]){
        int numbers[]={1,2,3,4,5};
        System.out.println("Original Array: ");
        for(int i=0; i<numbers.length;i++){
            System.out.print(numbers[i]+ " ");
        }
        System.out.println();
        Prefix(numbers);
}
}