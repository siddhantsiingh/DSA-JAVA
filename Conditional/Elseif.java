 public class Elseif {
    public static void main(String args[]){
        int a=17;
        if(a>=18){
            System.out.println("Adult");
        }
        else if (a<18 && a>=12){
            System.out.println("Teenager");
        }
        else{
            System.out.println("Child");
        }
    }
}
