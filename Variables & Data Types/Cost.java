import java.util.*;
public class Cost {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the price of pencil: ");
        float a= sc.nextFloat();
        System.out.print("Enter the price of pen: ");
        float b= sc.nextFloat();
        System.out.print("Enter the price of eraser: ");
        float c= sc.nextFloat();

        float cost= a+b+c;
        System.out.println("Your cost is Rs "+cost);
        float total_cost=cost + ((cost*18)/100);
        System.out.println("Your total cost after 18% gst is Rs "+total_cost);

    }
}

//Q4 ans-- double
//Q5 no-- variables can strat with any alphabte or _ or dollar