package BitManipulation;

public class SetithBit {
    public static void setBit(int n,int i){
        int bitmask=1<<i;
        System.out.println(n|bitmask);
    }
    public static void main(String args[]){
        int n=000;
        int index=2;
        setBit(n,index);

    }
}
