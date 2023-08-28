package Recursion;

public class Factorial {
    public static int FactorialofN(int n){
        if(n==1){
            return 1;
        }
        return FactorialofN(n-1)*n;
    }
    public static void main(String args[]){
        System.out.println(FactorialofN(5));

    }
}
