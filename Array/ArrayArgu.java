package Array;
public class ArrayArgu {
    public static void update(int marks[],int n){
        for(int i=0; i<marks.length; i++){
            marks[i] +=1;
        }
        n=n+5;
    }
    public static void main(String args[]){
       
        int marks[]= {98,77,80};
        int nonChangeble=10;
        update(marks, nonChangeble);

        for(int i=0; i<marks.length;i++){
            System.out.print(marks[i]+ " ");
        }
        System.out.println();
        System.out.println(nonChangeble);

    }
}
`                                                                                           `