package Strings;

public class UpperCase {
    //first letter of every word should be capital
//after empty space 
//0th index first word -> space next word
//INBUILT - character.toUpperCase(ch);
    public static String touppercase(String str){
        StringBuilder sb = new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i=1; i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));

            }
        }
        return sb.toString(); //O(n)
    }
    public static void main(String args[]){
        String str="hi i am vaishali";
        System.out.println(touppercase(str));
    }

    
}
