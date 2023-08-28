package Array;

public class PrintPairs {
    public static void Pairs(int numbers[]){
        int tp=0;
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1; j<numbers.length;j++){
                System.out.print("("+numbers[i]+","+numbers[j]+")  ");
                tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs: "+ tp);
        //tp=n*(n-1)/2
    }

    public static void main(String args[]){
        int numbers[]={1,2,3,4};
        System.out.println("Original Array: ");
        for(int i=0; i<numbers.length;i++){
            System.out.print(numbers[i]+ " ");
        }
        System.out.println();
        Pairs(numbers);
    }
}
