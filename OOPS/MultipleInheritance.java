package OOPS;

public class MultipleInheritance {
    public static void main(String args[]){
        Bear b = new Bear();
        b.eatss();
        System.out.println(b.num + b.numhelp);
    }
}

interface Carnivore{
    int num=23;
    void eatss();
}
interface Hervivore{
    int numhelp=24;
    void eatss();
}

class Bear implements Carnivore,Hervivore{
    public void eatss(){
        System.out.println("Eat grass and meat");
    }
}