package Loops;
import java.util.*;

public class multipleof10 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
       while(true){
        System.out.print("Enter num: ");
        int n= sc.nextInt();
        if(n%10==0){
            break;
        }
        System.out.println("Your num: " + n);

       }
        
        System.out.print("You entered multiple of 10");


    }
}
