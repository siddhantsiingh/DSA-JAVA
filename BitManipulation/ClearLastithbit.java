package BitManipulation;

public class ClearLastithbit {
    public static void clear(int n,int i){
        int bitmask=(~0<<i);
        System.out.println(n&bitmask);
    }
    public static void main(String args[]){
        int n=15;
        int index=2;
        clear(n,index);

    }
}
