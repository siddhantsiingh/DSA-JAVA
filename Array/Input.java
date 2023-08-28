package Array;
import java.util.*;
public class Input {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int marks[]= new int[5];
        marks[0]= sc.nextInt();
        marks[1]= sc.nextInt();
        marks[2]= sc.nextInt();
        marks[3]= sc.nextInt();
        marks[4]= sc.nextInt();
        System.out.println();
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        marks[2]=marks[2]*2;
        System.out.println("\n"+ marks[2]);

        System.out.println("Length of array "+ marks.length);

    }
}
