package Loops;
import java.util.*;

public class Print1ton {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter num: ");
        int n= sc.nextInt();

        int i=0;
        while(i<n){
            System.out.println(i+1);
            i++;
        }

    }
}
