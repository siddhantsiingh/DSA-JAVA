package Loops;
import java.util.*;

public class Reverse {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter num: ");
        int n= sc.nextInt();
        int lastdigit=0;
        int rev=0;
        while(n>0){
            lastdigit=n%10;
            rev=(rev*10)+ lastdigit;
            n=n/10;
        }
        System.out.print(rev);


    }
}
