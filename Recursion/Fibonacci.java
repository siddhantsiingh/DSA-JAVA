package Recursion;

public class Fibonacci {
    public static int FibonacciNum(int n){
        if(n==0 || n==1){
            return n;
        }
        // else if(n==1){
        //     return 1;
        // }
        return FibonacciNum(n-1)+FibonacciNum(n-2);
    }
    public static void main(String args[]){
        System.out.println(FibonacciNum(25));

    }
}
