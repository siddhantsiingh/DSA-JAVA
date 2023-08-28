package Backtracking;

public class FindPermutation {
    public static void findPer(String str, String ans){
        if(str.length( )==0){
            System.out.println(ans);
            return;
        }

        //recursion
        for(int i=0; i<str.length(); i++){
            char cur= str.charAt(i);
            //abcde= ab+de
            String newstr= str.substring(0, i)+ str.substring(i+1 );
            findPer(newstr, ans+cur);
//O(n*n!)
        }
    }
    public static void main(String args[]){
        String str="abc";
        findPer(str, "");

    }
}
