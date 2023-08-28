package BitManipulation;

public class ClearithBit {
    public static void CleariBit(int n,int i){
        int bitmask=~(1<<i);
        System.out.println(n&bitmask);
    }
    public static void main(String args[]){
        int n=10;
        int index=1;
        CleariBit(n,index);

    }
}
