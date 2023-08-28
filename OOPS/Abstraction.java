package OOPS;

public class Abstraction {
    public static void main(String args[]){
        // Horse h= new Horse();
        // h.eatt();
        // h.walk();
        // System.out.println(h.color); //animall superclass
        // h.changeColor();
        // System.out.println(h.color);

        // Chicken c=new Chicken();
        // c.eatt();
        // c.walk();
        Mustang m =new Mustang();
        //ANimall->horse>Mustang

        // Animall a =new Animall(); cannot create object of abstract classes

    }
}

abstract class Animall{
    String color;
    Animall(){
        color="Green"; //by default the horse/chicken willl be of green color unless they change it
        System.out.println("Animall Constructor call");

    }
    void eatt(){
        System.out.println("Animal eats..");
    }
    abstract void walk(); //exist but no definition must be define in sub classes
}

class Horse extends Animall{
    Horse(){
        System.out.println("horse constructor call");
    }
    void changeColor(){
        color="Brown";
    }
    void walk(){
        System.out.println("Walks on four legs..");
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor call");
    }
}

class Chicken extends Animall{
    void changeColor(){
        color="Yellow";
    }

    void walk(){
        System.out.println("Walks on two legs..");
    }
}