package Array;

public class Kadane {
    public static void SubArrays(int numbers[]){
        int curSum=0;
        int max_sum= Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<0){
                continue;
            }
            else{
                
            }
        }
        for(int i=0;i<numbers.length;i++){
            curSum+=numbers[i];
            if(curSum<0){
                curSum=0;
            }
            
            if(curSum>max_sum){
                max_sum=curSum;
            }
        }
        System.out.println("Maximum Sum: "+max_sum);
    }

    public static void main(String args[]){
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        SubArrays(numbers);
    }
}
