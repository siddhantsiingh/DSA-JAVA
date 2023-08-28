package Strings;

public class StringChar {
    public static void printLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
    public static void main(String args[]){
        String fname="Vaishali";
        printLetters(fname);
    }
}
