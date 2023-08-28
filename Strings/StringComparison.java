package Strings;

public class StringComparison {
    
    public static void main(String args[]){
        String s1="Vaishali";
        String s2="Vaishali";
        String s3= new String("Vaishali");

        //string -. without new then same point 
        //with new- new string is created even with the same name
        if(s1==s2){
            System.out.println("Same String");
        }
        else{
            System.out.println("Not same");
        }
        if(s1==s3){
            System.out.println("Same String");
        }
        else{
            System.out.println("Not same");
        }
        System.out.println();

        if(s1.equals(s3)){
            System.out.println("Same String");
        }
        else{
            System.out.println("Not same");
        }

        //== check objects 
        //str1.equals(str2) checks values
    }
}
