package Recursion;

public class PrintNum {
    public static void Printnum(int n){
        if(n==1){ //base case
            System.out.println(n);
            return;
        }
        System.out.println(n+" ");
        Printnum(n-1);
    }

    public static void IncOrder(int n){
        if(n==1){ //base case
            System.out.println(n);
            return;
        }
        IncOrder(n-1);
        System.out.println(n+" ");
        
    }
    public static void main(String args[]){

        Printnum(10);
        IncOrder(5);
    }
}
