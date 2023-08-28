package Loops;

public class Reversegivennum {
    public static void main(String args[]){
        int n=13456;
        int lastdigit;
        while(n>0){
            lastdigit=n%10;
            System.out.print(lastdigit);
            n=n/10;
        }
    }
}
