package BitManipulation;

public class UpdateithBit {
    public static void updateBit(int n,int i, int value){
        int bitmask=1<<i;
        if(value==0){
            System.out.println(n&(~bitmask));
        }
        else{
            System.out.println(n|bitmask);
        }
    }
    public static void updateBitClearbit(int n,int i, int value){
        n= (n&(~(1<<i)));
        int bitmask= value<<i;
        System.out.println(n|bitmask);
    }
    public static void main(String args[]){
        int n=10;
        int index=1;
        updateBit(n,index, 0);
        
        updateBitClearbit(n,index,0);

    }
}
