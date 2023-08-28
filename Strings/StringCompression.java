package Strings;
//aaabbcccdd=a3b2c3d2  //if single-> single
//count -> for(i 0 to n) ch(i)while repeat-count++; if >1 no. else no num
public class StringCompression {
    public static String compress(String str){
        String newStr="";
        for(int i=0;i<str.length();i++){
        //to addd count in string 
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;   //O(n)--> only i increase
            }
            newStr+= str.charAt(i);
            if(count>1){
                newStr+= count.toString();

            }
        }
        return newStr;
    }
    public static void main(String args[]){
        String str="aaabbcccdd";
        System.out.println(compress(str));

    }
}
