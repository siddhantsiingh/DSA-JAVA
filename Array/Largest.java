package Array;

public class Largest {
    public static int largest(int numbers[]){
        int greatest= Integer.MIN_VALUE; //-infinity
        int smallest= Integer.MAX_VALUE;
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>=greatest){
                greatest=numbers[i];
            }
            if(numbers[i]<smallest){
                smallest=numbers[i];
            }
        }
        System.out.println("Smallest: "+smallest);
        return greatest;
    }

    public static void main(String args[]){
        int numbers[]={1,2,3,4,6,7,4,3,4};
        System.out.println("Largest:" + largest(numbers));
    }
}
