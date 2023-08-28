package Strings;

public class ShortestPath {

    public static float Shortest(String path){
        int x=0,y=0;
        for(int i=0; i<path.length(); i++){

            if(path.charAt(i)=='N'){
                y++;
            }
            else if(path.charAt(i)=='S'){
                y--;
            }
            else if(path.charAt(i)=='W'){
                x--;
            }
            else if(path.charAt(i)=='E'){
                x++;
            }
        }
        int sum=(x*x) + (y*y);
        float distance =(float) Math.sqrt(sum);

        return distance;

        
    }
    public static void main(String args[]){
        String path="WNEENESENNN";
        System.out.println(Shortest(path));
        String path1="NS";
        System.out.println(Shortest(path1));
    }
}
