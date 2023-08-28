package BitManipulation;

public class powofTwo {
    public static void Power(int n){
        if((n&(n-1))==0){
            System.out.println("Power of two");
        }
        else{
            System.out.println("Not power of two");
        }
    }
    public static void main(String args[]){
        int n=16;
        Power(n);
        Power(15);

    }
}
