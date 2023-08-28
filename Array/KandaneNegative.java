package Array;

public class KandaneNegative {
    public static void SubArrays(int numbers[]){
        int curSum=0;
        int max_sum= Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]<0){
                 curSum+=numbers[i];
                    if(curSum>max_sum){
                        max_sum=curSum;
                    }
                
            }
            else{
                for(int j=0;j<numbers.length;j++){
                    curSum+=numbers[j];
                    if(curSum<0){
                        curSum=0;
                    }
            
                    if(curSum>max_sum){
                        max_sum=curSum;
                    }
                }
                break;
                
            }
        }
        
        System.out.println("Maximum Sum: "+max_sum);
    }

    public static void main(String args[]){
        int numbers[]={-2,-3,-6};
        SubArrays(numbers);
    }
}
