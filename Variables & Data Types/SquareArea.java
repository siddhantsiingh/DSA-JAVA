import java.util.*;
public class SquareArea {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the side of a square: ");
        float s= sc.nextFloat();

        float area = s*s;
        System.out.println("The area of the square is " + area);
    }
}
