package OOPS;

public class StaticKeyword {
    public static void main(String args[]){

        
        Students s1= new Students();
        s1.schoolName="JNV"; //passed to static variable, so it will be same for all the other objects

        Students s2= new Students();
        System.out.println(s2.schoolName);

        Students s3= new Students();
        s1.schoolName="ABC";

        System.out.println(s1.schoolName);
        System.out.println(s2.schoolName);

    }
}

class Students {

    static int returnPercentage(int m, int p, int c){ //only create once in the memory
            return (m+p+c)/3;
        }
    String name;
    int roll;

    static String schoolName;
    void setName(String name){
        this.name= name;
    }
    void getName(){
        System.out.println(this.name);
    }
}