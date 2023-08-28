package BitManipulation;

public class IthBit {
    public static void GetBit(int n,int i){
        int bitmask=1<<i;
        if((n&bitmask)==0){
            System.out.println("Zero");
        }
        else{
            System.out.println("One");
        }
    }
    public static void main(String args[]){
        int n=10;
        int index=2;
        GetBit(n,index);

    }
}
