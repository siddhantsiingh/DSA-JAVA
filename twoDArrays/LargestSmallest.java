package twoDArrays;

import java.util.Scanner;

public class LargestSmallest {
    public static void FindMaxMin(int matrix[][]){
        int n= matrix.length; //rows
        int m=matrix[0].length; //columns
        int largest=Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            for(int j=0; j<m;j++){
                if(matrix[i][j]<smallest){
                    smallest=matrix[i][j];
                }
                if(matrix[i][j]>largest){
                    largest=matrix[i][j];
                }
            }
            
        }
        System.out.println("Largest: "+ largest);
        System.out.println("Smallest: "+ smallest);

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
        FindMaxMin(matrix);



    }
}
