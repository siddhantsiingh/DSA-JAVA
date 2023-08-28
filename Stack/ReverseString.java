package Stack;
import java.util.*;
public class ReverseString {
    public static String reverse(String str){
        Stack<Character> s=new Stack<>();
        String newStr="";
        int i=0;
        while(i<str.length())
        {
            s.push(str.charAt(i));
            i++;
        }
        for(int j=0;j<str.length();j++){
            newStr=newStr +s.pop();
        }
        return newStr;
    }
    public static void main(String args[]){
        
        String str= "Hello";
        System.out.println(reverse(str));
    }
}
