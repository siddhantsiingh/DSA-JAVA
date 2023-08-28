package OOPS;

public class MethodOverriding {
    public static void main(String args[]){

        Bolero b=new Bolero();
        b.type();

        Car c= new Car();
        c.type();
        
    }
}

class Car{
    void type(){
        System.out.println("Im a car");
    }
}
class Bolero extends Car{
    void type(){
        System.out.println("Im bolero");
    }
}