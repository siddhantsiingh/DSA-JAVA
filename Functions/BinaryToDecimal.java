package Functions;

public class BinaryToDecimal {
    public static void B2D(int n){
        int decimal=0;
        int lastDigit=0;
        int pow=0;
        while(n>0){
            lastDigit=n%10;
            decimal=decimal +  (lastDigit* (int)Math.pow(2,pow));
            pow++;
            n=n/10;
        }
        System.out.println("Decimal of binary number: "+ decimal);
    }
    public static void main(String args[]){
        B2D(101);
    }
}
