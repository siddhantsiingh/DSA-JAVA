package Strings;

public class Palindrome {
    public static boolean printLetters(String str){
        int right=str.charAt(str.length()-1);
        int left=str.charAt(0);

        while(left<right){
            if(left!=right){
                return false;
            }
        }
        return true;
            
    }
    public static void main(String args[]){
        String fname="racecar";
        System.out.println(printLetters(fname));
    }
}
