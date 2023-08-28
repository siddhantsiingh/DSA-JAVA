package OOPS;

public class MethodOverloading {
    public static void main(String args[]){
    Calculator calc=new Calculator();
    System.out.println(calc.sum(1,2));
    System.out.println(calc.sum(4.1f,2.1f));
    System.out.println(calc.sum(1,2,3));


    }

    
}

class Calculator{

    //Function/Method Overloading- Compile time

    int sum(int a, int b){
        return a+b;
    }

    float sum(float a, float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}