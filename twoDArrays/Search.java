package twoDArrays;
import java.util.*;

public class Search {

    public static boolean SearchKey(int matrix[][], int key){
        int n= matrix.length; //rows
        int m=matrix[0].length; //columns

        for(int i=0; i<n; i++){
            for(int j=0; j<m;j++){
                if(matrix[i][j]==key){
                    System.out.println("("+i+","+j+")");
                    return true;
                }
            }
            
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String args[]){

        int matrix[][]= {{1,2,3},{4,5,6},{7,8,9}};
        int n= matrix.length; //rows
        int m=matrix[0].length; //columns

        Scanner sc=new Scanner(System.in);
        //print
        for(int i=0; i<n; i++){
            for(int j=0; j<m;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

        System.out.print("Enter the key: ");
        int key= sc.nextInt();

        SearchKey(matrix, key);



    }
}
