package Recursion;

public class SumofN {
    public static int SumOfN(int n){
        if(n==1){
            return 1;
        }
        return SumOfN(n-1)+n;
    }
    public static void main(String args[]){
        System.out.println(SumOfN(5)); 

    }
}
