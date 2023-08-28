package Recursion;

public class FriendsPairing {
    public static int friendsPair(int n){ //2xn floor

        //base case
        // if(n==1){
        //     return 1;
        // }
        // if(n==2){
        //     return 2;
        // }
        // //kaam 
        
        // int single= friendsPair(n-1);

   
        // int pair= (n-1)*friendsPair(n-2);

        // int totalWays= single+ pair;
        // return totalWays;

        if(n==1 || n==2){
            return n;
        }

        return friendsPair(n-1)+ (n-1) *friendsPair(n-2);
    }

    public static void main(String args[]){

        System.out.println(friendsPair(3));
    }
}
