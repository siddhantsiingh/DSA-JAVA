package OOPS;

public class GetSet {
    public static void main(String args[]){
        Pen p1=new Pen();
        p1.setColor("Blue");
        p1.setTip(5);
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());
    }
}
class Pen{
    //properties
    private String color;
    private int tip;

    //functions
    void setColor(String newColor){
        color=newColor;
    }
    String getColor(){
        return this.color;
    }
    void setTip(int tip){
        this.tip=tip; //this is for reference to the property
    }
    int getTip(){
        return this.tip;
    }
}