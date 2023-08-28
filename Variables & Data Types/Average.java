import java.util.*;
public class Average {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        float a= sc.nextFloat();
        System.out.print("Enter the 2nd number: ");
        float b= sc.nextFloat();
        System.out.print("Enter the 3rd number: ");
        float c= sc.nextFloat();

        float average=(a+b+c)/3;

        System.out.println(average);
    }
}
