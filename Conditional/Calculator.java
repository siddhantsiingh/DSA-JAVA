import java.util.*;
public class Calculator {
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter 1st num: ");
    int a= sc.nextInt();
    System.out.print("Enter 2nd num: ");
    int b= sc.nextInt();
    System.out.println("Enter + for add \n- for sub\n*for product\n/ for division\n% for remainder");
    char ch= sc.next().charAt(0);

    switch(ch){
        case '+': 
        System.out.println(a+b);
        break;

        case '-': 
        System.out.println(a-b);
        break;

        case '*': 
        System.out.println(a*b);
        break;

        case '/': 
        System.out.println(a/b);
        break;

        case '%': 
        System.out.println(a%b);
        break;

        default:
        System.out.println("Wrong operator");

    }

    }
}
