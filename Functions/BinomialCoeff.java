package Functions;

public class BinomialCoeff {
    //nCr= n!/r!(n-r)!
    public static int factorial(int n){
        int f=1;
        for(int i=1; i<=n; i++){
            f=f*i;
        }
        return f;
    }
    public static float Binomial(int n, int r){
        float binomial=factorial(n)/(factorial(r)*factorial(n-r));
        return binomial;
    }
    public static void main(String args[]){
        System.out.println("Binomial: "+ Binomial(5,2));
    }
}
