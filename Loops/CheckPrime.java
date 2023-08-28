package Loops;
import java.util.*;

public class CheckPrime {
    
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter num: ");
        int n= sc.nextInt();
        boolean isPrime= true;
        for(int i=2; i<n;i++){
            if(n%i==0){
                isPrime=false;
                break;
            }
        }
        if(isPrime==true){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
       
    }
}
