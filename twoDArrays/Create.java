package twoDArrays;
import java.util.*;
public class Create {
    public static void main(String args[]){
        int matrix[][]= new int [3][3];
        int n= matrix.length; //rows
        int m=matrix[0].length; //columns

        System.out.println("No. of rows: "+ n);
        System.out.println("No. of columns: "+ m);
        System.out.println("No. ofelements: "+ n*m);

        //taking input
        Scanner sc= new Scanner(System.in);

        for(int i=0; i<n; i++){
            for(int j=0; j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println();

        //print
        for(int i=0; i<n; i++){
            for(int j=0; j<m;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
