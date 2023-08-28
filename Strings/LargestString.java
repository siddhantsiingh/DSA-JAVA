package Strings;
/*Comparing string in lexograhic order
 * There are two inbuilt function str1.compareTo(str2) and str1.compareToIgnoreCase(str2)
 * There are three posibilites-0= same string , <0: -ve = str1<str2, >0: +ve = str1>str2
 */
public class LargestString {
    public static void main(String args[]){
        String fruits[]={"apple","mango","banana"};
        String largest=fruits[0];
        for(int i=1; i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest=fruits[i];
            }
        }
        System.out.println(largest);
    }
}
