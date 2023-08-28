package OOPS;

public class SuperKeyword {
    public static void main(String args[]){
        Papa p = new Papa();
        System.out.println(p.name);

    }
}
class Parents{
    String name="Par";
    Parents(){
        System.out.println("Parents constructor is called...");
    }
}

class Papa extends Parents{
    Papa(){
        super.name="Brown";
        //super(); //called  immediate parent constructor first if not written by default call but if properties added
        System.out.println("Papa constructor is calledd...");
    }
}