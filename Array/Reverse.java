package Array;

public class Reverse {
    public static void ReverseArray(int numbers[]){
        int first=0;
        int last= numbers.length-1;
        while(first<last){
            int temp=numbers[first];
            numbers[first]=numbers[last];
            numbers[last]= temp;
            last--;
            first++;
        }
        System.out.println("Reversed Array: ");

        for(int i=0; i<numbers.length;i++){
            System.out.print(numbers[i]+ " ");
        }
    }

    public static void main(String args[]){
        int numbers[]={1,2,3,4};
        System.out.println("Original Array: ");
        for(int i=0; i<numbers.length;i++){
            System.out.print(numbers[i]+ " ");
        }
        System.out.println();
        ReverseArray(numbers);
    }
}
