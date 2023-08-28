package OOPS;

public class OOPS {
    public static void main(String args[]){
        //public- access modifier

        //OBJECT
        // Pen p1= new Pen();  //created a pen object named p1
        // p1.setColor("Blue");
        // System.out.println(p1.color);
        // p1.setTip(6);
        // System.out.println(p1.tip);

        // p1.tip=12;
        // System.out.println(p1.tip);

        BankAccount b1= new BankAccount();
        b1.username="Vaishali";
        //b1.password="vaish"; The field BankAccount.password is not visible
        b1.setPass("vaish456231");
        //SYSO(b1.password) not visible
        b1.getPass();
    }
}
class BankAccount{
    public String username;
    private String password;

    public void setPass(String pwd){
        password=pwd;
    }
    public void getPass(){
        System.out.println(password);
    }

}
// class Pen{
//     //properties
//     String color;
//     int tip;

//     //functions
//     void setColor(String newColor){
//         color=newColor;
//     }
//     void setTip(int newTip){
//         tip=newTip;
//     }
// }
class Student{
    String name;
    int age;
    float cgpa;

    void calculatePercentage(int m, int p, int c)
    {
        cgpa=(m+p+c)/3;
    }
}
