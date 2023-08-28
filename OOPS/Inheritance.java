package OOPS;

public class Inheritance {
    public static void main(String args[]){

        Fish shark= new Fish();
        shark.eat();

        Dog baby= new Dog();
        baby.eat();
        baby.legs=4;
        System.out.println(baby.legs);

    }
}
class Animal{
    String color;
    void eat(){
        System.out.println("Eats..");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}

//SINGLE LEVEL INHERITANCE 
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swim in water..");
    }
}

//HIERARCHIAL INHERITANCE - Fish and mammals both are derived from Animals- multiple classes are derived from single base class.

//MULTILEVEL INHERITANCE
class Mammals extends Animal{
    int legs;
}

class Dog extends Mammals{
    String breed;
}
