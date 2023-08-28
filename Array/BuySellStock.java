package Array;

public class BuySellStock {
    public static int Stock(int days[]){
        int profit=0;
        int buyPrice=days[0];
        int maxProfit=0;
        
        for(int i=1; i<days.length;i++){
            int sellPrice=days[i];
            profit=sellPrice-buyPrice;
            if(profit>maxProfit){
                maxProfit=profit;
            }
            if(buyPrice>sellPrice){
                buyPrice=sellPrice;
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int days[]={4,2,0,6,3,2,5};
        System.out.println(Stock(days));
    }
}
