package BitManipulation;

public class FastExpo {
    public static void fastExponentiation(int a,int n){
        int ans=1;
        while(n>0){
            if((n&1) !=0){
                ans=ans*a;

            }
            a=a*a;
            n=n>>1;
        }
        System.out.println(ans);
    }
    public static void main(String args[]){
        fastExponentiation(5,3);

    }
}
